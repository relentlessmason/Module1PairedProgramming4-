package com.techelevator.util;

import java.io.*;
import java.util.Scanner;

public class TELog {
    public static void log(String message) {
        String logDirectory = "./logs/search.log";
        File logFile = new File(logDirectory);

        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
                System.out.println("Log file does not exist. File created.");
            }catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        if (logFile.exists()) {
            try (PrintWriter writeToFile = new PrintWriter(new FileOutputStream (logFile, true))){
                writeToFile.println(message);
            } catch (TELogException| FileNotFoundException e)  {
                System.err.println(e.getMessage());

            }
        }
    }

    public static void main(String[] args) {
        log("A message");
    }
}


