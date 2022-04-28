package application;

import javafx.beans.property.*;
public class MyString {
	private StringProperty strProp = new SimpleStringProperty();
	
	public StringProperty stringProperty() {
		return strProp;
	}

	public String getString() {
		return strProp.get();
	}

	public void setString(String string) {
		this.strProp.set(string);;
	}

}
