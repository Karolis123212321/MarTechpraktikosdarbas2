package com.example.martechpraktikosdarbas2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.martechpraktikosdarbas2.R;
import com.example.martechpraktikosdarbas2.CountHelper;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private Spinner spinnerChoice;
    private Button buttonCount;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Rasti komponentus pagal jų ID
        editTextInput = findViewById(R.id.editTextInput);
        spinnerChoice = findViewById(R.id.spinnerChoice);
        buttonCount = findViewById(R.id.buttonCount);
        textViewResult = findViewById(R.id.textViewResult);

        // Mygtuko skaičiavimui "OnClickListener"
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString().trim();

                // Patikrinimas ar įvesties laukas nėra tuščias
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.error_empty_input, Toast.LENGTH_SHORT).show();
                    return;
                }

                // Gauti pasirinkimą iš Spinner
                String choice = spinnerChoice.getSelectedItem().toString();

                // Kviečiame skaičiavimo metodą pagal pasirinktą tipą
                CountHelper countHelper = new CountHelper();
                int result;

                if (choice.equals(getString(R.string.choice_words))) {
                    result = countHelper.countWords(inputText);
                } else {
                    result = countHelper.countCharacters(inputText);
                }

                // Parodyti rezultatą
                textViewResult.setText(getString(R.string.result_text, result));
            }
        });
    }
}
