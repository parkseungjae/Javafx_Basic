package quiz.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import quiz.common.CommonServiceImpl;

public class LoginServiceImpl implements LoginService {

	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void loginCheck() {
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPwd");
		System.out.println(tf.getText());
		System.out.println(pf.getText());
	}

	@Override
	public void loginClose() {
		CommonServiceImpl cs =new CommonServiceImpl();
		cs.setRoot(root);
		cs.WindowClose();
	}

}
