package com.example.chatter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatter.Ui_Screens.HomeScreen.HomeScreen
import com.example.chatter.Ui_Screens.LogInScreen.LogINPage
import com.example.chatter.Ui_Screens.SignupScreen.SignUPPage
import com.example.chatter.ui.theme.ChatterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatterTheme {
            }
        }
    }
}



@Composable
    fun NavSetup() {

        val navController = rememberNavController()

    NavHost(
        startDestination = "SignUp",
        navController = navController
    ) {
        composable("SignUp") {
            SignUPPage(navController)
        }
        composable("LogIn") {
            LogINPage(navController)
        }
        composable("Home") {
            HomeScreen()
        }






    }
    }


    


