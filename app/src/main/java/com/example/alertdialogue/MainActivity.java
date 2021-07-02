package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final EditText editText=findViewById( R.id.name );
        Button button=findViewById( R.id.btn );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString().trim();
                AlertDialog.Builder alertdialog=new AlertDialog.Builder(MainActivity.this);
                alertdialog.setTitle( "Hi "+name+". Welcome to Codengocool " );
                alertdialog.setPositiveButton( "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Intent intent=new Intent( MainActivity.this,Second.class );
                        startActivity( intent );
                    }
                } );

                alertdialog.setNegativeButton( "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                } );

                AlertDialog alert = alertdialog.create();
                alert.setCanceledOnTouchOutside( false );
                alert.show();
            }
        } );



    }
}
