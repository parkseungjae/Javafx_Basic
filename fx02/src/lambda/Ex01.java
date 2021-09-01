package lambda;

import javafx.application.Application;
import javafx.stage.Stage;

interface Lambda01{
	public void lam();
}
class Test01 implements Lambda01{
	@Override
	public void lam() {
		System.out.println("lambda 01 실행");
	}
}
//람다와 interface는 항상 연관이있다
public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Test01 t = new Test01();
		t.lam();

		//앞서 배웠듯 추상화 되어있는 메소드는 무조건 실체화를 해줘야만 한다.
		Lambda01 lam01 = new Lambda01() {
			@Override
			public void lam() {
				System.out.println("인터페이스 객체 생성");
			}
		};
		lam01.lam();
		//위와 같은 코드를 아래와 같이 축약시켜줄 수 있는것이 람다식이다.
		//단 실체화 해주어야하는 메소드가 하나를 초과할경우 아래와같이 표현은 불가하다.
		Lambda01 lam02 = ()-> System.out.println("람다식 객체 생성");
		lam02.lam();
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
