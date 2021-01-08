package falihul.com;

import android.graphics.drawable.Drawable;

public class DataSoal {
    private String pertanyaan[]={
            "Manakah benda yang berbentuk persegi?",
            "Manakah benda yang berbentuk lingkaran?",
            "Pilihlah benda yang berbentuk belah ketupat...",
            "Manakah benda yang berbentuk bangun layang-layang?",
            "Manakah benda yang berbentuk trapesium?",

            "Berbentuk apakah papan tulis?",
            "Pilihlah benda yang sama dengan bentuk persegi...",
            "Telur berbentuk bangun datar...",
            "Tas merupakan benda yang berbentuk?",
            "Manakah bangun datar segitiga?",

            "Manakah benda yang berbentuk oval?",
            "Pilihlah benda yang berbentuk persegi panjang...",
            "Berbentuk apakah mainan bola?",
            "Jam dinding merupakan bentuk dari bangun..?",
            "Berikut ini manakah benda yang berbentuk segitiga?",


    };

    int [] jawaban = {
            R.drawable.pop_jamdinding,
            R.drawable.pop_bola,
            R.drawable.pop_rambujalan,
            R.drawable.pop_layangan,
            R.drawable.pop_tas,

            R.drawable.pop_persegipanjang,
            R.drawable.pop_jamdinding,
            R.drawable.pop_oval,
            R.drawable.pop_trapesium,
            R.drawable.pop_segitiga,

            R.drawable.pop_telur,
            R.drawable.pop_papantulis,
            R.drawable.pop_lingkaran,
            R.drawable.pop_persegi,
            R.drawable.pop_rambujalan22,
    };

    int [][] opsi={
            {R.drawable.pop_jamdinding, },
            {R.drawable.pop_bola, },
            {R.drawable.pop_rambujalan, } ,
            {R.drawable.pop_layangan, },
            {R.drawable.pop_tas, },

            {R.drawable.pop_persegipanjang, },
            {R.drawable.pop_jamdinding, },
            {R.drawable.pop_oval, },
            {R.drawable.pop_trapesium, },
            {R.drawable.pop_segitiga, },

            {R.drawable.pop_telur,},
            {R.drawable.pop_papantulis,},
            {R.drawable.pop_lingkaran,},
            {R.drawable.pop_persegi,},
            {R.drawable.pop_rambujalan22,},
    };

    public  String getSoal(int a){
        String soal = pertanyaan[a];
        return  soal;
    }

    int getOpsi1(int a){
        int pila = opsi[a][0];
        return pila;
    }
    int getOpsi2(int a){
        int pilb = opsi[a][1];
        return pilb;
    }
    int getOpsi3(int a){
        int pilc = opsi[a][2];
        return pilc;
    }

    int getOpsi4(int a){
        int pilc = opsi[a][3];
        return pilc;
    }

    int getJawaban(int a){
        int jwbn = jawaban[a];
        return jwbn;
    }
}
