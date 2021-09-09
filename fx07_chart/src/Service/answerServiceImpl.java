package Service;

import count.Count;
import count.CountImpl;
import database.DBClass;
import database.answerDTO;
import javafx.scene.Parent;

public class answerServiceImpl implements answerService{
	DBClass db;
	Count cnt;
	public answerServiceImpl() {
		db = new DBClass();
		cnt = new CountImpl();
	}
	@Override
	public void answerChk(Parent root) {
		/*
		dto.setTrip(cnt.getColumnTrip());
		dto.setAge(cnt.getColumnAge());
		dto.setGender(cnt.getColumnGender());
		*/
		cnt.getColumnAge();
		cnt.getColumnAge();
		cnt.getColumnGender();
		
		//answerDTO dto = db.insert(dto);
		
	}

}
