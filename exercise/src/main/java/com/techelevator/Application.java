package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.util.TELog;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search application started");
			
			// Step Four: Instantiate a Search Domain
			//

			SearchDomain search = new SearchDomain("data");

			TELog.log(search.toString());
			// Step Six: Single word search




			
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
