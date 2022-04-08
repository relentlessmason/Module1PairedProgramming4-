package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search application started");

			// Step Four: Instantiate a Search Domain

			SearchDomain search = new SearchDomain("data");
			TELog.log(search.toString());

			// Step Six: Single word search
			System.out.println("Single Word Search");
			SearchEngine searchWord = new SearchEngine(search);
			searchWord.indexFiles();
			List<String> filesWithWord = searchWord.search("squirrel");
			for (String file: filesWithWord) {
				if (filesWithWord.size() > 0) {
					System.out.println(search.getFolder() + "/" + file);
				} else {
					System.out.println("N/A - No files contain searched word.");
				}
			}

			// Step Seven: Multiple word search
			List<String> filesWithWord = searchWord.search("squirrel");
			for (String file: filesWithWord) {
				if (filesWithWord.size() > 0) {
					System.out.println(search.getFolder() + "/" + file);
				} else {
					System.out.println("N/A - No files contain searched word.");
				}
			}


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
