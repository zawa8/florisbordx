package dev.patrickgold.florisboard.xnglofonts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun XngloFontPickerScreen(
    currentFontId: String,
    onFontSelected: (String) -> Unit,
    onBack: () -> Unit,
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("xNglo Font") },
                navigationIcon = {
                    TextButton(onClick = onBack) { Text("←") }
                }
            )
        }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            items(XngloFonts.ALL) { opt ->
                val ff = remember(opt.id) {
                    try { XngloFonts.fontFamily(context, opt.id) }
                    catch (e: Exception) { FontFamily.Default }
                }
                ListItem(
                    headlineContent = {
                        Text(opt.displayName, fontFamily = ff, fontSize = 18.sp)
                    },
                    supportingContent = {
                        Text("AaBbCcKkGg 0123", fontFamily = ff, fontSize = 14.sp)
                    },
                    trailingContent = {
                        if (opt.id == currentFontId)
                            Text("✓", color = MaterialTheme.colorScheme.primary)
                    },
                    modifier = Modifier.clickable { onFontSelected(opt.id) }
                )
                HorizontalDivider()
            }
        }
    }
}
