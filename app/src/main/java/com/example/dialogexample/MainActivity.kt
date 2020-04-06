package com.example.dialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val dialogFragment = CustomDialogFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view: View) {
        dialogFragment.show(fragmentManager, "Dialog")
    }
}
