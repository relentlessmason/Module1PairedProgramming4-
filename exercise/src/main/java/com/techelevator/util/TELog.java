package com.techelevator.util;

import java.io.*;
import java.util.Scanner;

public class TELog {
    static final boolean APPEND_TO_FILE = true;

    public static void log(String message) {
        String logDirectory = "./logs/search.log";
        File logFile = new File(logDirectory);

        if (!logFile.exists()) {
            try {
                boolean createLogFile = logFile.createNewFile();
                System.out.println("Log file does not exist. File created.");
                if (!createLogFile) {
                    throw new TELogException("Cannot create a log file.");
                }
            } catch (Exception e) {
                throw new TELogException(e.getMessage());
            }
        }

        if (logFile.exists()) {
            try (PrintWriter writeToFile = new PrintWriter(new FileOutputStream(logFile, APPEND_TO_FILE))) {
                writeToFile.println(message);
            } catch (Exception e) {
                throw new TELogException(e.getMessage());
            }
        }
    }
}

