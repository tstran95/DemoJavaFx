package application.main8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField height;
	
	public void submit(ActionEvent event) {
		String heightTextField = height.getText();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Chiều cao của bạn là : " + heightTextField + " cm");
	}
}
