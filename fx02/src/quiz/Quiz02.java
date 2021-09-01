package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		fp.setHgap(30);
		fp.setPadding(new Insets(20));
		Label ivlb = new Label();
		ivlb.setText("Search");
		ivlb.setFont(new Font(20));
		ivlb.setTextFill(Color.web("#0076a3"));
		ivlb.setGraphic(new ImageView("/img/img/search.png"));

		ivlb.setOnMouseEntered(e->{
			ivlb.setScaleX(1.5);
			ivlb.setScaleY(1.5);
		});
		ivlb.setOnMouseExited(e->{
			ivlb.setScaleX(1);
			ivlb.setScaleY(1);
		});

		Label valLb = new Label("values");
		valLb.setFont(new Font(35));
		valLb.setRotate(270);

		valLb.setOnMouseEntered(e->{
			valLb.setRotate(0);
		});
		valLb.setOnMouseExited(e->{
			valLb.setRotate(270);
		});

		Label senLb = new Label("A labe l that needs to be wrapped");
		senLb.setWrapText(true);
		senLb.setOnMouseEntered(e->{
			senLb.setRotate(90);
		});
		senLb.setOnMouseExited(e->{
			senLb.setRotate(0);
		});

		fp.getChildren().addAll(ivlb,valLb,senLb);

		arg0.setScene( new Scene(fp,600,300) );
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
