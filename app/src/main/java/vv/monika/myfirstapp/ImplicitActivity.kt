package vv.monika.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)

        val openphonecall = findViewById<Button>(R.id.button18)
        val opencamera = findViewById<Button>(R.id.button19)
        val sharetext = findViewById<Button>(R.id.button20)
        val openwebpage = findViewById<Button>(R.id.button14)

        openwebpage.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://neatroots.com/"))
            startActivity(intent)
        }
        openphonecall.setOnClickListener {
val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel: 1234543212")
            startActivity(intent)
        }
        opencamera.setOnClickListener {
val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        sharetext.setOnClickListener {
val text = findViewById<EditText>(R.id.editTextText).text.toString()
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, text)
            startActivity(Intent.createChooser(intent,"Share via"))
        }

        }

}