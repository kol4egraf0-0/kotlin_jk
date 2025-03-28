package com.example.foodapp.Activites

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodapp.R
import com.google.android.material.bottomappbar.BottomAppBar

@Composable
@Preview
fun BottomAppBar(){
    val bottomMenuItemsList =
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

}