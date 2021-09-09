package count;

import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class CountImpl implements Count{
	Parent root;
	RadioButton abRbo = (RadioButton)root.lookup("#abroadRbo");
	RadioButton inRbo = (RadioButton)root.lookup("#insideRbo");
	RadioButton nonRbo = (RadioButton)root.lookup("#nonRbo");

	RadioButton age10Rbo = (RadioButton)root.lookup("#age10Rbo");		
	RadioButton age20Rbo = (RadioButton)root.lookup("#age20Rbo");		
	RadioButton age30Rbo = (RadioButton)root.lookup("#age30Rbo");		
	RadioButton age40Rbo = (RadioButton)root.lookup("#age40Rbo");		

	RadioButton man = (RadioButton)root.lookup("#maleRbo");
	RadioButton woman = (RadioButton)root.lookup("#femaleRbo");

	String tripResult = null;
	String ageResult = null;
	String genderResult = null;

	@Override
	public void setRoot(Parent root) {
		this.root = root;		
	}

	public String getColumnTrip() {

		if(	abRbo.isSelected()	) {
			return abRbo.getText();
		}else if(inRbo.isSelected()) {
			return inRbo.getText();
		}else if(nonRbo.isSelected()) {
			return nonRbo.getText();
		}else {
			return null;
		}
	}
	//tripResult
	public String getColumnAge() {

		if(age10Rbo.isSelected()) {
			return age10Rbo.getText();
		}else if(age20Rbo.isSelected()) {
			return age20Rbo.getText();

		}else if(age30Rbo.isSelected()) {
			return age30Rbo.getText();

		}else if(age40Rbo.isSelected()) {
			return age40Rbo.getText();

		}else {
			return null;
		}
	}
	public String getColumnGender() {

		if(man.isSelected()) {
			return man.getText();
		}else if(woman.isSelected()) {
			return woman.getText();
		}else {
			return null;
		}
	}
	/*
	public int setAnswerCode() {
		int code = 1;
		//code 중복 방지처리 (집계혼란방지) DBClass의 Code 체크
		return code;
	}*/
}

