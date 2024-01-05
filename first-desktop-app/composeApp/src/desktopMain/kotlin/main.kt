import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    val icon = painterResource("icons/cv18-icon.jpg")
    Window(onCloseRequest = ::exitApplication, title = "Meu primeiro aplicativo Desktop com Kotlin", icon = icon) {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}