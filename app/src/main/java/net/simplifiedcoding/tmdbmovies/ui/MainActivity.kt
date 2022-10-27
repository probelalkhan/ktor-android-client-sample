package net.simplifiedcoding.tmdbmovies.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import net.simplifiedcoding.tmdbmovies.ui.movies.MovieList
import net.simplifiedcoding.tmdbmovies.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                MovieList()
            }
        }
    }
}