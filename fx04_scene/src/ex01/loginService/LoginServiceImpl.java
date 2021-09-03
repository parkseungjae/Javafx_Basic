package ex01.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{

	@Override
	public void LoginProc(Parent root) {
		TextField fxId = (TextField)root.lookup("#fxId");
		PasswordField fxPwd = (PasswordField)root.lookup("#fxPwd");

		System.out.println(fxId.getText());
		System.out.println(fxPwd.getText());

	}

	@Override
	public void CancelProc(Parent root) {		
		TextField fxId = (TextField)root.lookup("#fxId");
		PasswordField fxPwd = (PasswordField)root.lookup("#fxPwd");
		fxId.clear();
		fxPwd.clear();

	}

	@Override
	public void OpenMembershipForm() {
		System.out.println("회원가입 버튼이 눌리었습니다.");
	}

}
