module com.example.c4d {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;


	opens com.example.c4d to javafx.fxml;
	exports com.example.c4d;
}