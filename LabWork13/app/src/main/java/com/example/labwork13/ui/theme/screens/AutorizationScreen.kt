package com.example.labwork13.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground =  true)
@Composable
fun Autorize() {
    var login = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }

    Column {
        TextField(
            login.value,
            {login.value = it},
            label = {
                Text(
                    text = "Логин: "
                )
            }
        )

        TextField(
            password.value,
            {password.value = it},
            label = {
                Text(
                    text = "Пароль: "
                )
            }
        )

        Button(onClick = {}) {
            Text("АВТОРИЗОВАТЬСЯ!!!!!!!!!!БЫСТРО")
        }
    }
}
