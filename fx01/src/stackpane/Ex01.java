package stackpane;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		StackPane sp = new StackPane();		
		
		arg0.setTitle("StackPane");
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
