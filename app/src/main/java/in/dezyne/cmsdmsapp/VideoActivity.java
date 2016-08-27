package in.dezyne.cmsdmsapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by Dezyne 2 on 8/25/2016.
 */
public class VideoActivity extends Activity {

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.video);
            String link = "http://f3.wload.vc/files/sfd334/166653/Soch%20Na%20Sake%20(Airlift)%20HD(wapking.fm).mp4";
            videoView = (VideoView) findViewById(R.id.videoView);
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
