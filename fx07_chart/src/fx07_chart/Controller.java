package fx07_chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class Controller implements Initializable{
	PieChart pieChart;
	BarChart barChart;
	AreaChart areaChart;
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		areaChart = (AreaChart)root.lookup("#areaChart");
		chart();
	}
	public void chart() {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 10),
				new PieChart.Data("Swing", 30),
				new PieChart.Data("JavaFx", 30),
				new PieChart.Data("Java", 30)
				));
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016",70),
				new XYChart.Data("2017",40),
				new XYChart.Data("2018",50),
				new XYChart.Data("2019",90)
				));
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016",30),
				new XYChart.Data("2017",150),
				new XYChart.Data("2018",60),
				new XYChart.Data("2019",100)
				));
		
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("평균온도");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016",13),
				new XYChart.Data("2017",6),
				new XYChart.Data("2018",15),
				new XYChart.Data("2019",11)
				));
		
		barChart.getData().add(series1);
		barChart.getData().add(series2);
		areaChart.getData().add(series3);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
