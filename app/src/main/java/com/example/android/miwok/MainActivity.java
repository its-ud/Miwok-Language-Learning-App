package com.example.android.miwok;


import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String msg = "com.example.android.miwok.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        TextView numbers =  (TextView)findViewById(R.id.numbers);

        assert numbers != null;
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Numbers List Clicked",Toast.LENGTH_SHORT).show();

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Family List Clicked",Toast.LENGTH_SHORT).show();

                Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Colors List Clicked",Toast.LENGTH_SHORT).show();

                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Phrases List Clicked",Toast.LENGTH_SHORT).show();

                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });
    }


    //
    public void openNumbersList(View view){
        //idhr code aayega
        Intent i = new Intent(this,NumbersActivity.class);
        String message="Numsbres Activity Khul Gayi";
        i.putExtra(msg,message);
        startActivity(i);
    }
    //
    public void openFamilyList(View view){
        //idhr code aayega
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }
    //
    public void openColorsList(View view){
        //idhr code aayega
        Intent i = new Intent(this,NumbersActivity.class);
        String message="Numsbres Activity Khul Gayi";
        i.putExtra(msg,message);
        startActivity(i);
    }
    //
    public void openPhrasesList(View view){
        //idhr code aayega
        Intent i = new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }


}



