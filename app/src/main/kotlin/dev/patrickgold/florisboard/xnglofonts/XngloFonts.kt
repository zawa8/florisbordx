package dev.patrickgold.florisboard.xnglofonts

import android.content.Context
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

data class XngloFontOption(
    val id: String,
    val displayName: String,
    val assetFileName: String,
)

object XngloFonts {
    val ALL = listOf(
        // xi38asc
    XngloFontOption("xb38asc", "xNglobNgali", "xb38asc.ttf"),
    XngloFontOption("xe38asc", "xNgloiNgliS", "xe38asc.ttf"),
    XngloFontOption("xg38asc", "xNgloguzraji", "xg38asc.ttf"),
    XngloFontOption("xh38asc", "xNglovinqi", "xh38asc.ttf"),
    XngloFontOption("xj38asc", "xNglojelugu", "xj38asc.ttf"),
    XngloFontOption("xk38asc", "xNgloknRa", "xk38asc.ttf"),
    XngloFontOption("xm38asc", "xNglomlyalxm", "xm38asc.ttf"),
    XngloFontOption("xo38asc", "xNglooriya", "xo38asc.ttf"),
    XngloFontOption("xp38asc", "xNglopnzabi", "xp38asc.ttf"),
    XngloFontOption("xs38asc", "xNglosinvla", "xs38asc.ttf"),
    XngloFontOption("xt38asc", "xNglotmil", "xt38asc.ttf"),
        // xi52asc
    XngloFontOption("xb52asc", "xNglobNgali x52", "xb52asc.ttf"),
    XngloFontOption("xe52asc", "xNgloiNgliS x52", "xe52asc.ttf"),
    XngloFontOption("xg52asc", "xNgloguzraji x52", "xg52asc.ttf"),
    XngloFontOption("xh52asc", "xNglovinqi x52", "xh52asc.ttf"),
    XngloFontOption("xj52asc", "xNglojelugu x52", "xj52asc.ttf"),
    XngloFontOption("xk52asc", "xNgloknRa x52", "xk52asc.ttf"),
    XngloFontOption("xm52asc", "xNglomlyalxm x52", "xm52asc.ttf"),
    XngloFontOption("xo52asc", "xNglooriya x52", "xo52asc.ttf"),
    XngloFontOption("xp52asc", "xNglopnzabi x52", "xp52asc.ttf"),
    XngloFontOption("xs52asc", "xNglosinvla x52", "xs52asc.ttf"),
    XngloFontOption("xt52asc", "xNglotmil x52", "xt52asc.ttf"),
    )
    const val DEFAULT_ID = "xh38asc"
    fun byId(id: String) = ALL.find { it.id == id }

    fun fontFamily(context: Context, id: String): FontFamily {
        val opt = byId(id) ?: byId(DEFAULT_ID)!!
        return FontFamily(Font(opt.assetFileName, context.assets))
    }
}
