package plcongg.app;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Text
		Text text1 = new Text("a");
		Text text2 = new Text("b");
		Text text3 = new Text("Kết quả");
		
		//Text
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		
		//Button
		Button btnCong = new Button("+");
		Button btnTru = new Button("-");
		Button btnNhan = new Button("*");
		Button btnChia = new Button("/");
		Button btnXoa = new Button("Xóa");
		
		btnCong.setOnAction(e -> {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText(String.valueOf(a+b));
		});
		btnTru.setOnAction(e -> {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText(String.valueOf(a-b));
		});
		btnNhan.setOnAction(e -> {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText(String.valueOf(a*b));
		});
		btnChia.setOnAction(e -> {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText(String.valueOf(a/b));
		});
		btnXoa.setOnAction(e -> {
			tf1.clear();
			tf2.clear();
			tf3.clear();
		});
		//GridPane
		GridPane grid = new GridPane();
		grid.setMinSize(400, 200);
		grid.setPadding(new Insets(10,10,10,10));
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setAlignment(Pos.CENTER);
		
		grid.add(text1, 0, 0);
		grid.add(tf1, 1, 0);
		grid.add(text2, 0, 1);
		grid.add(tf2, 1, 1);
		//Hbox
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(btnCong,btnTru,btnNhan,btnChia,btnXoa);
		grid.add(hbox, 1, 2);
		grid.add(text3, 0, 3);
		grid.add(tf3, 1, 3);
		
		//Scene
		Scene sc = new Scene(grid);
		primaryStage.setTitle("Cộng trừ nhân chia 2 số");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
