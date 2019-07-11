package sg.edu.rp.c346.project3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private String mainActivityName = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Thread logoTimer = new  Thread(){
            public void run(){
                try{
                    sleep(2500);
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}
