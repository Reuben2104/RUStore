package com.RUStore;

/**
 * This TestSandbox is meant for you to implement and extend to 
 * test your object store as you slowly implement both the client and server.
 * 
 * If you need more information on how an RUStorageClient is used
 * take a look at the RUStoreClient.java source as well as 
 * TestSample.java which includes sample usages of the client.
 */
public class TestSandbox{

	public static void main(String[] args) {

		// Create a new RUStoreClient
		RUStoreClient client = new RUStoreClient("localhost", 12345);

		// Open a connection to a remote service
		System.out.println("Connecting to object server...");
		try {
			client.connect();
			System.out.println("Established connection to server.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to connect to server.");
		}

	}

}
