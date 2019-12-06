package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sec_act extends AppCompatActivity {


    private TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_act);

        textView9 = (TextView)findViewById(R.id.textView9);


    }
    public void hardcoded(View v)
    {
        String[] password = new String[]{"123","567","2435"};
        textView9.setText("hardcoded Password");
    }



}
