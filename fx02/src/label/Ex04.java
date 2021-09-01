package label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		Label lbl = new Label("Value");
		lbl.setFont(new Font(32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);

		ap.getChildren().add(lbl);
		ap.setPrefSize(300, 200);

		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5);
				lbl.setScaleY(1.5);
			}
		};

		lbl.setOnMouseEntered(entered);
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1);
				lbl.setScaleY(1);
			}
		});
		
		lbl.setOnMousePressed(e->{
			lbl.setRotate(0);
		});
		
		lbl.setOnMouseReleased(e->{
			lbl.setRotate(45);
		});
		

		arg0.setScene( new Scene(ap) );
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);	
	}
}
