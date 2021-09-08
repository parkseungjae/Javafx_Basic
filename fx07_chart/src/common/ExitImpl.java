package common;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class ExitImpl implements Exit{
	Parent root;
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void exitProc() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}

}
