package in.dezyne.cmsdmsapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by Dezyne 2 on 8/25/2016.
 */
public class VideoActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

    // TODO Auto-generated method stub
    super.onCreate(savedInstanceState);
    try
    {
        setContentView(R.layout.video);
        String link="http://redirector.googlevideo.com/videoplayback?lmt=1458185496314924&itag=22&key=yt6&mime=video%2Fmp4&ipbits=0&pl=22&gcr=us&expire=1472148790&nh=IgpwcjAyLmxheDAyKg03Mi4xNC4xOTQuMTYy&sparams=dur%2Cgcr%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&id=o-ALddLNU-jMUBPtvNOprZLmVzWxJPPussgCFCoyhHsO86&initcwndbps=8736250&ip=173.232.7.182&upn=fitJTGWWyv4&dur=247.315&sver=3&mv=m&mt=1472126539&fexp=9406175%2C9410705%2C9419452%2C9422596%2C9428398%2C9431012%2C9433096%2C9433223%2C9433946%2C9435526%2C9438327%2C9438662%2C9438731%2C9438966%2C9439580%2C9439742%2C9439882%2C9440029%2C9440652%2C9441878%2C9442425%2C9442426%2C9442657%2C9443742%2C9443767%2C9443847%2C9444074%2C9444660%2C9445068%2C9445737%2C9445775&ms=au&mn=sn-a5m7lnek&source=youtube&mm=31&ratebypass=yes&signature=C6BD68231A0544FA171A436E63B2B9B5AB05A665.E1B9FB470607B15F10E5A6989CA071D47CE9FABF&title=Jason+Derulo+-+Breathing+%28Official+Video%29.mp4";
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri video = Uri.parse(link);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.start();
    } catch (Exception e) {
        // TODO: handle exception
        Toast.makeText(this, "Error connecting", Toast.LENGTH_SHORT).show();
    }
}

}
