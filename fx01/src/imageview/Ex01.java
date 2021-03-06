package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/img/SmileReRe.png");
		//iv.setImage(new Image("/img/img/Calendar.png"));
		
		//iv.setFitHeight(100);//이미지 높이
		iv.setFitWidth(50);//이미지 너비
		iv.setPreserveRatio(true);//하나의 값에 맞춰 1:1비율로 맞춰줌
		iv.setRotate(45);//45도 시계방향으로 돌림
		
		ap.getChildren().addAll(iv);
		arg0.setScene(new Scene(ap,300,200));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
