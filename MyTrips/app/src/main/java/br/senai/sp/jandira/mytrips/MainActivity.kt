package br.senai.sp.jandira.mytrips

import android.graphics.drawable.Icon
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
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
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Card(modifier = Modifier
                .height(50.dp)
                .width(160.dp),
                shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 24.dp),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
        Column(
            modifier = Modifier
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
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 15.dp,
                end = 15.dp,
            ),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 20.dp
                ),
                value = "",
                onValueChange = {},
                leadingIcon = {
                      Icon(
                          imageVector = Icons.Default.Email,
                          contentDescription = "",
                          tint = Color (0xffcf06f0),
                          modifier = Modifier
                                .size(35.dp)
                      )
                },
                label = {
                    Text(text = "E-mail")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(modifier = Modifier
                .fillMaxWidth(),
                value = "",
                onValueChange = {},
                leadingIcon = {
                      Icon(
                          imageVector = Icons.Default.Lock,
                          contentDescription = "",
                          tint = Color (0xffcf06f0),
                          modifier = Modifier
                              .size(40.dp)
                      )
                },
                label = {
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )
        }

        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalAlignment = Alignment.End){
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffcf06f0))
            ) {
                Text(
                    text = "SIGN IN",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Icon (
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = ""
                )
            }
            Row (modifier = Modifier
                .padding(
                    top = 30.dp
                )
            ){
                Text(
                    text = "Don't have an account?",
                    color = Color(0xffa09c9c),
                    modifier = Modifier
                        .padding(end = 4.dp)
                )
                Text(
                    text = "Sign up",
                    color = Color(0xffcf06f0),
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){
            Card(modifier = Modifier
                .height(50.dp)
                .width(160.dp),
                shape = RoundedCornerShape(0.dp, 24.dp, 0.dp, 0.dp),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
    }
}

@Composable
fun SignUp() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(160.dp),
                shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 24.dp),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                color = Color(0xffcf06f0),
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(bottom = 2.dp)
            )
            Text(
                text = "Create a new account",
                color = Color(0xffa09c9c)
            )

            Card {

            }
        }

        Column {

            OutlinedTextField(
                modifier = Modifier,
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "",
                        tint = Color(0xffcf06f0),
                        modifier = Modifier
                            .size(35.dp)
                    )
                },
                label = {
                    Text(text = "Username")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)

                    ),

                shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                modifier = Modifier,
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Smartphone,
                        contentDescription = "",
                        tint = Color(0xffcf06f0),
                        modifier = Modifier
                            .size(35.dp)
                    )
                },
                label = {
                    Text(text = "Phone")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                modifier = Modifier,
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xffcf06f0),
                        modifier = Modifier
                            .size(35.dp)
                    )
                },
                label = {
                    Text(text = "E-mail")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )

            OutlinedTextField(
                modifier = Modifier,
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color(0xffcf06f0),
                        modifier = Modifier
                            .size(35.dp)
                    )
                },
                label = {
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = false, onCheckedChange = {},
                modifier = Modifier
                    .height(50.dp)
            )
            Text(
                text = "Over 18?"
            )
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffcf06f0))
        ) {
            Text(
                text = "CREATE ACCOUNT",
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(5.dp)
            )
        }

        Row (modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(modifier = Modifier
                .padding(end = 3.dp),
                text = "Already have an account?",
                color = Color(0xffa09c9c)
            )
            Text(
                text = "Sign in",
                color = Color(0xffcf06f0),
                fontWeight = FontWeight.ExtraBold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(160.dp),
                shape = RoundedCornerShape(0.dp, 24.dp, 0.dp, 0.dp),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}

        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginPreview() {
  //  MyTripsTheme {
    //    Login()
    //}
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    MyTripsTheme {
        SignUp()
    }
}
