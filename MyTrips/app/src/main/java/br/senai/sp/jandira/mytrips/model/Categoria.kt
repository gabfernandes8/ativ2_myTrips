package br.senai.sp.jandira.mytrips.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Categoria(
    var id: Int = 0,
    var nome: String = "",
    var icone: Painter? = null
)
