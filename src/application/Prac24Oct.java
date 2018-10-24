package application;
//Ooi Ji Young
//24 Oct, Practical Class
//Inner class
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Prac24Oct extends Application{
	final String MONKEY = "DINOSAUR";
	Text txt;
	@Override
	public void start(Stage stage) throws Exception {
		Button btnChange = new Button("Change");
		//Label lblLabel = new Label("Crocodle");
		txt = new Text("Crocodle");
		
		//btnChange.setOnAction(new ButtonHandler2()); //inner class
		
		
		//ANNYOMOUS CLASS
//		btnChange.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent arg0) {
//				txt.setText("MONKEY");
//			}	
//		});
		
		//single line LAMDA
		btnChange.setOnAction(e->txt.setText("MONKEY"));
			
		//LAMDA EXPRESSION
		btnChange.setOnAction(e->{
			txt.setText(MONKEY);
			System.out.println("Wooo!");
		});
		
		
		
		FlowPane fp = new FlowPane();
		fp.setHgap(10);
		fp.getChildren().addAll(btnChange,txt);
		
		Scene scene = new Scene(fp);  
		stage.setTitle("Practical W8"); 
		stage.setScene(scene); 
		stage.show(); 
	}
	
	class ButtonHandler2 implements EventHandler<ActionEvent>{

		public void handle(ActionEvent arg0) {
			txt.setText("MONKEY");
			
		}
		
	}

	public static void main(String args[]) {
		launch(args);
	}
}
