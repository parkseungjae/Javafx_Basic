package ex01;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;//이미지 표기명을 받을 변수
	private SimpleStringProperty image;//이미지 이름을 받을 변수
	
	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}
	
	public String getSmartPhone() {
		return smartPhone.get();
	}
	public void setSmartPhone(String smartPhone) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
	}
	public String getImage() {
		return image.get();
	}
	public void setImage(String image) {
		this.image = new SimpleStringProperty(image);
	}
	
}
