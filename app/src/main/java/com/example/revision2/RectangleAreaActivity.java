package com.example.revision2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_area);
        EditText tx_width= findViewById(R.id.editTextText);
        EditText tx_height= findViewById(R.id.editTextText2);
        TextView txtV= findViewById(R.id.textView2);
        Button btn_calculate= findViewById(R.id.btncalcul);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //recuperer eli f weset zone edittext w n7awlou l integer 3ala 5atrou considerer une chaine
                int width=Integer.parseInt(tx_width.getText().toString());
                int height=Integer.parseInt(tx_height.getText().toString());
              //faire le calcule
                int res=width*height;
              //nasna3 intentbech nraja3 feha resulatat mais fergha
                Intent i=new Intent();
                    i.putExtra("resulatatrectanglearea",res);
                  setResult(1,i);
                  finish();

            }
        }
        );




    }
}