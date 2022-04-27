package application;


import javafx.beans.property.*;
public class MyNumber {
	private DoubleProperty number = new SimpleDoubleProperty();
	
	

	public DoubleProperty numberProperty() {
		return number;
	}

	public double getNumber() {
		return number.get();
	}

	public void setNumber(Double number) {
		this.number.set(number);;
	}
}