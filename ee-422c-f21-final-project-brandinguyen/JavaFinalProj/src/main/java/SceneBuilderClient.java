/*
 * EE422C Final Project submission by
 * Replace <...> with your actual data.
 * Brandi Nguyen
 * bcn444
 * 17805
 * Spring 2021
 */

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Parent;

import javax.management.Notification;

/*
 * This code is for starting out your JavaFX application from SceneBuilder
 */

// TODO: change to Client extends Application
public class SceneBuilderClient extends Application {

//    ClientController controller;
//    ObjectInputStream reader;
//    ObjectOutputStream writer;

    @Override
    public void start(Stage primaryStage) throws Exception{

//        FXMLLoader fxmlLoader = new FXMLLoader();
//        Parent root = fxmlLoader.load(getClass().getResource("client.fxml").openStream());
//        controller = fxmlLoader.getController();

        //new stage for customer username and password
        StackPane pane = new StackPane();
        primaryStage.setTitle("Customer");
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        //second stage for bidding auction
        Stage secondStage = new Stage(); // creates a second stage for bidding auction
        secondStage.setX(850);
        secondStage.setY(850);
        secondStage.setTitle("Auction");
        StackPane paneTwo = new StackPane();
        //creates second scene
        Scene sceneTwo = new Scene(paneTwo, 500, 500); // creates a second scene object with the stack pane
        secondStage.setScene(sceneTwo); // puts the scene onto the second stage

        //bid button and input for auction scene
        Button bidButton = new Button("Bid");	// create a Button object
        pane.getChildren().add(bidButton);
        bidButton.setTranslateY(100);
        bidButton.setTranslateX(100);
        TextField bidTextField = new TextField("Enter bid amount here");
        bidTextField.setMaxWidth(105);
        bidTextField.setTranslateY(100);
        bidTextField.setMaxWidth(150);
        pane.getChildren().add(bidTextField);
        paneTwo.getChildren().add(bidButton);
        paneTwo.getChildren().add(bidTextField);

        //buy it now button
        Button buyNowButton = new Button("Buy It Now ($" + Item.getAutoWin() + ")");	// create a Button object
        paneTwo.getChildren().add(buyNowButton);
        buyNowButton.setTranslateY(140);

        //item features text
        Text nameText = new Text("Item: " + Item.getName());
        paneTwo.getChildren().add(nameText);
        nameText.setTranslateY(-200);

        Text descriptionText = new Text("Description: " + Item.getDescription());
        paneTwo.getChildren().add(descriptionText);
        descriptionText.setTranslateY(-150);

        Text currentBidText = new Text("Minimum Bid: " + Double.toString(Item.getMinPrice() + Params.MIN_BID_INCREASE));
        paneTwo.getChildren().add(currentBidText);
        currentBidText.setTranslateY(-100);

        //TODO: thirdStage.show(); when u need bid notifications - u should only show this after logging in btw
        // you should organize your 3 stages so that they popup in a nice fashion, meaning they dont overlap and the UI makes sense
        //third stage for notifications
        Stage thirdStage = new Stage(); // creates a third stage for notifications
        thirdStage.setX(650);
        thirdStage.setY(650);
        thirdStage.setTitle("Notifications");
        StackPane paneThree = new StackPane();
        //creates third scene
        Scene sceneThree = new Scene(paneThree, 200, 200); // creates a third scene object with the stack pane
        thirdStage.setScene(sceneThree); // puts the scene onto the third stage
        Text notificationText = new Text();
        Text highestBidText = new Text();
        highestBidText.setText("Current highest bid = $" + Item.getMinPrice());
        highestBidText.setTranslateY(50);
        paneThree.getChildren().add(highestBidText);

        //check if invalid, if so outputs correct notification
        if (Item.isValidBid(0).equals("true")) {
            notificationText.setText(Item.isValidBid(0));
        }
        else {
            notificationText.setText(Item.getHighestBidder() + " bids $" + Item.getMinPrice() + " on " + Item.getName());
        }
        paneThree.getChildren().add(notificationText);

        //username
        Text userNameText = new Text();
        userNameText.setText("Username");
        pane.getChildren().add(userNameText);
        userNameText.setTranslateX(-100);
        TextField userNameTextField = new TextField("Username");
        userNameTextField.setMaxWidth(125);
        pane.getChildren().add(userNameTextField);

        //password
        Text passwordText = new Text();
        passwordText.setText("Password");
        pane.getChildren().add(passwordText);
        passwordText.setTranslateX(-100);
        passwordText.setTranslateY(50);
        TextField passwordTextField = new TextField("Password (Optional)");
        passwordTextField.setMaxWidth(125);
        passwordTextField.setTranslateY(50);
        pane.getChildren().add(passwordTextField);

        //login button
        Button login = new Button("Login");	// create a Button object
        pane.getChildren().add(login);
        login.setTranslateY(150);

        //action button for login
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                Client client = new Client();
//                System.out.println(userNameTextField.getText());
//                client.processLogin(userNameTextField.getText());
                secondStage.show();
                thirdStage.show();
            }
            //TODO: fix this !!!(client log in back end)
            //Client.processLogin(guestText.getText());
        });

        //quit button
        Button quit = new Button("Quit");	// create a Button object
        pane.getChildren().add(quit);
        quit.setTranslateY(150);
        quit.setTranslateX(50);

        //action button for quit
        quit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

//        controller.myClient = this;
//        customer = new Customer("", "");
//
//        connectToServer();
    }

//    void connectToServer () {
//        int port = 5000;
//        try {
//            Socket sock = new Socket("localhost", port);
//            writer = new ObjectOutputStream(sock.getOutputStream());
//            reader = new ObjectInputStream(sock.getInputStream());
//            System.out.println("networking established");
//            Thread readerThread = new Thread(new IncomingReader()); // see Canvas's Chat for IncomingReader class
//            readerThread.start();
//
//        } catch (IOException e) {}
//    }
//
//    ClientController getController () { return controller; }
}
