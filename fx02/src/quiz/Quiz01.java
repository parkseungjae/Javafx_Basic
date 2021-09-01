package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		FlowPane topFp = new FlowPane();
		Label lb1 = new Label("홈");
		Label lb2 = new Label("사회");
		Label lb3 = new Label("경제");
		Label lb4 = new Label("국제");
		Label lb5 = new Label("문화");
		topFp.getChildren().addAll(lb1,lb2,lb3,lb4,lb5);
		topFp.setPadding( new Insets(10,10,10,30) );
		topFp.setHgap(10);
		topFp.setAlignment(Pos.CENTER_RIGHT);
		topFp.setPrefSize(300, 30);
		
		VBox vbox = new VBox(10);
		Label lb1l = new Label("카테고리");
		Label lb2l = new Label("노트북/pc");
		Label lb3l = new Label("자동차용품");
		Label lb4l = new Label("휴대폰");
		Label lb5l = new Label("캠핑/낚시");
		vbox.getChildren().addAll(lb1l,lb2l,lb3l,lb4l,lb5l);
		vbox.setPadding(new Insets(5));
		vbox.setPrefSize(100, 270);
		
		VBox cFp = new VBox(10);
		cFp.setPadding(new Insets(10));
		cFp.setPrefSize(200, 270);
		HBox hboxId = new HBox(7);
		HBox hboxPw = new HBox();
		
		Label id = new Label("ID");
		Label pw = new Label("PW");
		TextField idTf = new TextField();
		PasswordField pwF = new PasswordField();
		hboxId.getChildren().addAll(id,idTf);
		hboxPw.getChildren().addAll(pw,pwF);
		
		RadioButton rb = new RadioButton("여");
		RadioButton rb2 = new RadioButton("남");
		ToggleGroup tg = new ToggleGroup();
		
		HBox rbF = new HBox(15);
		rb.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rbF.getChildren().addAll(rb,rb2);

		HBox cbF = new HBox(5);
		CheckBox cb = new CheckBox("게임");
		CheckBox cb2 = new CheckBox("공부");
		cbF.getChildren().addAll(cb,cb2);
		
		VBox cmF = new VBox(8);
		Label commentL = new Label("하고 싶은 말");
		TextArea commentF = new TextArea();
		commentF.setPrefSize(200, 100);
		cmF.getChildren().addAll(commentL,commentF);
		
		
		cFp.getChildren().addAll(hboxId,hboxPw,rbF,cbF,cmF);
		
		GridPane loginGp = new GridPane();
		TextField idField = new TextField();
		idField.setPrefSize(100, 20);
		PasswordField pwField = new PasswordField();
		pwField.setPrefSize(100, 20);

		Button loginBtn = new Button("로그인");
		loginBtn.setPrefSize(60,40);
		GridPane.setConstraints(idField, 0, 0);
		GridPane.setConstraints(pwField, 0, 1);
		GridPane.setConstraints(loginBtn, 1, 0, 2,2);
		loginGp.getChildren().addAll(idField,pwField,loginBtn);
		loginGp.setPadding(new Insets(10));
		
		BorderPane bp = new BorderPane();
		bp.setTop(topFp);
		bp.setLeft(vbox);
		bp.setCenter(cFp);
		bp.setRight(loginGp);
	
		arg0.setResizable(false);
		arg0.setTitle("Quiz3");
		arg0.setScene(new Scene(bp,600,300));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
