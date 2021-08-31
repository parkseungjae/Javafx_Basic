package anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		Button btn01 = new Button("btn1");
		Button btn02 = new Button("btn2");

		AnchorPane.setTopAnchor(btn01, 10.0);
		AnchorPane.setRightAnchor(btn01, 10.0);

		AnchorPane.setBottomAnchor(btn02, 10.0);
		AnchorPane.setLeftAnchor(btn02, 10.0);

		ap.getChildren().addAll(btn01,btn02);
		arg0.setScene(new Scene(ap,300,300));


		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
