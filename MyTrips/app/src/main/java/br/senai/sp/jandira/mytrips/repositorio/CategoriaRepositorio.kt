package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categoria
import br.senai.sp.jandira.mytrips.model.Viagem
import java.time.LocalDate

class CategoriaRepositorio {

    @Composable
    fun listarTodasAsCategorias(): List <Categoria> {

        val mountain = Categoria(
            id = 1,
            nome = stringResource(id = R.string.title_mountain),
            icone = painterResource(id = R.drawable.mountains)
        )

        val snow = Categoria(
            id = 2,
            nome = stringResource(id = R.string.title_snow),
            icone = painterResource(id = R.drawable.snow)
        )

        val beach = Categoria(
            id = 3,
            nome = stringResource(id = R.string.title_beach),
            icone = painterResource(id = R.drawable.beach)
        )

        return listOf(mountain, snow, beach)

    }

}