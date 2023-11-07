 package com.example.revision2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class TriangleAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_area);
        EditText txbase= (EditText) findViewById(R.id.editTextbase);
        EditText txheight= (EditText) findViewById(R.id.editTextheight);
        Button btn_calculate= findViewById(R.id.buttoncalcul);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
           @Override
             public void onClick(View v) {
               //recuperer eli f weset zone edittext w n7awlou l integer 3ala 5atrou considerer une chaine
               int base=Integer.parseInt(txbase.getText().toString());
               int height=Integer.parseInt(txheight.getText().toString());
               //faire le calcule
               double res=0.5*base*height;
               //nasna3 intentbech nraja3 feha resulatat mais fergha
               Intent i=new Intent();
               i.putExtra("resulata_triangle_area",res);
               //resultcode just bech na3ref resultat mnin jet men ana activity
               setResult(2,i);
               finish();

                                             }
                                         }
        );


    }
 }