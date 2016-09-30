package utn.cocodibuja.android.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int contador = 0;
    Button botonContadorMas;
    Button botonContadorMenos;
    TextView textviewContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonContadorMas = (Button) findViewById(R.id.button_contadorMas);
        botonContadorMenos = (Button) findViewById(R.id.button_contadorMenos);
        textviewContador = (TextView) findViewById(R.id.TextView_textoContador);

        botonContadorMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                textviewContador.setText("El valor del contador es: "+contador);
            }
        });

        botonContadorMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                textviewContador.setText("El valor del contador es: "+contador);
            }
        });
    }
}
