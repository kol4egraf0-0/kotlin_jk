package com.example.foodapp.Activites

import android.widget.Toast
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.R
import com.google.android.material.bottomappbar.BottomAppBar

@Composable
@Preview
fun BottomAppBar(){
    val bottomMenuItemsList = prepareBottomMenu();
    val context = LocalContext.current
    val selected by remember { mutableStateOf("Главная") }

    androidx.compose.material.BottomAppBar(
        backgroundColor = colorResource(R.color.white),
        elevation = 3.dp
    ){
        bottomMenuItemsList.forEach{
            bottomMenuItems ->
            BottomNavigationItem(
                selected=(selected==bottomMenuItems.label),
                onClick = {
                          selected=bottomMenuItems.label
                    Toast.makeText()
                },
                icon = {

                }
            )
        }
    }
}

data class BottomMenuItem(
    val label:String, val icon:Painter
)

@Composable
fun prepareBottomMenu():List<BottomMenuItem>{
    val bottomMenuItemList = arrayListOf<BottomMenuItem>()



    bottomMenuItemList.add(BottomMenuItem(label = "Главная", icon = painterResource(R.drawable.btn_1)))
    bottomMenuItemList.add(BottomMenuItem(label = "Поддержка", icon = painterResource(R.drawable.btn_2)))
    bottomMenuItemList.add(BottomMenuItem(label = "Избранное", icon = painterResource(R.drawable.btn_3)))
    bottomMenuItemList.add(BottomMenuItem(label = "Профиль", icon = painterResource(R.drawable.btn_4)))

    return bottomMenuItemList;
}