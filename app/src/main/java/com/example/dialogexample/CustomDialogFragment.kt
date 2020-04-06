package com.example.dialogexample

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle

class CustomDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        return builder
            .setMessage("Привет")
            .setNeutralButton("Закрыть") { dialog, which ->  }
            .create()
    }
}