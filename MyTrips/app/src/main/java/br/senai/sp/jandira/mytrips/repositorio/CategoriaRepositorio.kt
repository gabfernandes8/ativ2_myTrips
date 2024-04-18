package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categoria
import br.senai.sp.jandira.mytrips.model.Viagem
import java.time.LocalDate

class CategoriaRepositorio {

    @Composable
    fun listarTodasAsCategorias(): List <Categoria> {

        val mountain = Categoria(
            id = 1,
            nome = "Mountain",
            icone = painterResource(id = R.drawable.mountain)
        )

        val snow = Categoria(
            id = 2,
            nome = "Snow",
            icone = painterResource(id = R.drawable.snow)
        )

        val beach = Categoria(
            id = 3,
            nome = "Beach",
            icone = painterResource(id = R.drawable.beach)
        )

        return listOf(mountain, snow, beach)

    }

}