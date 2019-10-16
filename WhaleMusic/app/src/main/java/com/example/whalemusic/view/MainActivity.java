

package com.example.whalemusic.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.whalemusic.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FragmentMain.NotificadorActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegarFragment(new FragmentMain());

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
