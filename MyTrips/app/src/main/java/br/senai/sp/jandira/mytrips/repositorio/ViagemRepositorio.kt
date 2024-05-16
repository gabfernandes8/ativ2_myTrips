package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List <Viagem> {

        val londres = Viagem(
            id = 1,
            destino = stringResource(id = R.string.name_london),
            descricao = stringResource(id = R.string.description_london),
            dataChegada = LocalDate.of(2019, 12, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.london)
        )

        val porto = Viagem(
            id = 2,
            destino = stringResource(id = R.string.name_porto),
            descricao = stringResource(id = R.string.description_porto),
            dataChegada = LocalDate.of(2019, 12, 27),
            dataPartida = LocalDate.of(2020, 1, 15),
        )

        return listOf(londres, porto)

    }

}