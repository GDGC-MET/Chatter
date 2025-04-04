package com.example.chatter.Ui_Screens.SignupScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SignUPPage(
    navController: NavController
) {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Text(
            text = "Create Account",
            fontSize = 32.sp,
            modifier = Modifier.padding(bottom = 16.dp)

        )

//        username
        OutlinedTextField(
            value = username,
            onValueChange = { username = it},
            label = {
                Text(
                    text = "Enter your username"
                )
            },
            modifier = Modifier.padding(bottom = 16.dp)
        )

//        email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            label = {
                Text(
                    text = "Enter your email address"
                )
            },
            modifier = Modifier.padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            )
        )


//        password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            label = {
                Text(
                    text = "Enter your Password"
                )
            },
            modifier = Modifier.padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )

        Button(
            onClick = {
                navController.navigate("Home")
            },
            modifier = Modifier.fillMaxWidth().size(35.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Submit"
            )
        }

        TextButton(
            onClick = {
                navController.navigate("LogIn")
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = "Already an user?? Please Log in"
            )
        }



    }


    
}