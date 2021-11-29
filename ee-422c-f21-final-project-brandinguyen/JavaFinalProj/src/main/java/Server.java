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
import java.net.ServerSocket;
import java.net.Socket;


/*
 * Author: Vallath Nandakumar and the EE 422C instructors.
 * Data: April 20, 2020
 * This starter code assumes that you are using an Observer Design Pattern and the appropriate Java library
 * classes.  Also using Message objects instead of Strings for socket communication.
 * See the starter code for the Chat Program on Canvas.
 * This code does not compile.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.*;

//public class Server {
//// extends Observable {
//        static Server server;
//
//        public static void main(String[] args) throws IOException {
//            ServerSocket ss = new ServerSocket(4999);
//            Socket s = ss.accept();
//            server = new Server();
//            server.populateItems();
//           server.SetupNetworking();
//        }
//
//        private void SetupNetworking() {
//            int port = 5000;
//            try {
//                ServerSocket ss = new ServerSocket(port);
//                while (true) {
//                    Socket clientSocket = ss.accept();
//                    ClientObserver writer = new ClientObserver(clientSocket.getOutputStream());
//                    Thread t = new Thread(new ClientHandler(clientSocket, writer));
//                    t.start();
//                    addObserver(writer);
//                    System.out.println("got a connection");
//                }
//            } catch (IOException e) {}
//        }
//
//        class ClientHandler implements Runnable {
//            private  ObjectInputStream reader;
//            private  ClientObserver writer; // See Canvas. Extends ObjectOutputStream, implements Observer
//            Socket clientSocket;
//
//        public ClientHandler(Socket clientSocket, ClientObserver writer) {
//			//...
//        }
//
//        public void run() {
//			//...
//        }
//    } // end of class ClientHandler

//public class Server extends Observable {
//
//    public static void main(String[] args) {
//        new Server().runServer();
//    }
//
//    private void runServer() {
//        try {
//            setUpNetworking();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return;
//        }
//    }
//
//    private void setUpNetworking() throws Exception {
//        @SuppressWarnings("resource")
//        ServerSocket serverSock = new ServerSocket(4242);
//        while (true) {
//            Socket clientSocket = serverSock.accept();
//            System.out.println("Connecting to... " + clientSocket);
//
//            ClientHandler handler = new ClientHandler(this, clientSocket);
//            this.addObserver(handler);
//
//            Thread t = new Thread(handler);
//            t.start();
//        }
//    }
//
//    public void processLogin(String input) {
//            this.setChanged();
//            this.notifyObservers(input);
//    }
//
//        //TODO 1: read in a text file and store the items, descriptions, and minimum price in separate maps (can use a hashmap<item id, ?>
//        // ? above represents item name, description, price, etc basically any item attr
//        // look up the file format, but if they give you one use CSV
//        private void populateItems() throws IOException {
//            List<Item> items = new ArrayList<>();
//            //TODO: change to read in actual file
//            String file = "finalproject/file.txt";
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//
//            String itemString;
//            while ((itemString = bufferedReader.readLine()) != null) {
//                String[] arrOfStr = itemString.split(",");
//                Item item = new Item(arrOfStr[0], arrOfStr[2], Double.valueOf(arrOfStr[1]));
//                items.add(item);
//            }
//            bufferedReader.close();
//        }
//
//        private void updatePrice(Item item, double newPrice, String name) {
//            if (item.isValidBid(newPrice).equals("true")) {
//                item.setMinPrice(newPrice);
//                item.setHighestBidder(name);
//                //TODO: alertNewPrice();
//                //TODO: fix this Item.checkAuctionTermination(Item, newPrice);
//            }
//        }
//
//        private static boolean login() {
//            return true;
//        }
//
//    }