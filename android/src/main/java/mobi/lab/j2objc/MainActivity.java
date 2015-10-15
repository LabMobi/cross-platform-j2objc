package mobi.lab.j2objc;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TextView text = (TextView) findViewById(R.id.text_main);
        text.setText("Main");
    }
 }
