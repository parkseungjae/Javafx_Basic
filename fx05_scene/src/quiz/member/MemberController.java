package quiz.member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import quiz.common.CommonServiceImpl;
import quiz.member_dto.MemberDTO;

public class MemberController implements Initializable{

	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("20대 미만", "20대", "30대", "40대 이상");
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void check() {
		TextField tx = (TextField)root.lookup("#fxName");
		if(tx.getText().isEmpty()) {
			alert("이름은 필수 항목입니다");
		}
	}
	public void alert(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	
	public void membershipProc() {
		System.out.println("회원가입 클릭");
		MemberDTO dto = new MemberDTO();
		
		check();
		
		dto.setName(((TextField)root.lookup("#fxName")).getText());
		//dto.setAge(getComboBox());
		//dto.setGender(getGender());
	}
	public void memberCancle() {
		System.out.println("취소 클릭");
		CommonServiceImpl cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.WindowClose();
	}

}
