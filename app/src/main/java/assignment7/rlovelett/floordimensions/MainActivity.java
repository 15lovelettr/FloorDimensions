package assignment7.rlovelett.floordimensions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    EditText userWidth, userLength;
    Button showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        userWidth = (EditText) findViewById(R.id.editTextWidth);
        userLength = (EditText) findViewById(R.id.editTextLength);
        showResult = (Button) findViewById(R.id.button1);

        showResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double width = Double.parseDouble(userWidth.getText().toString());
                Double length = Double.parseDouble(userLength.getText().toString());
                Double totalFloor = length * width;

                Intent secActIntent = new Intent(MainActivity.this, Main2Activity.class);
                secActIntent.putExtra("MainWidth", width);
                secActIntent.putExtra("MainLength", length);
                secActIntent.putExtra("MainTotal", totalFloor);
                startActivity(secActIntent);

            }
        });
    }
}
