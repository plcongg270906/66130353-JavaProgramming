package plcongntu.HelloJavaFX003mavenSimple;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		btn.setText("Xin chào JavaFX");
		//Tạo cửa sổ
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		//Màn hình
		Scene scn = new Scene(root, 400, 200);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}