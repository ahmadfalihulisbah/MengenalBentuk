package falihul.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton

class PanduanMateri2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan_materi2)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val kembali : ImageButton = findViewById(R.id.back2)
        kembali.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.back2 -> {
                val kekembali = Intent(this@PanduanMateri2Activity, MacamBendaActivity::class.java)
                startActivity(kekembali)
            }
        }
    }
}