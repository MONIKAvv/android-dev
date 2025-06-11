package vv.monika.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ShareBundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_share_bundle)

        val nameid = findViewById<EditText>(R.id.editname)
        val fathernameid = findViewById<EditText>(R.id.editfathername)
        val rollnoid = findViewById<EditText>(R.id.editrollno)
        val phonenumberid = findViewById<EditText>(R.id.editphoneno)
        val shareid = findViewById<Button>(R.id.sharebtn)

        shareid.setOnClickListener {
//            get variables
            val getname = nameid.text.toString()
            val getfathername = fathernameid.text.toString()
            val getrollno = rollnoid.text.toString()
            val getphoneno = phonenumberid.text.toString()

            val intent = Intent(this, BundlestoragePage::class.java)
            intent.putExtra("name", getname)
            intent.putExtra("fathername", getfathername)
            intent.putExtra("rollnumber", getrollno)
            intent.putExtra("phonenumber", getphoneno)
            startActivity(intent)

        }

    }
}