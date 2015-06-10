package br.com.tassioauad.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonSpotifyStreamer = (Button) findViewById(R.id.button_spotify_streamer);
        buttonSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_spotify_streamer)), Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonScoreApp = (Button) findViewById(R.id.button_score_app);
        buttonScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_score_app)), Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonLibraryApp = (Button) findViewById(R.id.button_library_app);
        buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_library_app)), Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_build_it_bigger)), Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonXYZReader = (Button) findViewById(R.id.button_xyz_reader);
        buttonXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_xyz_reader)), Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_app_launch_alert,
                        getString(R.string.app_title_my_own_app)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
