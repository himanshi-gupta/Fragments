package com.example.day3

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Poshmark","In OnCreate()")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val manager = supportFragmentManager
        val frag1 = Fragment1()
        val btn_nav = BottomNav()
        if (savedInstanceState == null) {
            manager.beginTransaction()
                .add(R.id.top_view, frag1, "Frag1")
                .add(R.id.bottom_view, btn_nav)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Poshmark","In onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Poshmark","In onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Poshmark","In onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Poshmark","In onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Poshmark","In onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Poshmark","In OnDestroy()")
    }

}