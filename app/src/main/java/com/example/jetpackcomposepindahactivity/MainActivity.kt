package com.example.jetpackcomposepindahactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }


            val context = LocalContext.current

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

                OutlinedTextField(value = email, onValueChange = { email = it }, label = {

                    Text(text = "Email Address")
                })
                Spacer(modifier = Modifier.height(4.dp))
                OutlinedTextField(value = password, onValueChange = { password = it }, label = {
                    Text(text = "Password")
                })
                Spacer(modifier = Modifier.height(4.dp))
                Button(onClick = {
                    if (email == "1" && password == "1"){
                        context.startActivity(Intent(context, MainActivity3::class.java))
                        Toast.makeText(context, "Berhasil Login", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(context, "Email Atau Password Salah", Toast.LENGTH_SHORT).show()
                    }
                       
                }


                ) {
                    Text(text = "Login")
                }
            }


        }
    }
}


