package br.senai.sp.jandira.mytrips

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
                    Home()
                }
            }
        }
    }
}

@Composable
fun Login() {

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

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
                value = emailState.value,
                onValueChange = {
                                emailState.value = it
                },
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
                value = passwordState.value,
                onValueChange = {
                                passwordState.value = it
                },
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

    var usernameState = remember {
        mutableStateOf("")
    }

    var phoneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
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
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                color = Color(0xffcf05f0),
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(bottom = 2.dp)
            )
            Text(
                text = "Create a new account",
                color = Color(0xffa09c9c)
            )
            Box(modifier = Modifier
                .fillMaxHeight()
                .width(130.dp)
                .padding(20.dp)
            ) {
                    Card(modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                        border = BorderStroke(2.dp, Brush.horizontalGradient(listOf(Color(0xffcf06f0), Color(0x1acf06f0)))),
                        colors = CardDefaults.cardColors(Color(0xffF6F6F6)),
                    shape = RoundedCornerShape(100.dp)
                        ) {
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = Color(0xffcf06f0),
                                modifier = Modifier
                                    .size(85.dp)
                            )
                        }
                    }
                Card (
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .background(Color.Transparent)
                        .height(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.AddAPhoto,
                        contentDescription = "",
                        tint = Color(0xffCB27A8),
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
                }
        }

        Column(modifier = Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        end = 15.dp,
                        start = 15.dp
                    ),
                value = usernameState.value,
                onValueChange = {
                                usernameState.value = it
                },
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 15.dp,
                        end = 15.dp,
                        start = 15.dp
                    ),
                value = phoneState.value,
                onValueChange = {
                                phoneState.value = it
                },
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 15.dp,
                        end = 15.dp,
                        start = 15.dp
                    ),
                value = emailState.value,
                onValueChange = {
                                emailState.value = it
                },
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 15.dp,
                        end = 15.dp,
                        start = 15.dp
                    ),
                value = passwordState.value,
                onValueChange = {
                                passwordState.value = it
                },
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
                .fillMaxWidth()
                .padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = false, onCheckedChange = {},
                modifier = Modifier
                    .height(30.dp),
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xffcf06f0),
                    uncheckedColor = Color(0xffcf06f0)
                )
            )
            Text(
                text = "Over 18?"
            )
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(
                end = 15.dp,
                start = 15.dp
            ),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffcf05f0))
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
            Text(modifier = Modifier
                .padding(end = 15.dp),
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

@Composable
fun Home(){

    var searchState = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Surface(modifier = Modifier
            .fillMaxWidth()
            .height(230.dp),
            shape = RoundedCornerShape(0)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.paris2),
                contentDescription = "Paris",
                contentScale = ContentScale.Crop
            )

            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 12.dp, end = 20.dp, start = 12.dp, bottom = 10.dp)
            ) {
                Column(modifier = Modifier
                    .align(alignment = Alignment.End),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card (modifier = Modifier
                        .size(70.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tay),
                            contentDescription = "",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(modifier = Modifier.padding(top = 7.dp),
                        text = "Taylor Swift",
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(Color(0xff000000), Offset(0f, 3f), 5f)
                        )
                    )
                }

                Column() {
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = "You're in Paris",
                            fontSize = 20.sp,
                            color = Color.White,
                            style = TextStyle(
                                shadow = Shadow(Color(0xff000000), Offset(0f, 3f), 5f)
                            )
                        )
                    }

                    Text(
                        text = "My Trips",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 30.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(Color(0xff000000), Offset(0f, 3f), 5f)
                        )
                    )

                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column() {
            Text(
                text = "Categories",
                fontSize = 23.sp,
                modifier = Modifier
                    .padding(start = 15.dp, bottom = 15.dp)
            )

            LazyRow(modifier = Modifier
                .padding(start = 15.dp)){
                items(4){
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                        .padding(5.dp)
                        ) {

                        Column(modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xffCF07F0)),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mountain),
                                contentDescription = "Ícone de montanhas, com árvores em volta",
                                modifier = Modifier
                                    .height(50.dp)
                            )
                            Text(modifier = Modifier
                                .offset(0.dp, -10.dp),
                                text = "Mountain",
                                fontSize = 22.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            value = searchState.value,
            onValueChange = {
                searchState.value = it
            },
            placeholder = {
                          Text(
                              text = "Search your destiny",
                              
                          )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = ""
                )
            }
        )

    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginPreview() {
//    MyTripsTheme {
//        Login()
//    }
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun SignUpPreview() {
//    MyTripsTheme {
//        SignUp()
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    MyTripsTheme {
        Home()
    }
}
