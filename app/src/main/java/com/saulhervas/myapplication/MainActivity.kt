package com.saulhervas.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         val btn = findViewById<Button>(R.id.btnCambiar)
         val tvleft = findViewById<TextView>(R.id.twparrafoIzquierdo)
         val tvright = findViewById<TextView>(R.id.twparrafoDerecho)

        tvleft.text = generarParrafoRandom()
        tvright.text = generarParrafoRandom()

        btn.setOnClickListener {
            tvleft.text = generarParrafoRandom()
            tvright.text = generarParrafoRandom()
        }

    }

    private fun generarParrafoRandom(): String {
        val parrafos = listOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.",
            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, " +
                    "similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga.",
            "Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.",
            "Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, " +
                    "ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.",
            "Sed eget elit mauris. Integer ut tellus et dui tempus varius. Vivamus non odio orci. Integer in luctus libero. Etiam id diam eget quam pulvinar tincidunt. Vivamus accumsan nulla id tempus vestibulum",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ac magna sapien. Nulla ultricies, nulla sed finibus bibendum, magna magna malesuada nulla, a laoreet odio nulla vel nunc. Vestibulum auctor, " +
                    "libero vel malesuada consequat, felis libero hendrerit dolor, vel dapibus tortor neque vel sem. Sed eget elit mauris. Integer ut tellus et dui tempus varius. Vivamus non odio orci. Integer in luctus libero. "

        )
        return parrafos.random()
    }


}