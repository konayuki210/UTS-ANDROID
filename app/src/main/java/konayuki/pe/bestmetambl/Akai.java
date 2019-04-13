package konayuki.pe.bestmetambl;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Akai extends Activity {
    MediaController media_Controller;
    DisplayMetrics dm;

    VideoView videoViewSaya;
    TextView txtJudul;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akai);

        // view
        videoViewSaya = (VideoView) findViewById(R.id.videoViewUtama);
        txtJudul = (TextView) findViewById(R.id.txtJudul);

        // inisialisasi
        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();
        // MenSet Ukuran layar
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        // Nilai Tinggi Dan Lebar Video
        videoViewSaya.setMinimumWidth(width);
        videoViewSaya.setMinimumHeight(height);
        // Ini Adalah Kontrolernya
        videoViewSaya.setMediaController(media_Controller);
    }
    //Method MemuatVideo
    private void muatVideo(String judul, String nama_file) {
        // kasih judul
        txtJudul.setText(judul);

        // ambil video
        videoViewSaya.setVideoPath("android.resource://"+getPackageName()+"/raw/"+nama_file);

        // mulai
        videoViewSaya.start();
    }

    //THIS IS VIDEO1 CLICK
    public void video1(View view) {
        muatVideo("Akai", "akai");
    }
}
