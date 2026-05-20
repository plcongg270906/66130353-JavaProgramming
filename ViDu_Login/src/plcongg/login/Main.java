package plcongg.login;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//creating label email
		Text text1 = new Text("Email");
		//creating label password
		Text text2 = new Text("Password");
		//creating text filed for email
		TextField textField1 = new TextField();
		//creating text filed for password
		PasswordField textField2 = new PasswordField();
		
		//create button
		Button btn1 = new Button("Submit");
		Button btn2 = new Button("Clear");
		//create a grid pane
		GridPane gridpane = new GridPane();
		//setting size for the pane
		gridpane.setMinSize(400, 200);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
