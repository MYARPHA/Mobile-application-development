package com.example.labwork15.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun ProfileScreen(
    login: String = "Myarpha",
    name: String = "Alina",
    age: Int = 19,
    country: String = "Russia",
    about: String = "Люблю спать"
)
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Профиль пользователя")
        Text(text = "Логин: $login")
        Text(text = "Имя: $name")
        Text(text = "Возраст: $age")
        Text(text = "Страна: $country")
        Text(text = "О себе: $about")

        androidx.compose.material3.Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = androidx.compose.ui.graphics.Color(192, 128, 129)
            )
        )
        {
            Text("Назад", fontSize = 20.sp)
        }
    }

}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview()
{
    ProfileScreen()
}