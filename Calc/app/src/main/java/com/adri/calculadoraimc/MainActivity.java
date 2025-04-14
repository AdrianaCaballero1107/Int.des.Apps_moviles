package com.adri.calculadoraimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
    private Button calcButton;
    private RadioButton mujerButton;
    private RadioButton hombreButton;
    private EditText edadText;
    private EditText metrosText;
    private EditText cmText;
    private EditText pesoText;
    private TextView resultTxt;

    private AppDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar base de datos Room
        db = Room.databaseBuilder(getApplicationContext(),
                AppDataBase.class, "database-name").build();

        findViews();
        setupButtonClickListener();
    }

    private void findViews() {
        resultTxt = findViewById(R.id.text_view_result);
        mujerButton = findViewById(R.id.radio_button_mujer);
        hombreButton = findViewById(R.id.radio_button_hombre);
        edadText = findViewById(R.id.edit_text_edad);
        metrosText = findViewById(R.id.edit_text_metros);
        cmText = findViewById(R.id.edit_text_cm);
        pesoText = findViewById(R.id.edit_text_peso);
        calcButton = findViewById(R.id.button_calcular);
    }

    private void setupButtonClickListener() {
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculando..", Toast.LENGTH_SHORT).show();
                calcularIMC();
            }
        });
    }

    private void calcularIMC() {
        String edadStr = edadText.getText().toString();
        String metrosStr = metrosText.getText().toString();
        String cmStr = cmText.getText().toString();
        String pesoStr = pesoText.getText().toString();

        int edad = Integer.parseInt(edadStr);
        int metros = Integer.parseInt(metrosStr);
        double cm = Double.parseDouble(cmStr);
        int pesokg = Integer.parseInt(pesoStr);

        double alturaMetros = metros + (cm / 100);
        double imc = pesokg / (alturaMetros * alturaMetros);

        // Redondear el resultado del IMC
        final String resultado = String.format("%.2f", imc);

        // Advertencia si la edad es menor a 16 años
        if (edad < 16) {
            if (mujerButton.isChecked()) {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nPara una interpretación correcta consulta los percentiles de talla y peso.");
            } else if (hombreButton.isChecked()) {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nPara una interpretación correcta consulta los percentiles de talla y peso.");
            } else {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nPara una interpretación correcta consulta los percentiles de talla y peso.");
            }
        } else {
            // Clasificación del IMC
            if (imc < 18.5) {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nBajo peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nPeso normal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nSobrepeso");
            } else {
                resultTxt.setText("Hola, tu IMC es de " + resultado + "\nObesidad");
            }
        }

        // Insertar usuario "Adriana" en la base de datos
        new Thread(new Runnable() {
            @Override
            public void run() {
                userDao userDao = db.userDao();
                user existing = userDao.findByNameNow("Adriana");

                // Si no existe el usuario, lo insertamos
                if (existing == null) {
                    userDao.insert(new user("Adriana"));
                }

                // Leer el usuario y mostrar el mensaje con IMC
                user user = userDao.findByNameNow("Adriana");

                // Verificar si el usuario existe antes de mostrar el mensaje
                if (user != null) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            resultTxt.setText("Hola " + user.getUsername() + ", tu IMC es de " + resultado);
                        }
                    });
                }
            }
        }).start();
    }
}


//private void displayResult(double imc){
      //  DecimalFormat resultFormat = new DecimalFormat("0.00");
//        String result = resultFormat.format(imc);
//
//        String resultIMC;
    //}

