package chart;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChartViewClass {

	public void chartViewClass(){
		try {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("chartView.fxml"));
		Parent root = loader.load();

		Scene scene = new Scene(root);
		ChartViewController ctl = loader.getController();
		ctl.setRoot(root);

		stage.setTitle("결과보기");
		stage.setScene(scene);
		stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
