/*
 * EE422C Final Project submission by
 * Replace <...> with your actual data.
 * Brandi Nguyen
 * bcn444
 * 17805
 * Spring 2021
 */

import java.net.*;
import java.io.*;

/*
 * This starter code is from the MultiThreadChat example from the lecture, and is on Canvas. 
 * It doesn't compile.
 */

//    public class ChatClient extends Application {
//	    // I/O streams
//	    ObjectOutputStream toServer = null;
//	    ObjectInputStream fromServer = null;
//
//
//	@Override
//	public void start(Stage primaryStage) {
//		BorderPane mainPane = new BorderPane();
//
//		// Create a scene and place it in the stage
//		Scene scene = new Scene(mainPane, 450, 200);
//		primaryStage.setTitle("finalproject.Client"); // Set the stage title
//		primaryStage.setScene(scene); // Place the scene in the stage
//		primaryStage.show(); // Display the stage
//
//		XX.setOnAction(e -> {
//		});  // etc.
//
//		try {
//			// Create a socket to connect to the server
//			@SuppressWarnings("resource")
//			Socket socket = new Socket("localhost", 8000);
//
//			// Create an input stream to receive data from the server
//			fromServer = new ObjectInputStream(socket.getInputStream());
//
//			// Create an output stream to send data to the server
//			toServer = new ObjectOutputStream(socket.getOutputStream());
//		}
//		catch (IOException ex) {
//		}
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

//THE GOOD SHIT

//import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//class Client {
//
//	private static String host = "127.0.0.1";
//	private BufferedReader fromServer;
//	private PrintWriter toServer;
//	private Scanner consoleInput = new Scanner(System.in);
//
//	public Client(){
//		try {
//			this.setUpNetworking();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void setUpNetworking() throws Exception {
//		@SuppressWarnings("resource")
//		Socket socket = new Socket(host, 4242);
//		System.out.println("Connecting to... " + socket);
//		fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		toServer = new PrintWriter(socket.getOutputStream());
//
//		Thread readerThread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				String input;
//				try {
//					while ((input = fromServer.readLine()) != null) {
//						System.out.println("From server: " + input);
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//
//		Thread writerThread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					String input = consoleInput.nextLine();
//                    processLogin(input);
//				}
//			}
//		});
//
//		readerThread.start();
//		writerThread.start();
//	}
//
//    protected void processLogin(String input) {
//        System.out.println("Sending to server the guest's username: " + input);
//        toServer.println(input);
//        toServer.flush();
//	}
//
//}