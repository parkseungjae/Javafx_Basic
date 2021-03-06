package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//병합 기능
public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gp = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0, 0);
		
		Label lb = new Label("Label");
		GridPane.setConstraints(lb, 1, 1);
		
		gp.getChildren().addAll(btn,lb);
		Button btn2	 = new Button("1,0");
		//getChildren을 쓰지않고 add를 할경우 생성과동시에 배치를 진행할수 있다.
		gp.add(btn2,1,0);
		gp.add(new Label("0,1"),0,1);
		gp.setPadding(new Insets(20));//모든 방위 20;
		gp.setHgap(50);//내부요소에 대한 여백 가로
		gp.setVgap(10);//내부요소에 대한 여백 세로
		
		arg0.setScene(new Scene(gp,300,300));
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(new Button("merge col(0), row(2)"));
		fp.setStyle("-fx-background-color:black;");
		fp.setAlignment(Pos.CENTER);
		gp.add(fp, 0,2,2,1);//가로, 세로, 가로병합, 세로병합
		
		arg0.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
