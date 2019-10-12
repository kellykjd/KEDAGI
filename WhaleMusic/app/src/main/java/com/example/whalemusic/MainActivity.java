

package com.example.whalemusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainFragment.NotificadorActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegarFragment(new MainFragment());

    }


    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivity_contenedorFragments,fragment,null)
                .commit();
    }

    @Override
    public void recibirGeneros(List<String> generos) {
        //A la espera de Gigi para continuar.
    }
}
