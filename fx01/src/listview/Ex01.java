package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> lv = new ListView<String>();
		lv.getItems().addAll("item1","item2","item3");
		lv.setPrefSize(100,100);
		lv.setLayoutX(20);
		lv.setLayoutY(20);
		
		ap.getChildren().add(lv);
		arg0.setScene(new Scene(ap,300,200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
