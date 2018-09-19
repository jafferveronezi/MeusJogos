package br.com.veronezitecnologia.meusjogos.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.veronezitecnologia.meusjogos.JogoViewHolder
import br.com.veronezitecnologia.meusjogos.R
import br.com.veronezitecnologia.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.meu_jogo_item.view.*

class JogoAdapter(private val jogos: List<Jogo>,
                  private val context: Context,
                  val listener: (Jogo) -> Unit) : Adapter<JogoViewHolder>() {

//Método que recebe o ViewHolder e a posição da lista.
//Aqui é recuperado o objeto da lista de Objetos pela posição e associado à ViewHolder.

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = jogos[position]
        holder?.let {
            it.bindView(jogo, listener)
        }
    }

    //Método que deverá retornar layout criado pelo ViewHolder já inflado em uma view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.meu_jogo_item, parent, false)
        return JogoViewHolder(view)
    }

    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return jogos.size
    }

    interface ClickListener {
        fun onClick(view: View, position: Int)
    }
/*
* Vale ressaltar que os métodos onCreateViewHolder e onBindViewHolder não são
chamados
        * para todos os itens inicialmente, eles são chamados apenas para os itens visíveis
para o usuário.
* Quando o usuário sobe e desce a lista, estes dois métodos são chamados novamente
associando a view
* reciclada ao conteúdo daquela posição que agora será visível.
* */
}
