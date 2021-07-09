package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    String name_str,age_str,address_str,id_str;
    TextView textViewName,textViewAge,textViewID,textViewAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

         textViewName=findViewById( R.id.name_person );
         textViewAge=findViewById( R.id.age_person );
         textViewID=findViewById( R.id.id_person );
         textViewAdd=findViewById( R.id.add_person );

        Button button =findViewById( R.id.btn );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* AlertDialog.Builder alertdialog =new AlertDialog.Builder( MainActivity.this );
                alertdialog.setTitle( "Fill up the blanks" );
                final EditText name = new EditText(MainActivity.this);
                final EditText age = new EditText(MainActivity.this);
                final EditText id = new EditText(MainActivity.this);
                final EditText address = new EditText(MainActivity.this);

                name.setHint( "Name" );  //editbox1 hint
                name.setGravity( Gravity.CENTER ); //editbox in center
                name.setBackgroundResource( R.drawable.editbox); //editbox style design

                age.setHint( "Age" );  //editbox2 hint
                age.setGravity( Gravity.CENTER );
                age.setBackgroundResource( R.drawable.editbox);

                id.setHint( "ID" ); //editbox3 hint
                id.setGravity( Gravity.CENTER );
                id.setBackgroundResource( R.drawable.editbox);

                address.setHint( "Address" );//editbox4 hint
                address.setGravity( Gravity.CENTER );
                address.setBackgroundResource( R.drawable.editbox);

                //set up in a linear layout
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins( 20,20,20,20);

                LinearLayout lp=new LinearLayout( getApplicationContext() );
                lp.setOrientation( LinearLayout.VERTICAL );

                lp.addView( name ,layoutParams);
                lp.addView( age,layoutParams );
                lp.addView( id ,layoutParams);
                lp.addView( address ,layoutParams);
                alertdialog.setView( lp );
                alertdialog.setPositiveButton( "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                         name_str = name.getText().toString().trim();
                         age_str=age.getText().toString().trim();
                         id_str=id.getText().toString().trim();
                         address_str=address.getText().toString().trim();
                        //Display everything
                        textViewName.setText( "Name: "+name_str );
                        textViewAge.setText( "Age: "+age_str );
                        textViewID.setText( "ID: "+id_str );
                        textViewAdd.setText( "Address: "+address_str );

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
                alert.show();*/
               showAlertDialog();
            }
        } );




    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        final View customLayout = getLayoutInflater().inflate(R.layout.custom, null);
        alertDialog.setView(customLayout);
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // send data from the AlertDialog to the Activity
                //EditText editText = customLayout.findViewById(R.id.editText);
                //Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
    }
}
