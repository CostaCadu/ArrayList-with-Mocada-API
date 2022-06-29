package com.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.model.Produto

class AdapterProduto(private val context:Context, private val produtos: MutableList<Produto>):
    RecyclerView.Adapter<ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hadware_item,parent,false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

}
//inner = interno, como é uma class dentro de outra, usa inner
class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
    val nome = itemView.findViewById<TextView>(R.id.nomeProduto)
    val descricao = itemView.findViewById<TextView>(R.id.descricaoProduto)
    val preco = itemView.findViewById<TextView>(R.id.precoProduto)
}