package Quiz;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	@FXML private TextField idField;
	@FXML private PasswordField pwField;
	@FXML private Button loginbtn;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Alert alt = new Alert(AlertType.INFORMATION);
		alt.setTitle("메세지");
		alt.setHeaderText("메세지");
		loginbtn.setOnAction(e->{
			if(	idField.getText().isEmpty()) {
				alt.setContentText("id를 입력해야합니다");
				alt.show();
			}else if(pwField.getText().isEmpty()) {
				alt.setContentText("pw를 입력해야합니다");
				alt.show();				
			}else {
				MyDB db = new MyDB();
				if(db.getTable().containsKey(idField.getText()) && db.getTable().containsValue(pwField.getText())) {
					alt.setContentText("로그인 성공");
					alt.show();									
				}else {
					alt.setContentText("로그인 실패");
					alt.show();				

				}
			}
			
		});	
	}
}
