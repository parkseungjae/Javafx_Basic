package button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button();
		btn.setGraphic(new ImageView("/img/img/smilerere.png"));
		btn.setLayoutX(90); btn.setLayoutY(80);

		Button btn2 = new Button();
		ImageView img = new ImageView("/img/img/smilerere.png");
		img.setFitHeight(40); img.setFitWidth(40);
		btn2.setGraphic(img);

		btn2.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");//gransparent 배경색과 바탕색을 맞춰라

		btn2.setOnMousePressed(e->{
			btn2.setStyle("-fx-background-color:transparent;-fx-padding: 15 10 10 10;");//gransparent 배경색과 바탕색을 맞춰라
		});

		btn2.setOnMouseReleased(e->{
			btn2.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");//gransparent 배경색과 바탕색을 맞춰라

		});
		
		btn.setOnAction(e->{
			Alert at = new Alert(AlertType.ERROR);
			at.setTitle("ERROR");
			at.setHeaderText("BUTTON EVENT");
			at.setContentText("Button has clicked");
			at.show();
		});

		canvas.getChildren().addAll(btn,btn2);
		canvas.setPrefSize(400, 400);

		arg0.setTitle("Button");
		arg0.setResizable(false);
		arg0.setScene( new Scene(canvas) );
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
