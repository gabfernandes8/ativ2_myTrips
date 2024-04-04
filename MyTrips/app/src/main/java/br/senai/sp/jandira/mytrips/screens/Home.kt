package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

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
                    .padding(start = 15.dp, bottom = 15.dp),
                color = Color(0xff565454)
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

        Spacer(modifier = Modifier.height(20.dp))

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
                    color = Color(0xffA09C9C),
                    fontSize = 24.sp
                    )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = ""
                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column {
            Text(
                text = "Past Trips",
                fontSize = 23.sp,
                modifier = Modifier
                    .padding(start = 15.dp),
                color = Color(0xff565454)
            )

            LazyColumn(modifier = Modifier
                    .padding(
                        start = 15.dp,
                        end = 15.dp,
                        bottom = 0.dp,
                        top = 10.dp
                    )
            ){
                items(2){
                    Card(modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(5.dp)
                    ){

                    }
                }
        }

    }
    }
}
@Preview (showBackground = true)
@Composable
fun HomePreview() {
        Home()
}