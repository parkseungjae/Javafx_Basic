package quiz.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz.loginService.LoginService;
import quiz.loginService.LoginServiceImpl;
import quiz.member.MemberService;
import quiz.member.MemberServiceImpl;

public class MainController implements Initializable{

	private Parent root;
	MemberService ms;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
		ls.setRoot(root);
	}
	
	public void btnOk(){
		//System.out.println("ok");
		ls.loginCheck();
	}
	public void btnCancel(){
		//System.out.println("can");
		ls.loginClose();
	}
	public void btnMembership(){
		//System.out.println("mem");
		ms.memberShip();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemberServiceImpl();
		ls = new LoginServiceImpl();
	}

}
