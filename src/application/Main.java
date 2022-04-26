package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
	Button button1;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Hello World!!!!");

			button1 = new Button();
			button1.setText("Say Hello World!!!");
//			Button button2 = new Button();
//			button2.setText("Save The World!!!");
			
			StackPane layout = new StackPane();
			layout.getChildren().addAll(button1);
			button1.setOnAction(this);
			button1.setId("button1");
			Scene scene = new Scene(layout,300,250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource().equals(button1)) {
			System.out.println("Hello World!!!!");			
		}
		
	}
}
