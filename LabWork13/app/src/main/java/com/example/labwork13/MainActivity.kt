package com.example.labwork13

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat.Columns
import com.example.labwork13.ui.theme.LabWork13Theme
import com.example.labwork13.ui.theme.screens.Autorize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LabWork13Theme {
                    Autorize()
                }
            }
        }
    }

@Composable
fun Task2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
       Text(
           text = "Задание 2",
           fontSize = 20.sp,
           color = Color.Black
       )
    }
}

@Preview(showBackground = true)
@Composable
fun Task2Preview()
{
    LabWork13Theme {
        Task2()
    }
}

@Composable
fun Task3Column() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Добро пожаловать", fontSize = 20.sp)
        Button(onClick = {}) {
            Text("ОК")
        }
    }
}

@Composable
fun Task3Row() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Добро пожаловать", fontSize = 20.sp)
        Button(onClick = {}) {
            Text("ОК")
        }
    }
}

@Composable
fun Task3Box() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Добро пожаловать", fontSize = 20.sp)
            Button(onClick = {}) {
                Text("ОК")
            }
        }
    }
}

@Composable
fun Greeting(groupName: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $groupName!",
        modifier = modifier
    )
}

@Composable
fun BoxLayout()
{
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        // уголки
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.TopStart)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.TopEnd)
                .background(color = Color(255, 165, 0))
        )
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.BottomStart)
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.BottomEnd)
                .background(Color.Yellow)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.BottomCenter)
                .background(Color.Gray)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter)
                .background(color = Color(66, 170, 255))
        )
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterStart)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterEnd)
                .background(color = Color(241, 156, 187))
        )
        Box(
            modifier = Modifier
                .height(750.dp)
                .width(300.dp)
                .align(Alignment.Center)
                .background(Color.Black)
        )
    }
}

@Composable
fun BoxLayoutLine()
{
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.05f)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.15f)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .background(Color.Yellow)
        )
    }
}

@Composable
fun Task4()
{
    val items = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ){
        items.forEach { item ->
            Text(
                text = item,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Task4Previw()
{
    LabWork13Theme {
        Task4()
    }
}

@Preview (showBackground = true)
@Composable
fun BoxLayoutLinePreview()
{
    LabWork13Theme {
        BoxLayoutLine()
    }
}

@Preview(showBackground = true)
@Composable
fun BoxLayoutPreview()
{
    LabWork13Theme {
        BoxLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun Task3ColumnPreview()
{
    LabWork13Theme {
        Task3Column()
    }
}
@Preview(showBackground = true)
@Composable
fun Task3RowPreview()
{
    LabWork13Theme {
        Task3Row()
    }
}

@Preview(showBackground = true)
@Composable
fun Task3BoxPreview()
{
    LabWork13Theme {
        Task3Box()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LabWork13Theme {
        Greeting("Android")
    }
}