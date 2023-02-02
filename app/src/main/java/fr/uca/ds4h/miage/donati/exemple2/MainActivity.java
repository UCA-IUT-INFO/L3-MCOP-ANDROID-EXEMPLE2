package fr.uca.ds4h.miage.donati.exemple2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        /*
        button.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                b.setText("Merci ici aussi !");
            }
        });*/
        button.setOnClickListener(
                e -> Toast.makeText(this, "Merci Leo", Toast.LENGTH_SHORT).show()
        );
    }

    public void traiteAction(View view) {
        Button button = (Button) view;
        //button.setText("Merci !");
    }
}