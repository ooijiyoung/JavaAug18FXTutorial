package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Tutorial8 extends Application{
	public static void main(String args[]) {
		launch(args);
	}


	public void start(Stage stage) throws Exception {
		
		
		FlowPane fp = new FlowPane();
		HBox hbox = new HBox();
		RadioButton rbCircle = new RadioButton("Circle");
		RadioButton rbSquare = new RadioButton("Square");
		RadioButton rbEllipse = new RadioButton("Ellipse");
		final ToggleGroup tg = new ToggleGroup();
		rbCircle.setToggleGroup(tg);
		rbSquare.setToggleGroup(tg);
		rbEllipse.setToggleGroup(tg);
		
		fp.setAlignment(Pos.CENTER);
		CheckBox cbFill = new CheckBox("Fill");
		Rectangle square = new Rectangle(50,50,200,200);
		Circle circle = new Circle(50,50,100);
		Ellipse ellipse = new Ellipse(50,50,150,100);

		square.setFill(Color.WHITE);
		square.setStroke(Color.BLACK);
		square.setStrokeWidth(2);
		
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(2);
		
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		ellipse.setStrokeWidth(2);
		
		fp.setMinSize(200, 300);
		
		rbCircle.setOnAction(e->{
			fp.getChildren().clear();
			fp.getChildren().add(circle);
		});
		rbSquare.setOnAction(e->{
			fp.getChildren().clear();
			fp.getChildren().add(square);
		});
		rbEllipse.setOnAction(e->{
			fp.getChildren().clear();
			fp.getChildren().add(ellipse);
		});
		
		cbFill.setOnAction(e->{
			if(cbFill.isSelected()) {
				square.setFill(Color.RED);
				circle.setFill(Color.RED);
				ellipse.setFill(Color.RED);
			}else {
				square.setFill(Color.WHITE);
				circle.setFill(Color.WHITE);
				ellipse.setFill(Color.WHITE);
			}
			
		});
		
		hbox.getChildren().addAll(rbCircle,rbSquare,rbEllipse,cbFill);
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(20);
		VBox vbox = new VBox();
		vbox.getChildren().addAll(fp,hbox);
		Scene scene = new Scene(vbox);
		stage.setTitle("Tutorial 8"); 
		stage.setScene(scene); 
		stage.show(); 
		
	}
}
