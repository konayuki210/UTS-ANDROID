package konayuki.pe.bestmetambl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tentang Link

        //linkAkai
        Button btnOpen1 = (Button) findViewById(R.id.btnAkai);
        //set OnClickListener event to btnOpen
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                callIntentakai();
            }
        });
        //linkNatalia
        Button btnOpen2 = (Button) findViewById(R.id.btnNatalia);
        //set OnClickListener event to btnOpen2
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                callIntentnatalia();
            }
        });

        //linkLayla
        Button btnOpen3 = (Button) findViewById(R.id.btnLayla);
        //set OnClickListener event to btnOpen3
        btnOpen3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                callIntentlayla();
            }
        });


    }


    //Method Link Akai
    public void callIntentakai(){
        Intent i = new Intent(this, Akai.class);
        startActivity(i);
    }
    //Method Link natalia
    public void callIntentnatalia(){
        Intent i = new Intent(this, Natalia.class);
        startActivity(i);
    }
    //Method Link Layla
    public void callIntentlayla(){
        Intent i = new Intent(this, Layla.class);
        startActivity(i);
    }





    //IGNORE THESE UNDER TEXT
    //ini adalah Activity Lifecycle
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }



}
