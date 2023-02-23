package kgapps.personalnotes.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kgapps.personalnotes.MainActivity
import kgapps.personalnotes.R
import kgapps.personalnotes.utils.currentDate
import kgapps.personalnotes.utils.toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        toast("Launched")

        CoroutineScope(Dispatchers.Main).launch {
            delay(10000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }

    }

}