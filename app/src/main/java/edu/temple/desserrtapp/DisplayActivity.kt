package edu.temple.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        //Sets up title
        setTitle("Select a cheesecake")

        //ImageView from the Second Activity
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        //TextView from the Second Activity
        val textView2 = findViewById<TextView>(R.id.textView2)

        //Sets up TextView
        val description = intent.getStringExtra("Description")
        textView2.setText(description)

        //Set up ImageView and connect it with images
        val imageView: ImageView = findViewById(R.id.imageView2)
        val bundle: Bundle? = intent.extras
        if( bundle != null) {
            val putImage: Int = bundle.getInt("image")
            imageView2.setImageResource(putImage)
        }

        //Moves back to MainActivity aka main screen
        findViewById<Button>(R.id.button).setOnClickListener(){
            finish()
        }
    }

}