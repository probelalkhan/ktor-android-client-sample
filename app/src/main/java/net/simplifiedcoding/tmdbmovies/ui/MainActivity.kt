package net.simplifiedcoding.tmdbmovies.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.simplifiedcoding.tmdbmovies.ui.movies.MovieItem
import net.simplifiedcoding.tmdbmovies.ui.movies.MovieList
import net.simplifiedcoding.tmdbmovies.ui.theme.AppTheme
import net.simplifiedcoding.tmdbmovies.ui.theme.spacing

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