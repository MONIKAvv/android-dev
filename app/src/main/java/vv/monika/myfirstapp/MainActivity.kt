package vv.monika.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.cazaea.sweetalert.SweetAlertDialog


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

//            menucustom.showMenu(this, it)
//            SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
//                .setTitleText("Good job!")
//                .setContentText("You clicked the button Monika yeeeeee!!!")
//                .setConfirmText("Okay!")
//                .show()

//            go to next page
            val intent = Intent(this,LinearHorizontalActivity::class.java )
            startActivity(intent)

//            val dialog = AlertDialog.Builder(this)
//            dialog.setTitle("You sure you want to delete this?")
//            dialog.setMessage(R.string.message)
//            dialog.setIcon(R.drawable.baseline_add_reaction_24)

//            dialog.setPositiveButton("YES"){dialogInterface, which ->
//                Toast.makeText(this, "Clicked Yes", Toast.LENGTH_SHORT).show()
//            }
//
//            dialog.setNegativeButton("NO"){dialogInterface, which ->
//                Toast.makeText(this, "Clicked No", Toast.LENGTH_SHORT).show()
//            }
//
//            dialog.setNeutralButton("CANCEL"){dialogInterface, which ->
//                Toast.makeText(this, "Clicked cancel", Toast.LENGTH_SHORT).show()
//            }

//            val alertDialog:AlertDialog = dialog.create()
//            alertDialog.setCancelable(false)
//            alertDialog.show()




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