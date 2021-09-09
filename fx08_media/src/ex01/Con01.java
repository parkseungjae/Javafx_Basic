package ex01;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Con01 {
	Parent root;
	
	public void setRoot(Parent root) {
		this.root =root;
	}
	
	public void a() {
		System.out.println("친구추가 버튼 클릭");
	}
	public void b() {
		System.out.println("이전으로 돌아가기 클릭");
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent newRoot = null;
		Scene scene = null;
		try {
			newRoot = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(newRoot);
		
		Stage stage = (Stage)root.getScene().getWindow();
		System.out.println("stage : "+stage);
		stage.setScene(scene);
		stage.show();
	}
}