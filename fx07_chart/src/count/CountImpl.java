package count;

import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class CountImpl implements Count{
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;		
	}
	
	public void getColumn() {
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
		
		if(	abRbo.isSelected()	) {
			System.out.println(abRbo.getText());
		}else if(inRbo.isSelected()) {
			System.out.println(inRbo.getText());
		}else if(nonRbo.isSelected()) {
			System.out.println(nonRbo.getText());
		}else {
			System.out.println("희망 여행지를 선택해주세요");
		}
		
		//tripResult
		
		if(age10Rbo.isSelected()) {
			System.out.println(age10Rbo.getText());
		}else if(age20Rbo.isSelected()) {
			System.out.println(age20Rbo.getText());
			
		}else if(age30Rbo.isSelected()) {
			System.out.println(age30Rbo.getText());
			
		}else if(age40Rbo.isSelected()) {
			System.out.println(age40Rbo.getText());
			
		}else {
			System.out.println("연령대를 선택해주세요");
		}
		
		if(man.isSelected()) {
			System.out.println(man.getText());
		}else if(woman.isSelected()) {
			System.out.println(woman.getText());
		}else {
			System.out.println("성별을 선택해주세요");
		}
		
	}
}
