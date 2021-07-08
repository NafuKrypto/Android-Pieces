package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


 String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button button =findViewById( R.id.btn );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertdialog =new AlertDialog.Builder( MainActivity.this );
                alertdialog.setTitle( "Choose any one language" );
                String[] items={"Bengal","English","Korean"};
                int checkeditem=0;
                alertdialog.setSingleChoiceItems( items, checkeditem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        switch (i){
                            case 0:
                                language="Bengal";
                                break;
                            case 1:
                                language="English";
                                break;
                            case 2:
                                language="Korean";
                                break;
                        }
                    }
                } );

                alertdialog.setPositiveButton( "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                        Toast.makeText(MainActivity.this, "You have chosen "+language,Toast.LENGTH_LONG ).show();
                    }
                } );

                alertdialog.setNegativeButton( "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                } );

                AlertDialog alert=alertdialog.create();
                alert.setCanceledOnTouchOutside( false );
                alert.show();
            }
        } );

    }
}
