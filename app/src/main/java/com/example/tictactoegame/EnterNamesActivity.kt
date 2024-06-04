package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoegame.databinding.ActivityEnterNamesBinding

class EnterNamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEnterNamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnterNamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startGameBtn.setOnClickListener {
            val playerXName = binding.playerXName.text.toString()
            val playerOName = binding.playerOName.text.toString()

            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("playerXName", playerXName)
            intent.putExtra("playerOName", playerOName)
            startActivity(intent)
        }
    }
}
