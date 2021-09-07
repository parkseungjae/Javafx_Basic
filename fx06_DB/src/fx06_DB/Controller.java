package fx06_DB;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Auser.LoginService;
import Auser.LoginServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{

	private Parent root;
	public static DBClass db;
	private common.db.DBClass comDB;
	private LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new DBClass();
		comDB = new common.db.DBClass();
		ls = new LoginServiceImpl();
	}

	public void membership() {
		TextField id = (TextField)root.lookup("#memberId");
		TextField name = (TextField)root.lookup("#memberName");
		TextField pwd = (TextField)root.lookup("#memberPwd");

		memberDTO dto = new memberDTO();
		dto.setId(id.getText());
		dto.setPwd(pwd.getText());
		dto.setName(name.getText());

		int result = db.insert(dto);
		Alert alert = new Alert(AlertType.INFORMATION);
		if(result == 1)   {alert.setContentText("회원가입에 성공하셨습니다.");}
		else {  alert.setContentText("동일한 아이디가 존재합니다.");}

		alert.show();
	}

	public void login() {
		ls.loginChk(root);
		/*
		TextField fxId = (TextField)root.lookup("#fxId");
		TextField fxPwd = (TextField)root.lookup("#fxPwd");

		memberDTO dto = db.loginChk(fxId.getText());
		Alert alert = new Alert(AlertType.INFORMATION);
		if(dto != null) {
			if(dto.getPwd().equals(fxPwd.getText())) {
				alert.setContentText("로그인 성공");
				alert.show();
			}else {
				alert.setContentText("비밀번호가 맞지않습니다.");
				alert.show();

			}
		}else {
			alert.setContentText("아이디가 존재하지않습니다.");
			alert.show();
		}*/

	}

}


