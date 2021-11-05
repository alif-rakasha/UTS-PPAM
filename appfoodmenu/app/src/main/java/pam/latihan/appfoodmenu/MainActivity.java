package pam.latihan.appfoodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        TextView usernameTV = findViewById(R.id.username_fill);
        TextView passwordTV = findViewById(R.id.password_fill);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        Log.d("print", "Username = " + username + " dan Password = " + password);
        Log.d("print", String.valueOf(username.equals("test")));
        Log.d("print", String.valueOf(password.equals("123456")));
        if (username.equals("test") && password.equals("123456")) {
            Log.d("success", "Proses Log In Berhasil!");
            Intent intent = new Intent(getApplicationContext(), MenuCafeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Log.d("failed", "Proses Log In Gagal!");
            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password Tidak Sesuai, Silakan Ulangi!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}