package br.com.veronezitecnologia.meusjogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import br.com.veronezitecnologia.meusjogos.adapter.JogoAdapter
import br.com.veronezitecnologia.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista_jogos)

        rvMeusJogos.adapter = JogoAdapter(jogos(), this, {
            Log.i("TAG", "MEU ITEM")
        })
//Grid
//val layoutManager = GridLayoutManager(this, 2)

//Grade escalonável
/*val layoutManager = StaggeredGridLayoutManager(
2, StaggeredGridLayoutManager.VERTICAL)*/

//Lista na horizontal
//val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

//Lista na vertical
        val layoutManager = LinearLayoutManager(this)
        rvMeusJogos.layoutManager = layoutManager
    }

    private fun jogos(): List<Jogo> {
        return listOf(Jogo(R.drawable.spiderman,
                "SpiderMan",
                2018,
                "Após oito anos usando a máscara, Peter Parker agora é um mestre na luta " +
                        "contra o crime. Sinta todo o poder de um Homem-Aranha mais experiente com uma " +
                        "mecânica de combate improvisada, habilidades acrobáticas dinâmicas, " +
                        "movimentos urbanos brandos e interações com o ambiente. " +
                        "Não sendo mais um principiante, esse é o Homem-Aranha mais habilidoso que" +
                        " você já jogou."))
    }

}
