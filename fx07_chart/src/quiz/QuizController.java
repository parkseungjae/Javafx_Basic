package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import chart.ChartViewClass;
import common.Exit;
import common.ExitImpl;
import count.Count;
import count.CountImpl;
import database.DBClass;
import database.answerDTO;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class QuizController implements Initializable{

	Parent root;
	Exit ex;
	ChartViewClass cvc;
	Count cnt;
	DBClass db;
	answerDTO dto;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ex = new ExitImpl();
		cvc = new ChartViewClass();
		cnt = new CountImpl();
		db = new DBClass();
	}
	
	public void submitBtn() {
	//	System.out.println("확인");
		cnt.setRoot(root);
		/*dto.setTrip(cnt.getColumnTrip());
		dto.setAge(cnt.getColumnAge());
		dto.setGender(cnt.getColumnGender());
		*/
		db.insert(dto);
	}
	public void cancelBtn() {
	//	System.out.println("취소");
		ex.setRoot(root);
		ex.exitProc();
	}
	public void chartView() {
		System.out.println("결과보기");		
		cvc.chartViewClass();

	}

	
	
}
