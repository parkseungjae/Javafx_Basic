package chart;

import java.net.URL;
import java.util.ResourceBundle;

import common.Exit;
import common.ExitImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class ChartViewController implements Initializable{
	Parent root;
	Exit ex;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ex = new ExitImpl();
	}
	
	public void exitProc() {
		ex.setRoot(root);
		ex.exitProc();
	}
	
}
