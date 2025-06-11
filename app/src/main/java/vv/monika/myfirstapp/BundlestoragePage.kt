package vv.monika.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.jar.Attributes.Name

class BundlestoragePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bundlestorage_page)

        val name = findViewById<TextView>(R.id.storename)
        val fathername = findViewById<TextView>(R.id.storefathername)
        val rollnumber = findViewById<TextView>(R.id.storerollno)
        val phonenumber = findViewById<TextView>(R.id.storephone)

        val intent = intent

        val Name = intent.getStringExtra("name")
        val fatherName = intent.getStringExtra("fathername")
        val rollNumber = intent.getStringExtra("rollnumber")
        val phoneNumber = intent.getStringExtra("phonenumber")

        name.text = "Name: $Name"
        fathername.text = "Father's Name: $fatherName"
        rollnumber.text = "$rollNumber"
        phonenumber.text = "Phone Number: $phoneNumber"


    }
}