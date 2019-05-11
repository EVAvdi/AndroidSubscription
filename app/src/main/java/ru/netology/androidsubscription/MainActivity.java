package ru.netology.androidsubscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView massageText;
    private EditText inputName;
    private EditText inputEmail;
    Button okButton;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputName = findViewById(R.id.input_name);
        inputEmail = findViewById(R.id.input_email);
        okButton = findViewById(R.id.ok);
        clearButton = findViewById(R.id.clear);
        massageText = findViewById(R.id.text_massage);
        okButton.setOnClickListener(clickOkListener);
        clearButton.setOnClickListener(clickClearListener);
    }

    private View.OnClickListener clickOkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nameInput = inputName.getText().toString();
            String emailInput = inputEmail.getText().toString();
            massageText.setText("Подписка на рассылку успешно оформлена " +
                    "для пользователя "+nameInput+" " +
                    "на электронный адрес "+emailInput);
        }
    };
    private View.OnClickListener clickClearListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputName.setText("");
            inputEmail.setText("");

        }
    };
}

