package net.simplifiedcoding.tmdbmovies.ui.movies

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.simplifiedcoding.tmdbmovies.R
import net.simplifiedcoding.tmdbmovies.ui.theme.AppTheme
import net.simplifiedcoding.tmdbmovies.ui.theme.spacing


@Composable
fun MovieItem() {
    val spacing = MaterialTheme.spacing
    Box(
        modifier = Modifier
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(MaterialTheme.colorScheme.surfaceVariant, MaterialTheme.colorScheme.surface),
                    start = Offset(0f, Float.POSITIVE_INFINITY),
                    end = Offset(Float.POSITIVE_INFINITY, 0f)
                )
            )
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(spacing.extraSmall)
            .clip(RoundedCornerShape(spacing.small))
            .shadow(elevation = 1.dp)
    ) {

        Row(
            modifier = Modifier
                .padding(spacing.small)
                .fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.bg_jurassic_world),
                contentDescription = "Jurassic World",
                modifier = Modifier.weight(0.3f)
            )

            Column(
                modifier = Modifier
                    .weight(0.7f)
                    .padding(start = spacing.medium)
            ) {
                Text(
                    text = "Jurassic World Dominion",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(modifier = Modifier.size(spacing.small))

                Text(
                    text = "Four years after Isla Nublar was destroyed, dinosaurs now live—and hunt—alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all, whether human beings are to remain the apex predators on a planet they now share with history’s most fearsome creatures.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.size(10.dp))

                Text(
                    text = "IMDB 8.9",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clip(RoundedCornerShape(spacing.extraSmall))
                        .background(Color.Yellow)
                        .padding(
                            start = spacing.small,
                            end = spacing.small,
                            top = spacing.extraSmall,
                            bottom = spacing.extraSmall
                        )
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MovieItemPreviewDark() {
    AppTheme {
        MovieItem()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun MovieItemPreviewLight() {
    AppTheme {
        MovieItem()
    }
}