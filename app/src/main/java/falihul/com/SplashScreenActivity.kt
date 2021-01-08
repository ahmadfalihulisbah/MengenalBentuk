package falihul.com

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        Handler ().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}