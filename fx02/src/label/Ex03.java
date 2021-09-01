package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));

		Label lbl = new Label("A label that needs to be wrapped");
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);

		lbl.setWrapText(true);
		lbl.setFont(new Font(20));//폰트크기
		lbl.setRotate(45);
		lbl.setTranslateY(100);//Y축을 수만큼 내려줌

		lbl.setOnMouseClicked(e->{//e = 람다식
			lbl.setRotate(0);
			lbl.setTranslateY(0);//Y축을 수만큼 내려줌
		});

		arg0.setScene(new Scene(hbox,300,300));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
