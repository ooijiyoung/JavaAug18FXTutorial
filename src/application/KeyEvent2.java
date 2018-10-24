package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KeyEvent2 extends Application {

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField txt1;
		TextField txt2;
		Label lblnumber,answer;
		
		txt1 = new TextField();
		
	
		txt2 = new TextField();	
		
		txt2.setOnKeyPressed(new EventHandler<KeyEvent>()
	    {
	        @Override
	        public void handle(KeyEvent ke)
	        {
	            if (ke.getCode().equals(KeyCode.ENTER))
	            {
	                String input=txt1.getText();
	                if(Integer.parseInt(input)%2==0)
	                {
	                	txt2.setText("Even");
	                }
	                else
	                	txt2.setText("Odd");
	                	
	                
	            }
	        }
	    });
		
		txt2.requestFocus();
		
		lblnumber=new Label("Number to evaluate");
		answer = new Label("Answer(Even or Odd)");
		
		HBox hbox= new HBox();
		
		hbox.getChildren().addAll(lblnumber,txt1,answer,txt2);
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
