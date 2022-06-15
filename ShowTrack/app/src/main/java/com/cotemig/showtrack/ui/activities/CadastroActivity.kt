package com.cotemig.showtrack.ui.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.cotemig.showtrack.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var btnBackButton = findViewById<ImageButton>(R.id.backButton)

        btnBackButton.setOnClickListener{
            backButtonClick()
        }

        var btnConcluir = findViewById<Button>(R.id.concluirBtn)

        btnConcluir.setOnClickListener {
            concluirClick()
        }
    }

    fun backButtonClick() {
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun concluirClick(){
        finish()
    }
}