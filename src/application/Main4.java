package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Pair;

public class Main4 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Dialog<Pair<String, String>> dialog = new Dialog<Pair<String,String>>();
		dialog.setTitle("Login Dialog");
		dialog.setHeaderText("Sign Up");
		
		ButtonType loginButtonType = new ButtonType("Login" , ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(loginButtonType , ButtonType.CANCEL);
		
		GridPane grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(20, 100, 10,100));
		
		TextField userName = new TextField();
		userName.setPromptText("UserName");
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		
		grid.add(new Label("UserName"), 0, 0);
		grid.add(userName, 1, 0);
		grid.add(new Label("Password"), 0, 1);
		grid.add(password, 1, 1);
		
		Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
		loginButton.setDisable(true);
		
		userName.textProperty().addListener((observable , oldValue , newValue) -> {
			loginButton.setDisable(newValue.trim().isEmpty());
		});
		dialog.getDialogPane().setContent(grid);
		
		dialog.setResultConverter(dialogButton -> {
			if(dialogButton == loginButtonType) {
				return new Pair<>(userName.getText() , password.getText());
			}
			return null;
		});
		
		// Create Scene
		Label label = new Label("Login Success!!!");
		StackPane layout = new StackPane();
		layout.getChildren().addAll(label);
		Scene scene = new Scene(layout);
		
		Optional<Pair<String , String>> result = dialog.showAndWait();
		result.ifPresent(value -> {
			if ("Sontt".equals(value.getKey()) && "sontt".equals(value.getValue())) {
				primaryStage.setScene(scene);
				primaryStage.show();
			}
		});
	}

}
