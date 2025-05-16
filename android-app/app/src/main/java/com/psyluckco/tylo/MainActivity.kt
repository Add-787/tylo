package com.psyluckco.tylo

import android.R.attr.y
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.psyluckco.tylo.ui.component.AppLineGraph
import com.psyluckco.tylo.ui.component.BottomNavBar
import com.psyluckco.tylo.ui.component.BottomNavBarItem
import com.psyluckco.tylo.ui.theme.TyloTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TyloTheme {

                val selectedItemIndex = remember { mutableIntStateOf(0) }

                val navController = rememberNavController()
                val navigationActions = remember(navController) {
                    TyloNavigationActions(navController)
                }

                val coroutineScope = rememberCoroutineScope()

                val navBarItems = listOf(
                    BottomNavBarItem(
                        unselectedIconRes = R.drawable.custom_home_unselected_icon,
                        selectedIconRes = R.drawable.custom_home_selected_icon,
                        contentDescription = "Home",
                        isSelected = selectedItemIndex.intValue == 0
                    ),
                    BottomNavBarItem(
                        unselectedIconRes = R.drawable.custom_mic_unselected_icon,
                        selectedIconRes = R.drawable.custom_mic_selected_icon,
                        contentDescription = "Settings",
                        isSelected = selectedItemIndex.intValue == 1
                    ),
                    BottomNavBarItem(
                        unselectedIconRes = R.drawable.custom_placeholder_unselected_icon,
                        selectedIconRes = R.drawable.custom_placeholder_selected_icon,
                        contentDescription = "Settings",
                        isSelected = selectedItemIndex.intValue == 2
                    )

                )

                Box(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MainNavGraph(
                        modifier = Modifier.fillMaxSize()
                    )
                    BottomNavBar(
                        items = navBarItems,
                        onItemSelected = {
                            selectedItemIndex.intValue = it
                        },
                        modifier = Modifier.align(Alignment.BottomCenter)
                    )
                }
            }
        }
    }
}

