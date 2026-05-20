module BTapLamThem_AppCong {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens plcongg.app to javafx.graphics, javafx.fxml;
}
