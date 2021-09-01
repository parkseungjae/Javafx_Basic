package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		VBox vbox = new VBox(10);//안쪽 사이 거리
		CheckBox cb1 = new CheckBox("chk1");
		CheckBox cb2 = new CheckBox("chk2");
		
		cb2.setSelected(true);
		
		cb1.setText("오락");
		cb2.setText("게임");
		
		vbox.getChildren().addAll(cb1,cb2);
		
		arg0.setScene(new Scene(vbox,300,300));
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
