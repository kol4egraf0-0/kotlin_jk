package com.example.foodapp.Activites

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.foodapp.R

@Composable
@Preview
fun TopBar(){
    val horizontalPadding = 16.dp
    val verticalPadding = 16.dp
    ConstraintLayout(modifier = Modifier.fillMaxSize().wrapContentHeight()) {
        val(bluebox, title1,title2,profile, building,whitebox)=createRefs()

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(255.dp)
            .background(color = colorResource(R.color.blue))
            .constrainAs(bluebox)
            {
                top.linkTo(parent.top)
            }
        )
        Image(painter = painterResource(R.drawable.building),
            contentDescription = null,
            modifier = Modifier.constrainAs(building){
                bottom.linkTo(bluebox.bottom)
            }
        )
        Image(painter = painterResource(R.drawable.profile),
            contentDescription = null,
            modifier = Modifier.
                padding(horizontal = horizontalPadding, vertical = verticalPadding)
            .constrainAs(profile){
                bottom.linkTo(bluebox.bottom)
            }
        )
        Text(
            text = "Доброе утро, мужичек",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .constrainAs(title1){
                    top.linkTo(profile.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Text(
            text = "Что делашеь сегодня??",
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(title2){
                    top.linkTo(profile.bottom)
                    bottom.linkTo(whitebox.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
    }
}




