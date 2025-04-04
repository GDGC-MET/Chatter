package com.example.chatter.Ui_Screens.HomeScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Chatter",
                        fontSize = 25.sp
                    )
                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icons.Default.AccountCircle
                    }
                }
            )

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icons.Default.Add
            }


        }

    ) {
        paddingValues ->
        Row(
            modifier = Modifier.padding(paddingValues)
        ) {

        }
    }
}