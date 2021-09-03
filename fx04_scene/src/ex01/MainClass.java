package ex01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws IOException {
		//Loader로 fxml 호출
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		//loader.load -> Parent로 Pane을 생성
		//이와같이 분리해서 진행할경우 Controller를 객체로 가져올 수 있다.
		Parent root = loader.load();
		Scene scene = new Scene(root);
		//Controller 객체로 호출
		Controller ctl = loader.getController();//Controller.java
		ctl.setRoot(root);
		
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
