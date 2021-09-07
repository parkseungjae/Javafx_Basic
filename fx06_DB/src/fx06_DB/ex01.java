package fx06_DB;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex01 extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		primaryStage.setTitle("DB_Practice");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
