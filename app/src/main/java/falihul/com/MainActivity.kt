package falihul.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_biodata.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val belajar : ImageButton = findViewById(R.id.buttonBelajar)
        val kuis : ImageButton = findViewById(R.id.buttonKuis)
        val tentang : ImageButton = findViewById(R.id.buttonAbout)
        val keluar : ImageButton = findViewById(R.id.buttonExit)
        belajar.setOnClickListener(this)
        kuis.setOnClickListener(this)
        tentang.setOnClickListener(this)
        keluar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.buttonBelajar -> {
                val kebelajar = Intent( this@MainActivity, BelajarActivity::class.java)
                startActivity(kebelajar)
            }
            R.id.buttonKuis -> {
                val kekuis = Intent( this@MainActivity, KuisActivity::class.java)
                startActivity(kekuis)
            }
            R.id.buttonAbout -> {
                val ketentang = Intent( this@MainActivity, BiodataActivity::class.java)
                startActivity(ketentang)
            }
            R.id.buttonExit -> {
                moveTaskToBack(true);
            }
        }
    }
}