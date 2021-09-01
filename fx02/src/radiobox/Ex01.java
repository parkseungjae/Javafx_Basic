package radiobox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
		hbox.setPrefSize(300, 200);
		hbox.getChildren().addAll(rb1,rb2);
		
		ToggleGroup tg = new ToggleGroup();//라디오 버튼을 묶어줘야 제기능이 가능하다
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		rb1.setSelected(true);
		rb1.setText("10대");
		rb2.setText("20대");
		
		hbox.setPadding(new Insets(20));
		//hbox.setStyle("-fx-background=color:red");
		
		HBox.setMargin(rb2, new Insets(50,20,20,50));
		
		arg0.setTitle("radio");
		arg0.setScene(new Scene(hbox,300,200));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
