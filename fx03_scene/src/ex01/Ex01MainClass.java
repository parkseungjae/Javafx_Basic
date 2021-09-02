package ex01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex01MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException{
		//eventTest 가져오기 -> root
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		//root -> scene 으로 넣기
		Scene scene = new Scene(root);
		//scene -> start();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
