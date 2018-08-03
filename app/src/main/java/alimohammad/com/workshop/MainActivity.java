package alimohammad.com.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
    }
    
    public void login(View view){
        
        if(username.getText().toString().equals("ali") &&
                password.getText().toString().equals("123")){

            Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Failed!", Toast.LENGTH_LONG).show();
        }
        
    }
    
}
