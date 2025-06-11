package vv.monika.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.sprite.Sprite

import com.github.ybq.android.spinkit.style.FadingCircle



class BottonNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_botton_navigation)

//        val bottomnavigationbar = findViewById<AnimatedBottomBar>(R.id.bottom_bar)

        val home = HomePageActivity()
        val alarm = AlarmPageActivity()
        val bread = BreadPageActivity()
        val cart = CartFragmentActivity()

        val progressBar = findViewById<View>(R.id.spin_kit) as ProgressBar
        val doubleBounce: Sprite = FadingCircle()
        progressBar.indeterminateDrawable = doubleBounce


    }

}