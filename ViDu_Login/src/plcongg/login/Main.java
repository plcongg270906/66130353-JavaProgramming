package plcongg.login;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
		//setting the padding
		gridpane.setPadding(new Insets(10, 10, 10, 10));
		
		//setting the vertical and horizontal gaps between the columns
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		//setting the grid alignment
		gridpane.setAlignment(Pos.CENTER);
		//Arranging all the nodes in the grid
		gridpane.add(text1, 0, 0);
		gridpane.add(textField1, 1, 0);
		gridpane.add(text2, 0, 1);
		gridpane.add(textField2, 1, 1);
		gridpane.add(btn1, 0, 2);
		gridpane.add(btn2, 1, 2);
		
		//create a scene object
		Scene sc = new Scene(gridpane);
		//setting title to the stage
		primaryStage.setTitle("Example Login");
		//adding scene to the stage
		primaryStage.setScene(sc);
		//displaying the contents of the stage;
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
