package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    protected static final int TEMPO_DECORRIDO = 5000;

    protected boolean mbAtiva;
    protected ProgressBar mBarraDeProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mBarraDeProgresso = (ProgressBar)findViewById(R.id.BarraDeProgresso);

       final Thread timerThread = new Thread(){
           public void run(){
               mbAtiva = true;
               try{
                   int esperou = 0;
                   while (mbAtiva && (esperou < TEMPO_DECORRIDO)){
                       sleep(100);
                       if (mbAtiva){
                           esperou += 100;
                           atualizarProgresso(esperou);
                       }
                   }
               } catch (InterruptedException e){

               }finally {
               }
           }
       };
       timerThread.start();

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 5000);

    }

    private void atualizarProgresso(final int tempoQuePassou) {
        if (null != mBarraDeProgresso){
            final int progresso = mBarraDeProgresso.getMax() * tempoQuePassou / TEMPO_DECORRIDO;
            mBarraDeProgresso.setProgress(progresso);
        }
    }
}
