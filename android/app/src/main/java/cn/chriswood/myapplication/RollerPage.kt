package cn.chriswood.myapplication

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RollerPage(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var rollerRes by remember {
        mutableIntStateOf(1)
    }
    val imageResource = when (rollerRes) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(imageResource),
            contentDescription = "1"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            rollerRes = (1..6).random()
        }) {
            Text(text = "Start Roller")
        }
        Text(text = rollerRes.toString())

        Button(onClick = {
            // 创建Intent，指向目标Activity
            val intent = Intent(context, MyReactActivity::class.java)
            // 启动目标Activity
            context.startActivity(intent)
        }) {
            Text(text = "跳转react native入口页面")
        }

        Spacer(Modifier.height(8.dp))

        Button(onClick = {
            // 创建Intent，指向目标Activity
            val intent = Intent(context, SecondActivity::class.java)
            // 启动目标Activity
            context.startActivity(intent)
        }) {
            Text(text = "跳转SecondActivity页面")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RollerPagePreview() {
    RollerPage("Unit Converter")
}