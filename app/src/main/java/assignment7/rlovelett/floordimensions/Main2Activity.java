package assignment7.rlovelett.floordimensions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView title, listFlooring;
    Double width;
    Double length;
    Double totalFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = (TextView) findViewById(R.id.textView1);
        listFlooring = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();

        width = extras.getDouble("MainWidth");
        length = extras.getDouble("MainLength");
        totalFloor = extras.getDouble("MainTotal");

        listFlooring.setText("Width is " + width + " and Length is " + length + " and flooring needed is " + totalFloor);

    }
}
