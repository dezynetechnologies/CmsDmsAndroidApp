package in.dezyne.cmsdmsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;


public class AudioActivity extends Activity {

    ImageView coverart;
    MediaMetadataRetriever metaRetriver;
    byte[] art;
    String link;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        coverart =(ImageView)findViewById(R.id.cover);


       // metaRetriver = new MediaMetadataRetriever();
       // metaRetriver.setDataSource("http://f6.wload.vc/files/sfd396/197677/Sab%20Tera_64(wapking.fm).mp3");

        try
        {
            setContentView(R.layout.audio);
             link="http://f6.wload.vc/files/sfd396/197677/Sab%20Tera_64(wapking.fm).mp3";
            final VideoView videoView = (VideoView) findViewById(R.id.videoView2);
            final MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            final Uri video = Uri.parse(link);
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(video);
            videoView.start();
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.reset();
                    videoView.setVideoURI(video);
                    videoView.start();
                }
            });



            /*art = metaRetriver.getEmbeddedPicture();
            Bitmap bm = BitmapFactory .decodeByteArray(art, 0, art.length);
            coverart.setImageBitmap(bm);*/


        } catch (Exception e) {
            // TODO: handle exception
            Toast.makeText(this, "Error connecting", Toast.LENGTH_SHORT).show();
        }
    }


}
