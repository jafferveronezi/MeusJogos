package br.com.veronezitecnologia.meusjogos

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.veronezitecnologia.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.meu_jogo_item.view.*

/*
* Com o ViewHolder iremos relacionar o layout criado e adicionar os valores a ele
*/

class  JogoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    fun  bindView(jogo: Jogo,
                  listerner: (Jogo) -> Unit) = with(itemView) {
        tvNome.text = jogo.titulo
        tvAnoLancamento.text = jogo.anoLancamento.toString()
        tvDescricao.text = jogo.descricao
        ivJogo.setImageDrawable(ContextCompat.getDrawable(context, jogo.resourceId))

        setOnClickListener { listerner(jogo)  }
    }
}


