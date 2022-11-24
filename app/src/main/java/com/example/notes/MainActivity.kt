package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.list_fragment, ListFragment())
            .commit()

//        binding.btnAdd.setOnClickListener {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.list_fragment, ShowNoteFragment())
//                .commit()
//        }
    }
}