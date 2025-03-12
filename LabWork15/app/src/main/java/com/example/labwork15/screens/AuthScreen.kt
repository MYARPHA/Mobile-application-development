package com.example.labwork15.screens

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Vertical
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun AuthScreen()
{
    Text(text = "Экран авторизации")

    var login = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            login.value,
            { login.value = it },
            label = {Text(
                text = "Логин"
            )},
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        TextField(
            password.value,
            { password.value = it },
            label = {Text(
                text = "Пароль"
            )},
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(192,128,129)))
        {
            Text("Войти", fontSize = 20.sp)
        }
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
            containerColor = Color(192,128,129) ))
        {
            Text("Зарегистрироваться", fontSize = 20.sp)
        }

    }
}
@Preview(showBackground = true)
@Composable
fun AuthScreenPreview()
{
    AuthScreen()
}