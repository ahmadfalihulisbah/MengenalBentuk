package falihul.com;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class KuisTebakActivity extends AppCompatActivity {

    DataSoal dataSoal;
    int skor, benar;
    CountDownTimer countDownTimer;
    ImageButton optiona, optionb, optionc, optiond;
    TextView no_soal, tv_soal, tv_time;
    Drawable jawaban; //aja string-->gk nyambung soale gonanmu image
    ArrayList<Integer> randomSoal;
    int indexKuis;
    Dialog notifDialog;
    Button btn_benar, btn_salah, btn_timeout,btn_mulai;
    TextView title_tv, message_tv;

    private static final long COUNTDOWN_IN_MILLIS = 15000;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        notifDialog = new Dialog(this);
        randomSoal = new ArrayList<>();

        indexKuis = 0;

        tv_time = findViewById(R.id.time);
        tv_soal = findViewById(R.id.soal);
        no_soal = findViewById(R.id.no);
        optiona = findViewById(R.id.optiona);
        optionb = findViewById(R.id.optionb);
        optionc = findViewById(R.id.optionc);
        optiond = findViewById(R.id.optiond);

        dataSoal = new DataSoal();

        MulaiKuis();

    }

    public void endQuis() {
        indexKuis = indexKuis + 1;
    }


    public void lcm() {
        int i;
        int n = 15;
        int a = 11;
        int m = 15;
        int c = 3;
        int Xn0;
        int[] Xn = new int[n];

        Random b = new Random();
        Xn0 = b.nextInt((m-1)- 0) + 0;
        Log.d("LCM Xn0 = ", String.valueOf(Xn0));

        for (i = 1; i <= 11; i++) {

            if (i == 1) {
                Xn[i] = (a * Xn0 + c) % m;
            } else if (i > 1 && i <= 10) {
                Xn[i] = (a * Xn[i - 1] + c) % m;
            } else {
                Log.d("Algoritma LCM", "LCM Selesai");
                break;
            }

            if (Xn[i] == 0) Xn[i] = 1;
            randomSoal.add(Xn[i]);
        }

        updateSoal();

        Log.d("RANDOMSOAL", randomSoal.toString());
    }


    public void cekJawaban() {
        optiona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optiona.getDrawable() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optionb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();

                if (optionb.getBackground() == jawaban)  {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optionc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optionc.getDrawable() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optiond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optiond.getDrawable() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

    }


    public void updateSoal() {
        if (indexKuis == 5) {
            skor = (benar * 20);
            String skorx = String.valueOf(skor);
            Intent i = new Intent(KuisTebakActivity.this, SkorActivity.class);
            i.putExtra("skorakhir", skorx);
            startActivity(i);
        } else {
            no_soal.setText("" + (indexKuis + 1));
            Log.w("Algoritma LCM","X"+String.valueOf(indexKuis + 1)+"="+String.valueOf(randomSoal.get(indexKuis)));
            tv_soal.setText(dataSoal.getSoal(randomSoal.get(indexKuis) - 1));
            optiona.setImageDrawable(dataSoal.getOpsi1(randomSoal.get(indexKuis) - 1));
            optionb.setImageDrawable(dataSoal.getOpsi2(randomSoal.get(indexKuis) - 1));
            optionc.setImageDrawable(dataSoal.getOpsi3(randomSoal.get(indexKuis) - 1));
            optiond.setImageDrawable(dataSoal.getOpsi4(randomSoal.get(indexKuis) - 1));
            jawaban = dataSoal.getJawaban(randomSoal.get(indexKuis) - 1);
        }
    }

    public void MulaiKuis(){
        notifDialog.setContentView(R.layout.activity_kuis);
        btn_mulai = notifDialog.findViewById(R.id.mulai_kuis);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                lcm();
                cekJawaban();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        notifDialog.show();
    }

    public void BenarPopUp() {
        benar = benar + 1;
        notifDialog.setContentView(R.layout.activity_pop_benar);
        btn_benar = notifDialog.findViewById(R.id.lanjut);
        onBackPressed();
        btn_benar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                updateSoal();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notifDialog.show();
    }

    public void SalahPopUp() {
        benar = benar + 0;
        notifDialog.setContentView(R.layout.activity_pop_salah);
        btn_salah = notifDialog.findViewById(R.id.lanjut);
        onBackPressed();
        btn_salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                updateSoal();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notifDialog.show();

    }

    @Override
    public void onBackPressed() {
    }
}