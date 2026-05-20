package plcongg.app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
		Text text3 = new Text("a + b");

        // TextField
        TextField txtSo1 = new TextField();
        TextField txtSo2 = new TextField();
        TextField txtKQ = new TextField();

        // Button
        Button btnTinh = new Button("Tính tổng");
        Button btnXoa = new Button("Xóa");
        // Sự kiện nút bấm
        btnTinh.setOnAction(e -> {

            // lấy dữ liệu từ ô nhập
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());

            // tính tổng
            double tong = so1 + so2;

            // hiện kết quả
            txtKQ.setText(String.valueOf(tong));
        });
        
        btnXoa.setOnAction(e -> {
            txtSo1.clear();
            txtSo2.clear();
            txtKQ.clear();
        });
        // GridPane
        GridPane grid = new GridPane();

        grid.setMinSize(400, 200);
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setAlignment(Pos.CENTER);

        // add controls
        grid.add(text1, 0, 0);
        grid.add(txtSo1, 1, 0);

        grid.add(text2, 0, 1);
        grid.add(txtSo2, 1, 1);
        //tạo 2 nút vào 1 ô grid
        HBox hbox = new HBox(5);
        hbox.getChildren().addAll(btnTinh, btnXoa);
        grid.add(hbox, 1, 2);

        grid.add(text3, 0, 3);
        grid.add(txtKQ, 1, 3);

        // Scene
        Scene scene = new Scene(grid);

        // Stage
        primaryStage.setTitle("Tính tổng 2 số");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
