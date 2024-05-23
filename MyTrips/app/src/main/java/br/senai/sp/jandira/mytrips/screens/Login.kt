package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R

@Composable
fun Login(controleNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    var signupState = remember {
        mutableStateOf("")
    }

    var msgErroState = remember {
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
                text = stringResource(id = R.string.login),
                color = Color(0xffCF06F0),
                fontSize = 58.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = stringResource(id = R.string.login_desc),
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
                    Text(text = stringResource(id = R.string.email))
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
                label = {@
                    Text(text = stringResource(id = R.string.password))
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xffcf06f0),
                        unfocusedBorderColor = Color(0xffcf06f0),
                        focusedLabelColor = Color(0xff000000)
                    ),

                shape = RoundedCornerShape(12.dp)
            )

            Text(
                text = msgErroState.value,
                color = Color.Red,
                fontWeight = FontWeight.ExtraBold
            )
        }

        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
            horizontalAlignment = Alignment.End){

            Button(
                onClick = {
                          if (emailState.value == "gab@email.com" && passwordState.value == "123"){
                              msgErroState.value == ""

                              controleNavegacao.navigate("home")
                          } else {
                              msgErroState.value = "Usuário ou senha incorretos!"
                          }
                },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffcf06f0)
                )
            ) {
                Text(
                    text = stringResource(id = R.string.signin),
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
                    text = stringResource(id = R.string.desc),
                    color = Color(0xffa09c9c),
                    modifier = Modifier
                        .padding(end = 4.dp)
                )
                Text(
                    text = stringResource(id = R.string.signin_desc),
                    color = Color(0xffcf06f0),
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.clickable {
                        controleNavegacao.navigate("signup")
                    }
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

@Preview
@Composable
fun LoginPreview() {
        //Login(controleNavegacao)
}