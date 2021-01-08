package falihul.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BangunDatarActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,bantuan,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BangunDatarActivity.this, BelajarActivity.class);
                startActivity(intent);
            }
        });
        bantuan = (ImageButton) findViewById(R.id.question);
        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BangunDatarActivity.this, PanduanMateriActivity.class);
                startActivity(intent);
            }
        });

        TampilGambar = (ImageView) findViewById(R.id.tampil_macam);
        show = (ImageButton) findViewById(R.id.persegi);
        show = (ImageButton) findViewById(R.id.belahketupat);

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
        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.persegi);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.belahketupat);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.lingkaran);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.layang2);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.segitiga);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.persegipanjang);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.jajargenjang);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.trapesium);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.oval);

        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_persegi);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_belahketupat);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_lingkaran);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_layang2);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_segitiga);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_persegipanjang);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_jajargenjang);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_trapesium);
                TampilGambar.startAnimation(animScale);
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_oval);
                TampilGambar.startAnimation(animScale);
            }
        });
    }
}