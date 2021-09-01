package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("aaa",new ImageView("/img/img/search.png"));
		
		Label lbl02 = new Label();
		lbl02.setText("search");
		lbl02.setTextFill(Color.web("#0076a3"));
		lbl02.setGraphic(new ImageView("/img/img/search.png"));
		
		hbox.getChildren().addAll(lbl,lbl02);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
