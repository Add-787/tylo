/**
 * Created by developer on 14-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.psyluckco.tylo.home.HomeRoute
import com.psyluckco.tylo.record.RecordRoute

@Composable
fun MainNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = TyloDestinations.HOME_ROUTE
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier.fillMaxSize()
    ) {
        composable(
            route = TyloDestinations.HOME_ROUTE
        ) {
            navBackStackEntry ->
                HomeRoute()

        }

        composable(route = TyloDestinations.RECORD_ROUTE) {
            navBackStackEntry ->
            RecordRoute()
        }

    }



}