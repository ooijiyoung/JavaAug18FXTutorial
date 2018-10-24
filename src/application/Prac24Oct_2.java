package application;
//Ooi Ji Young
//24 Oct, Practical Class
//Mouse Drag KEY EVENT
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Prac24Oct_2 extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 = new Button("<");
		Button btn2 = new Button(">");

		RadioButton rb1 = new RadioButton("Red");
		RadioButton rb2 = new RadioButton("Green");
		RadioButton rb3 = new RadioButton("Blue");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb3.setToggleGroup(tg);
		
		Text txt = new Text("Awesome");
		

		rb1.setOnAction(e->{
			txt.setFill(Color.RED);
		});
		
		rb2.setOnAction(e->{
			txt.setFill(Color.GREEN);
		});
		
		rb3.setOnAction(e->{
			txt.setFill(Color.BLUE);
		});
		
		btn1.setOnAction(e->{
			txt.setTranslateX(txt.getX()-50);
		});
		
		btn2.setOnAction(e->{
			txt.setTranslateX(txt.getX()+50);
		});
		Text newText = new Text(20,20,"Helloo World");
		Pane pane = new Pane();
		
		newText.setOnMouseDragged(e->{
			newText.setX(e.getX());
			newText.setY(e.getY());
		});
		
		
		newText.setOnKeyPressed(e->{
			switch(e.getCode()) {
				case DOWN: newText.setY(newText.getY() +10);break;
				case UP: newText.setY(newText.getY() -10);break;
				case LEFT: newText.setX(newText.getX() -10);break;
				case RIGHT: newText.setX(newText.getX() +10);break;
				default:
					System.out.println(e.getCode());
					if(Character.isLetterOrDigit(e.getText().charAt(0)))
						newText.setText(e.getText());
					break;
			}
		});
		
		pane.getChildren().addAll(newText);

		FlowPane fp = new FlowPane();
		fp.setHgap(10);
		fp.setPadding(new Insets(30, 30, 30, 30));
		fp.getChildren().addAll(rb1,rb2,rb3,txt,btn1,btn2);
		
		//Scene scene = new Scene(fp,500,200);  
		Scene scene = new Scene(pane,500,500);
		stage.setTitle("Practical W8"); 
		stage.setScene(scene); 
		stage.show(); 
		
		newText.requestFocus();
	}
	
	

	public static void main(String args[]) {
		launch(args);
	}
}
