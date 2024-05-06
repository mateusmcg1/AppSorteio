package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        protected EditText numeroUsuario;
        protected TextView resultado;
        protected Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bindInfo();

    }//fim onCreate
    public void bindInfo(){
        this.numeroUsuario= findViewById(R.id.EditTextIdNumero);
        this.resultado= findViewById(R.id.textViewIdResultado);
        this.botao= findViewById(R.id.buttonIdSorteio);
    }
    public void jogar(View view){
        int valorSorteado = new Random().nextInt();
        int valorUsuario = Integer.parseInt(this.numeroUsuario.getText().toString());
        if(valorUsuario == valorSorteado){
            this.resultado.setText("O usuario ganhou!!!");
        }
        else {
            this.resultado.setText("O usuario não ganhou, numero sorteado:"+ valorSorteado);

        }//fim metodo jogar
    }

}