package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
	Stage windown;
	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		windown = primaryStage;
		
		// Scenel 
		Label label = new Label("Go To Scene 2");
		Button btn1 = new Button("Click me!!!!");
		btn1.setOnAction(event -> {
			System.out.println("Click btn1");
			primaryStage.setScene(scene2);
		});
		VBox layout1 = new VBox();
		layout1.getChildren().addAll(label , btn1);
		scene1 = new Scene(layout1 , 300, 300);
		
		// Scene2
		Button btn2 = new Button("Click me again!!!");
		btn2.setOnAction(event -> {
			primaryStage.setScene(scene1);
			System.out.println("Click Btn2");
		});
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(btn2);
		scene2 = new Scene(layout2 , 200 , 300);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}

}
