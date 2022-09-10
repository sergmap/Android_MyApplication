package com.example.myapplication;

import android.text.method.BaseKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.NotificationCompatSideChannelService;
import com.google.android.material.textfield.TextInputEditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity{

    //final EditText edLogin = (EditText) findViewById(R.id.edLogin);
    //final TextView tvUserName = (TextView) findViewById(R.id.tvUserName);
    //final TextView tvUserName = (TextView)findViewById(R.id.tvUserName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Буран терминатор: вход в систему");

        EditText edLogin = (EditText) findViewById(R.id.edlogin);

        edLogin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edLogin_onFocusChange(view, b);
            }
        });
    }

    private void edLogin_onFocusChange(View view, boolean b) {
        EditText editText = (EditText) view;
        String strValue = editText.getText().toString();
        String empName = null;
        TextView tvEmpNameLabel = (TextView) findViewById(R.id.tvEmpNameLabel);

        if (b==false) {
            switch (strValue) {
                case "1234567": empName = "Василенко Сергей Алексеевич"; break;

                default:    empName = "Пользователь не найден";
                            break;
            }



        tvEmpNameLabel.setText(empName);
        }


    }

}