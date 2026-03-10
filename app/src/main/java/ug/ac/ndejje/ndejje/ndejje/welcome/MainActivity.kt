package ug.ac.ndejje.ndejje.ndejje.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {
                StudentIdCard()
                }
            }
        }
    }

@Composable
fun StudentInfo() {
    val profileImage = painterResource(R.drawable.student_photo)
    val logoImage = painterResource(R.drawable.ndu_logo)
    Box(modifier = Modifier.padding(10.dp)) {

    }

    Column(
        modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box() {


    }
        Image(
            painter = profileImage,

            contentDescription = "Student Photo",

            contentScale = ContentScale.Crop,

            modifier = Modifier

                .clip(RoundedCornerShape(percent = 10))

        )

        Image(
            painter = logoImage,

            contentDescription = null,

            modifier = Modifier

                .size(80.dp)
                .align(Alignment.CenterHorizontally)
                .padding(4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
    Text(

        text = stringResource(R.string.Student_name),

        style = MaterialTheme.typography.headlineSmall,

        fontWeight = FontWeight.Bold,

        color = MaterialTheme.colorScheme.primary

    )

    Text(

        text = stringResource(R.string.programmes).uppercase(),

        style = MaterialTheme.typography.labelMedium,

        color = MaterialTheme.colorScheme.primary,

        modifier = Modifier.padding(vertical = 4.dp)

    )


        HorizontalDivider(

            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp),

            thickness = 1.dp,

            color = MaterialTheme.colorScheme.outlineVariant

        )

        Row(modifier = Modifier) {
        Text(

        text = "REG NO.:",

        style = MaterialTheme.typography.labelLarge,

        fontWeight = FontWeight.ExtraBold

    )

    Text(

        text = "24/1/314/D/052",

        style = MaterialTheme.typography.bodyLarge,

        fontFamily = FontFamily.Monospace
    )
    }
}
    }

@Composable
fun StudentIdCardContainer(modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
        )
    ) {
        StudentInfo()
    }
}


@Preview(showBackground = true)
@Composable
fun StudentIdCard() {
    NdejjeWelcomeAppTheme {
        StudentIdCardContainer()
    }
}