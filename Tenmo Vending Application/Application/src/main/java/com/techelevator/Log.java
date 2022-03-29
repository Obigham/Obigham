package com.techelevator;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.File;
import java.util.logging.SimpleFormatter;


public class Log {

    public Logger logger;                                                               //Logger.getLogger("My Log");
    FileHandler fileHandler;

    public Log(String file_Name) throws SecurityException, IOException {

        File logFile = new File(file_Name);

        if (!logFile.exists()) {
            logFile.createNewFile();
        }
        fileHandler = new FileHandler(file_Name,true);

        logger = Logger.getLogger("test");
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public void writeToLog(String msg){
        logger.info(msg);
    }

}
