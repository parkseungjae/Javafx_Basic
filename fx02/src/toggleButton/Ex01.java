package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		ToggleButton tBtn = new ToggleButton("Toggle Button");//누르면 눌린상태 혹은 풀린 상태를 유지하는 버튼
		
		hbox.getChildren().addAll(tBtn);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
