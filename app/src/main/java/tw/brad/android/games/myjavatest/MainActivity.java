package tw.brad.android.games.myjavatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = (MyView)findViewById(R.id.myView);
    }

    @Override
    public void finish() {
        Timer timer = myView.getTimer();
        if (timer!=null){
            timer.cancel();
            timer = null;
        }
        super.finish();
    }
}
