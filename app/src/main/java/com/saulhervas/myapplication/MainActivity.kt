package com.saulhervas.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var tvleft: TextView
    private lateinit var tvright: TextView
    private lateinit var imageView: ImageView
    val imageList = listOf(
        R.drawable.bonsai1,
        R.drawable.bonsai2,
        R.drawable.bonsai3,
        R.drawable.bonsai4,
        R.drawable.bonsai5,
        R.drawable.bonsai6,
        R.drawable._1_juniper_bonsai_reyes
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn = findViewById(R.id.btnCambiar)
        tvleft = findViewById(R.id.twparrafoIzquierdo)
        tvright = findViewById(R.id.twparrafoDerecho)
        imageView = findViewById(R.id.imageView)

        tvleft.text = generarParrafoRandom()
        tvright.text = generarParrafoRandom()

        btn.setOnClickListener {
            tvleft.text = generarParrafoRandom()
            tvright.text = generarParrafoRandom()
        }

        imageView = findViewById(R.id.imageView)
        setImage(getRandomIndex())
        imageView.setOnClickListener {
            setImage(getRandomIndex())
        }

    }

    //Funciones
    private fun generarParrafoRandom(): String {
        val parrafos = listOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ",
            "Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.",
            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, ",
            "Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.",
            "Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, " +
                    "ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis.",
            "Sed eget elit mauris. Integer ut tellus et dui tempus varius. Vivamus non odio orci. Integer in luctus libero. Etiam id diam eget quam pulvinar tincidunt. Vivamus accumsan nulla id tempus vestibulum",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ac magna sapien. Nulla ultricies, nulla sed finibus bibendum, magna magna malesuada nulla, a laoreet odio nulla vel nunc. Vestibulum auctor, " +
                    "libero vel malesuada consequat, felis libero hendrerit dolor.",
            "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.",
            "In hac habitasse platea dictumst. Nulla vitae elit libero, a pharetra augue.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit."

        )
        return parrafos.random()
    }

    private fun setImage(index: Int) {
        imageView.setImageResource(imageList[index])
    }

    private fun getRandomIndex(): Int {
        return imageList.indices.random()
    }

}