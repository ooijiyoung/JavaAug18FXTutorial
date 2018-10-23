package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial7 extends Application {
//submit to padlet.com/kristoradion/tutor7
	public void start(Stage stage) throws Exception {
		BorderPane masterPane = new BorderPane();
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(20, 20, 20, 20)); 
		gp.setVgap(10); 
		gp.setHgap(10);
		
		
		//textbox and label
		Label lblTitle = new Label("Yellow Box Karaoke");
		lblTitle.getStyleClass().add("lblTitle");

		Label lblName = new Label("Name: ");
		Label lblEmail = new Label("Email: ");
		Label lblContact = new Label("Contact: ");
		Label lblWhen = new Label("When to come?: ");
		Label lblNoAdult = new Label("Number of Adult: ");
		Label lblNoKid = new Label("Number of Kid: ");
		Label lblLoc = new Label("Location: ");
		Label lblPay = new Label("Payment Method: ");
		
		TextField txtName = new TextField();
		TextField txtEmail = new TextField();
		TextField txtContact = new TextField();
		TextField txtNoAdult = new TextField();
		TextField txtNoKid = new TextField();
		
		ComboBox<String> cbWhen = new ComboBox<>();
		cbWhen.getItems().addAll("Lunch Hour (11am - 1pm)", "Happy Hour (1pm - 6pm)","Evening (6pm - 11pm");
		
		CheckBox chCheras = new CheckBox("Yellow Box Karaoke Cheras Selatan");
		CheckBox chMV = new CheckBox("Yellow Box Karaoke Mid Valley");
		CheckBox chKLCC = new CheckBox("Yellow Box Karaoke KLCC");
		
		final ToggleGroup tgGroup = new ToggleGroup();
		RadioButton rbCC = new RadioButton("Credit Card");
		rbCC.setToggleGroup(tgGroup);
		RadioButton rbC = new RadioButton("Cash");
		rbC.setToggleGroup(tgGroup);
		
		Button btnSubmit = new Button("CHECK OUT");
		
		GridPane gpInfo = new GridPane();
		gpInfo.setVgap(10); 
		gpInfo.setHgap(10);
		gpInfo.add(lblName, 0, 0);
		gpInfo.add(txtName, 1, 0);
		gpInfo.add(lblEmail, 0, 1);
		gpInfo.add(txtEmail, 1, 1);
		gpInfo.add(lblContact, 0, 2);
		gpInfo.add(txtContact, 1, 2);
		gpInfo.add(lblWhen, 0, 3);
		gpInfo.add(cbWhen, 1, 3);
		
		HBox hbNoPpl = new HBox();
		hbNoPpl.setSpacing(10);
		hbNoPpl.getChildren().addAll(lblNoAdult,txtNoAdult,lblNoKid,txtNoKid);
		hbNoPpl.setAlignment(Pos.CENTER);
		
		VBox vbLoc = new VBox();
		vbLoc.setSpacing(5);
		vbLoc.getChildren().addAll(lblLoc,chCheras,chMV,chKLCC);
		
		HBox hbPay = new HBox();
		hbPay.setSpacing(10);
		hbPay.getChildren().addAll(lblPay,rbCC,rbC);
		hbPay.setAlignment(Pos.CENTER_LEFT);
		
//		LEFT SIDE
		gp.add(lblTitle, 0, 0);
		gp.add(gpInfo, 0, 1);
		gp.add(hbNoPpl, 0, 2);
		gp.add(vbLoc, 0, 3);
		gp.add(hbPay, 0, 4);
		gp.add(btnSubmit, 0, 5);
		masterPane.setLeft(gp);
		
//	Right Side
		TextArea taOutput = new TextArea();
		masterPane.setRight(taOutput);
		
//function
		
	 btnSubmit.setOnAction((event)->{
		 String name = txtName.getText();
		 String email = txtEmail.getText();
		 String contact = txtContact.getText();
		 
		 String selection = cbWhen.getValue();
		 int whenIdx = cbWhen.getSelectionModel().getSelectedIndex();
		 
	 });
		
		Scene scene = new Scene(masterPane);  
		scene.getStylesheets().add("/application/Tutorial7.css");
		stage.setTitle("Tutorial 7"); 
		stage.setScene(scene); 
		stage.show(); 
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
