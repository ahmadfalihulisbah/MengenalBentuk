package falihul.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton

class PanduanBelajarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_belajar)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val kembali : ImageButton = findViewById(R.id.back)
        kembali.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                val kekembali = Intent(this@PanduanBelajarActivity, BelajarActivity::class.java)
                startActivity(kekembali)
            }
        }
    }
}