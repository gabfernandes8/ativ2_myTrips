package br.senai.sp.jandira.mytrips

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(20.dp)
        ) {
            Text(
                text = "Login",
                color = Color(0xffCF06F0),
                fontSize = 58.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Please sign in to continue.",
                color = Color(0xffa09c9c),
                fontSize = 20.sp
            )
        }
        Column {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = "")
                label = {

                    Text(text = "E-mail")
                }
            )
        }
    }
    }
    //Card(modifier = Modifier
    //    .height(60.dp)
    //    .width(160.dp),
    //    shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 24.dp),
    //    colors = CardDefaults.cardColors(
    //        Color(0xffcf06f0)
    //    )
    //) {}
    //Card(modifier = Modifier
    //    .height(60.dp)
    //    .width(160.dp),
    //    colors = CardDefaults.cardColors(
    //        Color(0xffcf06f0)
    //    )
    //) {}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    MyTripsTheme {
        Login()
    }
}