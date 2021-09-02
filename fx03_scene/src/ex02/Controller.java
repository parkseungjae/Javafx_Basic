package ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private Button btn;//fxml파일의 id와 동일하게 입력해주어야한다.
	@FXML private TextField txtField;
	@FXML private TextField setField;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적으로 사용합니다.");
		btn.setOnAction(e->{
			txtPrint();
			setField.setText(txtField.getText());
			txtField.setText(null);
		});
	}
	public void txtPrint() {
		System.out.println(txtField.getText());
	}
}
