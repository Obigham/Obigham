package com.techelevator;

import com.techelevator.view.Menu;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class VendingMachineCLI {

	private static final String MM_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MM_OPTION_PURCHASE = "Purchase";
	private static final String MM_OPTION_EXIT = "Exit";
	private static final String[] MM_OPTIONS = { MM_OPTION_DISPLAY_ITEMS, MM_OPTION_PURCHASE, MM_OPTION_EXIT };


	private static final String PM_FEED_MONEY = "Feed Money";
	private static final String PM_SELECT_ITEM = "Select Item";
	private static final String PM_COMPLETE_TRANSACTION = "Complete Transaction";
	private static final String[] PM_OPTIONS = {PM_FEED_MONEY, PM_SELECT_ITEM, PM_COMPLETE_TRANSACTION};


	private VendingMachine vendMachine;
	private Menu menu;


	public VendingMachineCLI(Menu menu) {
		vendMachine = new VendingMachine();  															//initializing the vending machine.
		this.menu = menu;
	}


	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MM_OPTIONS);

			if (choice.equals(MM_OPTION_DISPLAY_ITEMS)) {
																										// display vending machine items
				DisplayItems();
			} else if (choice.equals(MM_OPTION_PURCHASE)) {
																										//display the purchase menu
				PurchaseMenu();
			} else if (choice.equals(MM_OPTION_EXIT)) {
																										//exit and close out program
				System.out.println("Thanks for shopping with us today!");
				System.exit(0);
			}
		}
	}


	private void DisplayItems() {
																										//get Map of items
		Map<String, Item> stock = vendMachine.getStock();
																										//get all keys to sort them
		List<String> itemSlots = new ArrayList<>(stock.keySet());
																										//sort the list
		Collections.sort(itemSlots);

		for(String slot : itemSlots) {
			Item item = stock.get(slot);
			int n = item.getQuantity();

			String display;
			String soldOut = slot + " " + item.getName() + ", costs " + item.getPrice() + ", (SOLD OUT) none remaining";
			String normal = slot + " " + item.getName() + ", costs " + item.getPrice() + ", (" + n + ") remaining";

			display = n <= 0 ? soldOut : normal;
			System.out.println(display);


		}
	}


	public void PurchaseMenu() {

		while (true) {

			System.out.println("");
			System.out.println("         WELCOME TO THE PURCHASE MENU            ");
			System.out.println("");
			System.out.println("Current balance: " + vendMachine.getCurrencyHeld());      						  //get current Balance

			String choice = (String) menu.getChoiceFromOptions(PM_OPTIONS);

			if (choice.equals(PM_FEED_MONEY)) {

				BigDecimal feedAmount = null;                                               					 //initializing as null

				System.out.println();
				System.out.println("Acceptable Bills (1, 2, 5 & 10)");
				System.out.print("How much money do you want to put in?");
				try {
					feedAmount = new BigDecimal(menu.getInput());                      							  //getting money added by user

					if (vendMachine.FeedMoney(feedAmount.stripTrailingZeros())) {
						System.out.println(feedAmount + " added to Vending Machine.");
							try {
								Log vendLog = new Log("log.txt");
								vendLog.logger.info("initial balance: " + feedAmount.toString() + ", final balance: " + feedAmount.toString());
							} catch (Exception e){}
//						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//						LocalDateTime now = LocalDateTime.now();
//
//						PrintLog pL = new PrintLog();
//						pL.printToLog(dtf.format(now) + " MethodName or ItemPurchased" + "init bal" + "finbal");


					} else {
						System.out.println("Please enter a valid amount of money.");
						feedAmount = null;
					}
				} catch (NumberFormatException nfe) {                               									 //user enters invalid number so feedamount is still null
					System.out.println("Please enter a valid number.");
				}
			} else if (choice.equals(PM_SELECT_ITEM)) {
				System.out.println();
				System.out.println("  THE VENDO-MATIC 800  ");
				System.out.println("  offers these items  ");
				System.out.println();
				System.out.println();
				System.out.println("SLOT - ITEM NAME - PRICE - QUANTITY");
				DisplayItems();

				System.out.println();
				System.out.println("What product would you like to buy today?");                                        //user is asked what they want to buy
				System.out.println("           (please enter slot)           ");
				try {
					String itemSelection = menu.getInput();                                                                //vending the selected item and display message

					vendMachine.DispenseItem(itemSelection.toUpperCase());

				} catch (NullPointerException NPE) {
					System.out.println("Invalid slot selection");
				}
			}
				if (choice.equals(PM_COMPLETE_TRANSACTION)) {

					System.out.println();
					System.out.println(vendMachine.FinalizeTransaction());

					System.out.println("Thanks for shopping with us today!");
					break;
				}
			}
		}


	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();

	}
	}



