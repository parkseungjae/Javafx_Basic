package ex02;

import javafx.scene.Parent;

public interface MediaService {
	public void myStart();
	public void myPause();
	public void myStop();
	public void setControll(Parent root);
	public void volumeControl();
	public void setMedia(Parent root, String mediaName);
}
