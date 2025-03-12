package com.example.labwork15.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.ButtonDefaults

@Composable
fun RegistrationScreen() {
    Text(text = "Экран регистрации")

    var login = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var confirmPassword = remember { mutableStateOf("") }
    var numberPhone = remember { mutableStateOf("") }
    var email = remember { mutableStateOf("") }
    var age = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            login.value,
            { login.value = it },
            label = {
                Text(
                    text = "Введите логин"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        TextField(
            password.value,
            { password.value = it },
            label = {
                Text(
                    text = "Введите пароль"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        TextField(
            confirmPassword.value,
            {confirmPassword.value = it},
            label = {
                Text(
                    text = "Подтвердите пароль"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        TextField(
            numberPhone.value,
            {confirmPassword.value = it},
            label = {
                Text(
                    text = "Введите номер телефона"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        TextField(
            email.value,
            {email.value = it},
            label = {
                Text(
                    text = "Введите Email"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        TextField(
            age.value,
            {age.value = it},
            label = {
                Text(
                    text = "Введите ваш возраст"
                )
            },
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(192, 128, 129)
            )
        )
        {
            Text("ОК", fontSize = 20.sp)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview()
{
    RegistrationScreen()
}