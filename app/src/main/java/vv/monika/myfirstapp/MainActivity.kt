package vv.monika.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val menucustom = Menucustom()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val toastbutton = findViewById<Button>(R.id.button)
        Toast.makeText(this, "create app", Toast.LENGTH_SHORT).show()


        toastbutton.setOnClickListener {
//            Toast.makeText(this, "This is button toast", Toast.LENGTH_SHORT).show()
//            toastbutton.makeText(this,"Hello World !",toastbutton.LENGTH_LONG,toastbutton.DEFAULT,true);
//FancyToast.makeText(this, "This is fancy toast", FancyToast.LENGTH_SHORT, FancyToast.CONFUSING, true).show()

//            SnToast.Builder()
//                .context(this@MainActivity)
//                .type(Type.SUCCESS)
//                .message("Success !") //.cancelable(false or true) Optional Default: False
//                // .iconSize(int size) Optional Default: 34dp
//                // .textSize(int size) Optional Default 18sp
//                 .animation( true)
////            Optional Default: True
//                // .duration(int ms) Optional Default: 3000ms
//                // .backgroundColor(R.color.example) Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
//                // .icon(R.drawable.example) Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
//                .build()

//            open menu

            menucustom.showMenu(this, it)


        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "start app", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Resume app", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "pause app", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "restart app", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "destroy app", Toast.LENGTH_SHORT).show()
    }
}