package com.RUStore;

/* any necessary Java packages here */

public class RUStoreServer {

	/* any necessary class members here */

	/* any necessary helper methods here */

	/**
	 * RUObjectServer Main(). Note: Accepts one argument -> port number
	 */
	public static void main(String args[]){

		// Check if at least one argument that is potentially a port number
		if(args.length != 1) {
			System.out.println("Invalid number of arguments. You must provide a port number.");
			return;
		}

		// Try and parse port # from argument
		int port = Integer.parseInt(args[0]);


		// Implement here //


	}

}
