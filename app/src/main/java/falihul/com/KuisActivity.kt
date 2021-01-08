package falihul.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton

class KuisActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val kuis : ImageButton = findViewById(R.id.mulai_kuis)
        kuis.setOnClickListener(this)
        val bantuan : ImageButton = findViewById(R.id.question)
        bantuan.setOnClickListener(this)
        val kembali : ImageButton = findViewById(R.id.back)
        kembali.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.mulai_kuis -> {
                val kekuis = Intent(this@KuisActivity, KuisTebakActivity::class.java)
                startActivity(kekuis)
            }
            R.id.question -> {
                val kekuis = Intent(this@KuisActivity, PanduanKuisActivity::class.java)
                startActivity(kekuis)
            }
            R.id.back -> {
                val kekuis = Intent(this@KuisActivity, MainActivity::class.java)
                startActivity(kekuis)
            }
        }
    }
}