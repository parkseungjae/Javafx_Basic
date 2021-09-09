package ex02;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaServiceImpl implements MediaService{

	MediaPlayer mp;
	MediaView mv;
	Button btnPlay,btnPause,btnStop;
	boolean endOfMedia;//미디어가 끝난지 확인 값 끝났으면 true 아니면 false

	Label labelTime;
	Slider sliderVolume;
	ProgressBar progressBar;
	ProgressIndicator progressIndicator;

	@Override
	public void myStart() {
		mp.play();
	}

	@Override
	public void myPause() {
		mp.pause();
	}

	@Override
	public void myStop() {
		mp.stop();
	}

	public void setControll(Parent root) {
		mv = (MediaView)root.lookup("#fxMediaView");
		btnPlay = (Button)root.lookup("#btnPlay");
		btnPause = (Button)root.lookup("#btnPause");
		btnStop = (Button)root.lookup("#btnStop");

		labelTime = (Label)root.lookup("#labelTime");
		sliderVolume = (Slider)root.lookup("#sliderVolume");
		progressBar = (ProgressBar)root.lookup("#progressBar");
		progressIndicator = (ProgressIndicator)root.lookup("#progressIndicator");	
	}

	@Override
	public void setMedia(Parent root, String mediaName) {
		setControll(root);
		//System.out.println(getClass().getResource(mediaName));
		//순서 : mediaName -> media -> mediaPlayer -> mediaView.setMediaPlayer();
		Media media = new Media(getClass().getResource(mediaName).toString());

		mp = new MediaPlayer(media);	

		mv.setMediaPlayer(mp);

		mp.setOnReady(new Runnable() {
			public void run() {
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
				
				mp.currentTimeProperty().addListener((a,b,c)->{
					// 흐르는 시간/ 최종 시간
					double progress = 
							mp.getCurrentTime().toSeconds()/mp.getTotalDuration().toSeconds();
					progressBar.setProgress(progress);
				});
			}
		});
		mp.setOnPlaying(()->{
			
			sliderVolume.setValue(50.0);
			
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});
		mp.setOnStopped(()->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);

		});
		mp.setOnPaused(()->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});
		mp.setOnEndOfMedia(()->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			mp.stop();
		});

	}

	@Override
	public void volumeControl() {
		mp.setVolume(sliderVolume.getValue() / 100.0);
		
	}
}
