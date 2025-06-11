package vv.monika.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.serialization.descriptors.StructureKind
import kotlin.math.log

class SpinnerActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)

        spinner = findViewById(R.id.spinner)

        val spinnerlist = listOf("apple", "banana", "mango", "papaya", "kiwi", "avagadro")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerlist)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner.adapter = arrayAdapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var selectedItem = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@SpinnerActivity, "$selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
            }


        }
    }
}