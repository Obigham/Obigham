import java.time.LocalDate;
import java.util.*;

public class RandomNameGenerator {


    public static void main(String[] args) {
        String rdmQ1 = "What brought you to Tech Elevator? ";
        String rdmQ2 = "What is a fun fact about you that you feel comfortable sharing?";
        String rdmQ3 = "What is one moment of success you have had in your TE bootcamp?";
        String rdmQ4 = "What do you know now that would help yourself a week ago and/or first week of Bootcamp?";
        String rdmQ5 = "How do you strike a balance between work, study and self-care?";

        String rdmQ6 = "What carreer/job did you have before TE? One highlight from that time.. " ;
        String rdmQ7 = "What is the most important school you have acquired? (personal opinion)" ;
        String rdmQ8 = "What is one moment of success you have had in your TE bootcamp?";
        String rdmQ9 = "Select (2) books you would like if stranded on a deserted island? ";
        String rdmQ10 = "What is one of your guilty pleasures? Tv show, game or activity";

        String rdmQ11 = "What did you have for breakfast?" ;
        String rdmQ12 = "What is your pets name? current or past" ;
        String rdmQ13 = "Where have you always wanted to go/visit?" ;
        String rdmQ14 = "How has your heritage/culture/background affected your life? ";
        String rdmQ15 = "Is a hotdog a sandwitch? what about a HotPocket?" ;

        LocalDate currentDate = LocalDate.now();
        String[] rdmQuestions = {rdmQ1, rdmQ2, rdmQ3, rdmQ4, rdmQ5, rdmQ6, rdmQ7, rdmQ8, rdmQ9, rdmQ10, rdmQ11, rdmQ12, rdmQ13, rdmQ14, rdmQ15};

        String[] studentNames = {"Omari Bigham", "Atul Mishra", "Eric Hilkowitz", "JT", "Lance Nines", "Luke Schlosser",
                "Jennifer Kang", "Abby Link", "Justin Redziniak", "Kelsey Lau",  "Natalie Riquelmy", "Shaun Carr",
                "Stefano Bernardini", "Kyle Irwin", "Justin Yee",  "Kyle Martin", "Max Smith", "Denny Zheng",
                "Sharon Gershoni", "Adam Siry", "Andre Valines", "Andrew Chamnbers", "Andy Lieu", "Ashley White", "Ayesha Stewart",
                "Dan Jackowitz", "Daniel Suh", "Dave Kerill", "Dexter Conner", "Janaj Francis", "Justin Long", "Keith Carillo",
                "Kevin Prouty", "Lee Chan", "Marsha Johnson", "Nasya Gay", "Neil Haleem", "Nerlange  Jean-Louis", "Nicholas Beadling",
                "Omar Baylor", "Quinn di Girolamo", "Raija Eggert",  "Rashmi Negi", "Richard Savina", "Ronald Gonzalez",
                "Seth Zulinski", "Shae Christensen", "Steven Ngo", "Sultan El Jabali", "Susanne Clark", "Tai Chan", "Tanner Huseman",
                "Tasnim Choudry", "Ty Robinson", "Walter Beck", "Will Wolstenholme", "Zachary Zelouf", "Zachary Ford" };


        System.out.print("   WELCOME TO YOUR TECH ELEVATOR");
        System.out.print(": Cohort PHL/WILM 2022    ");
        System.out.println();
        System.out.println("              RANDOM NAME GENERATOR      ");
        System.out.println();
        System.out.println();
        System.out.println("Wouldn't it be nice to connect with, " + studentNames[new Random().nextInt(studentNames.length)] + " today.");
        System.out.println();
        System.out.println("To help break the ice why not try one of this prompts?");
        System.out.println();
        System.out.print("today: " + currentDate + " your RANDOM question is: ");
        System.out.println(rdmQuestions[new Random().nextInt(rdmQuestions.length)]);
    }
}
