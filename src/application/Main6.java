package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main6 extends Application{

	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MyNumber myNumber = new MyNumber();
		myNumber.numberProperty().addListener((observable , oleValue, newValue) -> {
			System.out.println(observable);
			System.out.println(oleValue);
			System.out.println(newValue);
		});
		myNumber.setNumber(10.0);
		
	}

}
