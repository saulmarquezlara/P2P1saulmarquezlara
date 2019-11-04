package sml.edu.tesoem.tics.p2p1saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rmasculino, rfemenino;
    RadioButton suma,resta,multiplicacion,division;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenino = (RadioButton) findViewById(R.id.rfemenino);

        suma = (RadioButton) findViewById(R.id.suma);
        resta = (RadioButton) findViewById(R.id.resta);
        division = (RadioButton) findViewById(R.id.division);
        multiplicacion = (RadioButton) findViewById(R.id.multiplicacion);
        resultado=(TextView) findViewById(R.id.resultado);

    }

    public void invocamensaje(View view) {
        if (rmasculino.isChecked()) {
            Toast.makeText(this, "Selecciono Masculino", Toast.LENGTH_LONG).show();
        }
        if (rfemenino.isChecked()) {
            Toast.makeText(this, "Selecciono Femenino", Toast.LENGTH_LONG).show();
        }
    }

    public void operaciones(View v){
        if (suma.isChecked()){
            EditText txtnumero1 = (EditText) findViewById(R.id.txtnum1);
            EditText txtnumero2 = (EditText) findViewById(R.id.txtnum2);
            Double entero1 = Double.parseDouble(txtnumero1.getText().toString());
            Double entero2 = Double.parseDouble(txtnumero2.getText().toString());

            Double Resp=entero1+entero2;
            resultado.setText(""+Resp);

        }
        if (resta.isChecked()){
            EditText txtnumero1 = (EditText) findViewById(R.id.txtnum1);
            EditText txtnumero2 = (EditText) findViewById(R.id.txtnum2);
            Double entero1 = Double.parseDouble(txtnumero1.getText().toString());
            Double entero2 = Double.parseDouble(txtnumero2.getText().toString());

            Double Resp=entero1-entero2;
            resultado.setText(""+Resp);

        }
        if (multiplicacion.isChecked()){

            EditText txtnumero1 = (EditText) findViewById(R.id.txtnum1);
            EditText txtnumero2 = (EditText) findViewById(R.id.txtnum2);
            Double entero1 = Double.parseDouble(txtnumero1.getText().toString());
            Double entero2 = Double.parseDouble(txtnumero2.getText().toString());

            Double Resp=entero1*entero2;
            resultado.setText(""+Resp);

        }
        if (division.isChecked()){
            EditText txtnumero1 = (EditText) findViewById(R.id.txtnum1);
            EditText txtnumero2 = (EditText) findViewById(R.id.txtnum2);
            Double entero1 = Double.parseDouble(txtnumero1.getText().toString());
            Double entero2 = Double.parseDouble(txtnumero2.getText().toString());

            Double Resp=entero1/entero2;
            resultado.setText(""+Resp);

        }

    }
}