package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import ex01.loginService.LoginServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

//fxml 파일과 연결시켜주는 역할만 진행된다, 즉 연산관련 작업을 진행해선 안된다.
//@FXML 을 통한 객체는 연결된 Controller 에서만 가능하다.
public class Controller implements Initializable{
	
	private Parent root;
	LoginServiceImpl lsi = new LoginServiceImpl();

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void LoginProc() {
		lsi.LoginProc(root);
	}
	
	public void CancelProc() {
		lsi.CancelProc(root);
		
	}
	public void OpenMembershipForm() {
		lsi.OpenMembershipForm();
	}
	//eventTest 의 TextField 얻어옴
	//TextField t = (TextField)root.lookup("#fxId");
	//System.out.println("@ 사용 : " +fxId.getText());
	//System.out.println( t.getText() );
	//t.clear();
}
