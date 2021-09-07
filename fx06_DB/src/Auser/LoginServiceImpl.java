package Auser;

import common.alert.AlertClass;
import fx06_DB.memberDTO;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{
	LoginDB db;
	public LoginServiceImpl() {
		db = new LoginDB();
	}

	@Override
	public void loginChk(Parent root) {
		TextField fxId = (TextField)root.lookup("#fxId");
		TextField fxPwd = (TextField)root.lookup("#fxPwd");

		memberDTO dto = db.loginChk(fxId.getText());
		Alert alert = new Alert(AlertType.INFORMATION);
		String msg = null;
		if(dto != null) {
			if(dto.getPwd().equals(fxPwd.getText())) {
				msg = "로그인 성공";
			}else {
				msg = "비밀번호가 맞지않습니다.";

			}
		}else {
			msg ="아이디가 존재하지않습니다.";

		}
		AlertClass.alert(msg);
	}

}
