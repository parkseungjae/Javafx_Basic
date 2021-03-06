package flowpane;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		//FlowPane flowPane = new FlowPane();	//기본 가로로 배치
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);//세로로배치
		Button[] buttons = new Button[16];
		for(int i = 0; i <15; i++ ) {
			buttons[i] = new Button("btn0"+(i+1));
			flowPane.getChildren().add(buttons[i]);
		}
		
		flowPane.setPadding(new Insets(10,10,10,10));
		
		flowPane.setVgap(80);//가로
		flowPane.setHgap(10);//세로

		Scene scene = new Scene(flowPane,1000,100);
		arg0.setScene(scene);
		arg0.setTitle("FLOWPANE");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
