package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Button bTop = new Button("Top");
		Button bLeft = new Button("Left");
		Button bCenter = new Button("Center");
		Button bRight = new Button("Right");
		Button bBottom = new Button("Bottom");
		
		BorderPane bp = new BorderPane();
		
		bp.setTop(bTop);
		bp.setCenter(bCenter);
		bp.setBottom(bBottom);
		bp.setRight(bRight);
		bp.setLeft(bLeft);
		
		bTop.setPrefSize(300, 20);
		
		
		arg0.setResizable(false);//사이즈 고정
		arg0.setScene(new Scene(bp,300,100));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
