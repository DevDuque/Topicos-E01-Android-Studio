package com.example.topics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    Button btnErro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = this.findViewById(R.id.btn_ok);
        btnErro = this.findViewById(R.id.btn_erro);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Aprovado!", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
            }
        });

        btnErro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Reprovado!", Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
                // Log de warning, indicando que o usuário clicou neste botão
                Log.w("MainActivity.btnErroClick", "Você clicou no botão de Erro!");
            }
        });
            // Log verbose, indicando que a Activity foi criada corretamente
        Log.v("MainActivity.class", "A MainActivity foi criada com sucesso!");
    }
}