package pe.edu.upeu.pedrokasistenciaqr;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import OpenHelper.DBCon;
import pe.edu.upeu.dblibrary.ExternalSQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {
    Context context;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtusu=(EditText)findViewById(R.id.editText);
                EditText txtcla=(EditText)findViewById(R.id.editText3);

            }
        });


    }
}
