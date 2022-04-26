package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Hello World!!!!");

//			BorderPane root = new BorderPane();
//			Parent parent = new Button("Click Me!!!!");
			Button button = new Button();
			button.setText("Say Hello World");
			StackPane layout = new StackPane();
			layout.getChildren().add(button);
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
}
