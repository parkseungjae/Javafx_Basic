package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		ToggleButton tBtn1 = new ToggleButton("111");
		ToggleButton tBtn2 = new ToggleButton("222");
		ToggleButton tBtn3 = new ToggleButton("333");
		
		ToggleGroup tg = new ToggleGroup();
		tBtn1.setToggleGroup(tg);
		tBtn2.setToggleGroup(tg);
		tBtn3.setToggleGroup(tg);
		
		tBtn2.setSelected(true);		
		
		hbox.getChildren().addAll(tBtn1,tBtn2,tBtn3);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("toggleButton2");
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
