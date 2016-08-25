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
public class AudioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        try
        {
            setContentView(R.layout.audio);
            String link="http://gaana99.com/fileDownload/Songs/128/28687.mp3";
            VideoView videoView = (VideoView) findViewById(R.id.videoView2);
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
