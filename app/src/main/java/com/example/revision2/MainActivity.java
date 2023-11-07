package com.example.revision2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout layout =(ConstraintLayout) findViewById(R.id.idlayout);
        TextView tx_result= findViewById(R.id.main_text_view_result);
        Button triangle= findViewById(R.id.btntri);
        Button rectangle= findViewById(R.id.btnrect);

        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,RectangleAreaActivity.class);

                startActivityForResult(i,1);//bech naref ena fin konet bel entier (3ady na3ty ay entier)
                //ki narja3 mel activity rectangle bech yraja3li m3ah requestcode
            }
        });
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TriangleAreaActivity.class);
                startActivityForResult(i,2);//nmayzou b ra9em
            }
        });
    }
    //awel manarja3 mel activity lo5ra yraja3 feha les resulatat manghir ma ena n3ayel lel methode
    //tet5dem automatiquement
    //request code =ken rja3 mel avtivity rectangle yraja3 1 snn 2
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tx_result= findViewById(R.id.main_text_view_result);

        if(requestCode==1) {
           /* //old values
            String oldText=tx_result.getText().toString();*/
            //recuperation de resulatat de rectangle

            int Newtext=data.getIntExtra("resulatatrectanglearea",0);
            String newTextString = String.valueOf(Newtext); // Convertir l'entier en une chaîne de caractères

            tx_result.setText(newTextString);
        }
        if(requestCode==2) {
           /* //old values
            String oldText=tx_result.getText().toString();*/
            //recuperation de resulatat de rectangle

            double Newtext=data.getDoubleExtra("resulata_triangle_area",0);
            String newTextString = String.valueOf(Newtext); // Convertir le variable de ype double en une chaîne de caractères

            tx_result.setText(newTextString);
        }

    }






}