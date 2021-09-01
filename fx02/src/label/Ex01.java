package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding( new Insets(10) );
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
