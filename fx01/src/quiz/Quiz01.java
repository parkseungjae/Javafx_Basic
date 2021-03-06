package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {

		BorderPane bp = new BorderPane();
		FlowPane fpT = new FlowPane();
		FlowPane fpC = new FlowPane();
		FlowPane fpB = new FlowPane();
		GridPane gpR = new GridPane();
		FlowPane fpL = new FlowPane();

		bp.setTop(fpT);
		bp.setCenter(fpC);
		bp.setBottom(fpB);
		bp.setRight(gpR);
		bp.setLeft(fpL);

		Button btnMenu = new Button("메뉴나열");

		Button btnTopic = new Button("내용들어가는곳");
		btnTopic.setPrefSize(150, 25);
		Button btnId = new Button("아이디 입력");
		btnId.setPrefSize(100, 25);
		Button btnPw = new Button("비밀번호 입력");
		btnPw.setPrefSize(100, 25);

		Button btnLogin = new Button("로그인");
		btnLogin.setPrefSize(100, 50);
		Button btnBot = new Button("바닥글 들어가는곳");		

		Label lb = new Label("메뉴 홈 로그인");
		//각요소
		fpT.getChildren().add(lb);
		fpL.getChildren().add(btnMenu);
		fpC.getChildren().add(btnTopic);
		fpB.getChildren().add(btnBot);

		//Right Pane 요소
		GridPane.setConstraints(btnId,0,0);
		GridPane.setConstraints(btnPw,0,1);
		GridPane.setConstraints(btnLogin,1,0,1,2);
		gpR.getChildren().addAll(btnId,btnPw,btnLogin);

		//각 Pane 스타일
		fpT.setStyle("-fx-background-color:pink;");
		fpC.setStyle("-fx-background-color:lightgreen;");
		fpL.setStyle("-fx-background-color:skyblue;");
		fpB.setStyle("-fx-background-color:brown;");
		gpR.setStyle("-fx-background-color:lightyellow;");

		fpT.setPrefSize(600, 20);
		fpT.setAlignment(Pos.CENTER_RIGHT);
		fpT.setPadding(new Insets(10,30,10,0));
		
		fpB.setPrefSize(600, 20);
		fpB.setAlignment(Pos.CENTER);
		
		fpL.setPrefSize(150, 250);
		
		fpC.setPrefSize(150, 250);
		
		gpR.setPrefSize(300, 250);
		gpR.setPadding(new Insets(20));
		
		arg0.setTitle("Quiz");
		arg0.setScene(new Scene(bp,600,300));
		arg0.setResizable(false);
		arg0.show();
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
