package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivCadastrar_ae;
    private TextView tvCadastrar_ae;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarViews();

        ivCadastrar_ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent Explícita*/
                Intent intent = new Intent(MainActivity.this, Cadastrar_aeActivity.class);
                startActivity(intent);
            }
        });

        tvCadastrar_ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent Explícita*/
                Intent intent = new Intent(MainActivity.this, Cadastrar_aeActivity.class);
                startActivity(intent);
            }
        });
    }

        public void iniciarViews(){
            ivCadastrar_ae = findViewById(R.id.ivCadastrar_ae);
            tvCadastrar_ae = findViewById(R.id.tvCadastrar_ae);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_principal, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
           int id = item.getItemId();

            if(id == R.id.cadastrar_ae) {
                /*Intent Explícita*/
                Intent intent = new Intent(MainActivity.this, Cadastrar_aeActivity.class);
                startActivity(intent);
                return true;
            }
            if(id == R.id.desenvolvedor) {
                /*Intent Explícita*/
                Intent intent = new Intent(MainActivity.this, DesenvolvedorActivity.class);
                intent.putExtra("tel", "87999951042");
                startActivity(intent);
                return true;
            }
            if(id == R.id.sair) {
                finish();
            }
            return super.onOptionsItemSelected(item);
        }
}
