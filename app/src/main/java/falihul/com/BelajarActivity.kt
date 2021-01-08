package falihul.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton

class BelajarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val materi1 : ImageButton = findViewById(R.id.menu_bangundatar)
        materi1.setOnClickListener(this)
        val materi2 : ImageButton = findViewById(R.id.menu_bendabangundatar)
        materi2.setOnClickListener(this)
        val bantuan : ImageButton = findViewById(R.id.question)
        bantuan.setOnClickListener(this)
        val kembali : ImageButton = findViewById(R.id.back)
        kembali.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.menu_bangundatar -> {
                val kemateri1 = Intent(this@BelajarActivity, BangunDatarActivity::class.java)
                startActivity(kemateri1)
            }
            R.id.menu_bendabangundatar -> {
                val kemateri2 = Intent(this@BelajarActivity, MacamBendaActivity::class.java)
                startActivity(kemateri2)
            }
            R.id.question -> {
                val kebantuan = Intent(this@BelajarActivity, PanduanBelajarActivity::class.java)
                startActivity(kebantuan)
            }
            R.id.back -> {
                val kekembali = Intent(this@BelajarActivity, MainActivity::class.java)
                startActivity(kekembali)
            }
        }
    }
}