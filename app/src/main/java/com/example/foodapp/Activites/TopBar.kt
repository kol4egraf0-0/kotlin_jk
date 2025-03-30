package com.example.foodapp.Activites

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    }
}




