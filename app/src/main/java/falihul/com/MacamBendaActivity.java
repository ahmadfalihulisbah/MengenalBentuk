package falihul.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MacamBendaActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,bantuan,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macam_benda);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MacamBendaActivity.this, BelajarActivity.class);
                startActivity(intent);
            }
        });
        bantuan = (ImageButton) findViewById(R.id.question);
        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MacamBendaActivity.this, PanduanMateri2Activity.class);
                startActivity(intent);
            }
        });

        TampilGambar = (ImageView) findViewById(R.id.tampil_macam);
        show = (ImageButton) findViewById(R.id.jam);
        show = (ImageButton) findViewById(R.id.rambujalan);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });
        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.jam);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.rambujalan);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.bola);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.layangan);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.rambujalan2);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.papantulis);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.jajanan);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.tas);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.telur);

        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_jamdinding2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_rambujalan22);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_bola2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_layang22);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_rambujalan3);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_papantulis2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_jajanan2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_tas2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_telur2);
                TampilGambar.startAnimation(animScale);
            }
        });
    }
}