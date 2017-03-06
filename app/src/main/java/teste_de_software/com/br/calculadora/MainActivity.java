package teste_de_software.com.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button numero0;
    Button numero1;
    Button numero2;
    Button numero3;
    Button numero4;
    Button numero5;
    Button numero6;
    Button numero7;
    Button numero8;
    Button numero9;
    Button operador_dividir;
    Button operador_multiplicar;
    Button operador_somar;
    Button operador_subtrair;
    Button operador_resultado;
    Button operador_limpar;
    EditText display;
//    EditText teste;
//    EditText ETNegativo;

    private int operador;
    private boolean negativo;

    private Double valor1;
    private Double valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        operador = 0;
        valor1 = Double.valueOf(0);
        valor2 = Double.valueOf(0);

        numero0 = (Button) findViewById(R.id.numero0);
        numero1 = (Button) findViewById(R.id.numero1);
        numero2 = (Button) findViewById(R.id.numero2);
        numero3 = (Button) findViewById(R.id.numero3);
        numero4 = (Button) findViewById(R.id.numero4);
        numero5 = (Button) findViewById(R.id.numero5);
        numero6 = (Button) findViewById(R.id.numero6);
        numero7 = (Button) findViewById(R.id.numero7);
        numero8 = (Button) findViewById(R.id.numero8);
        numero9 = (Button) findViewById(R.id.numero9);
        operador_dividir = (Button) findViewById(R.id.operador_dividir);
        operador_multiplicar = (Button) findViewById(R.id.operador_multiplicar);
        operador_somar = (Button) findViewById(R.id.operador_somar);
        operador_subtrair = (Button) findViewById(R.id.operador_subtrair);
        operador_limpar = (Button) findViewById(R.id.operador_limpar);
        operador_resultado = (Button) findViewById(R.id.operador_resultado);
        display = (EditText) findViewById(R.id.display);
//        teste = (EditText) findViewById(R.id.teste);
//        ETNegativo = (EditText) findViewById(R.id.ETNegativo);

        display.setText("");

        operador_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                operador = 0;
                negativo = Boolean.parseBoolean(null);
                valor1 = Double.valueOf(0);
                valor2 = Double.valueOf(0);
            }
        });

        numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("0");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "0");
                }
            }
        });

        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("1");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "1");
                }
            }
        });
        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("2");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "2");
                }
            }
        });
        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("3");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "3");
                }
            }
        });
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("4");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "4");
                }
            }
        });
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("5");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "5");
                }
            }
        });
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("6");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "6");
                }
            }
        });
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("7");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "7");
                }
            }
        });
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("8");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "8");
                }
            }
        });
        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(display.getText(), "")){
                    display.setText("9");
                }
                else{
                    String var = display.getText().toString();

                    display.setText(var + "9");
                }
            }
        });

        operador_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().length() == 0 && negativo == true){
                    valor1 = Double.valueOf((-Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText(" Somar com Operador = 2");
                }else if(display.getText().length() > 0) {
                    valor1 = Double.valueOf((Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText("Operador = Somar");
                }
                else {
                    valor1 = Double.valueOf((Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText("Operador = Somar");
                }
                operador = 1;
                negativo = false;
            }
        });

        operador_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().length() == 0){
                    display.setText("-");
                    negativo = true;
//                    ETNegativo.setText("Negativo = True");
                }
                else{
                    if(display.getText().length() == 0 && negativo == true){
                        valor1 = Double.valueOf((-Double.parseDouble(display.getText().toString())));
                        display.setText("");
//                        teste.setText(" Subtrair com Operador = 2");
                    }else {
                        valor1 = Double.valueOf((Double.parseDouble(display.getText().toString())));
                        display.setText("");
//                        teste.setText("Operador = Subtrair");
                    }
                    operador = 2;
                    negativo = false;
//                    ETNegativo.setText("Negativo = False");
                }

            }
        });

        operador_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().length() == 0 && negativo == true){
                    valor1 = Double.valueOf((-Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText(" Multiplicar com Operador = 2");
                }else {
                    valor1 = Double.valueOf((Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText("Operador = Multiplicar");
                }
                operador = 3;
                negativo = false;
            }
        });

        operador_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().length() == 0 && negativo == true){
                    valor1 = Double.valueOf((-Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText(" Dividir com Operador = 2");
                }else {
                    valor1 = Double.valueOf((Double.parseDouble(display.getText().toString())));
                    display.setText("");
//                    teste.setText("Operador = Dividir");
                }
                operador = 4;
                negativo = false;
            }
        });

        operador_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador == 1){
                        valor2 = Double.valueOf(Double.parseDouble(display.getText().toString()));
                        Double resultado = valor1 + valor2;
                        valor1 = resultado;
                        display.setText(String.valueOf(resultado));
                }
                if(operador == 2){
                    valor2 = Double.valueOf(Double.parseDouble(display.getText().toString()));
                    Double resultado = valor1 - valor2;
                    valor1 = resultado;
                    display.setText(String.valueOf(resultado));
                }
                if(operador == 3){
                    valor2 = Double.valueOf(Double.parseDouble(display.getText().toString()));
                    Double resultado = valor1 * valor2;
                    valor1 = resultado;
                    display.setText(String.valueOf(resultado));
                }
                if(operador == 4 ){
                    valor2 = Double.valueOf(Double.parseDouble(display.getText().toString()));
                    Double resultado = valor1 / valor2;
                    valor1 = resultado;
                    display.setText(String.valueOf(resultado));
                }

            }
        });

    }
}
