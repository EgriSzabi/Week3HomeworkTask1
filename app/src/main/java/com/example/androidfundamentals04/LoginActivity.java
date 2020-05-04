package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private EditText emailAddressEditText;
    private  EditText phoneEditText;
    private CheckBox termsCheckBox;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);
        textView=findViewById(R.id.resultTextView);

    }

    public void loginOnClick(View view) {
        String email = emailAddressEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        if(email.isEmpty()) {
            emailAddressEditText.setError("Please enter an email address");
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
           emailAddressEditText.setError("Please enter a valid email address");

        }
        if (phone.isEmpty()) {
            phoneEditText.setError("Please enter a phone number");
        }
        if(termsCheckBox.isChecked()==false) {
            Toast.makeText(this, "please accept terms", Toast.LENGTH_LONG ).show();
        }
        if(!email.isEmpty() && !phone.isEmpty() && termsCheckBox.isChecked()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "log in successful" , Toast.LENGTH_LONG).show();
            textView.setText( "Your email is: "+ email+" and the phone number is: "+ phone+" and therms are accepted");
            textView.setVisibility(View.VISIBLE);
        }
    }
}
