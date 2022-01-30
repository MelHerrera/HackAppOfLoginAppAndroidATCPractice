package com.example.hackapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "UserName: " +
                intent.getStringExtra("UserName") +
                "\nPassword: " + intent.getStringExtra("Password")

        val AlerDialogBuilder = AlertDialog.Builder(this)

        AlerDialogBuilder.setTitle("Sensitive data was accessed!")
            .setMessage(message)
            .setCancelable(false)
            .setNegativeButton("OK"){
                dialogInterface: DialogInterface, i:Int ->
                dialogInterface.dismiss()
            }
        AlerDialogBuilder.create().show()
    }
}