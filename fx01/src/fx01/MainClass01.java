package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {

		Label lb = new Label("Hello World!!");
		lb.setFont( new Font(20) );
		//기초 화면 
		Scene scene = new Scene(lb,200,100);
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
