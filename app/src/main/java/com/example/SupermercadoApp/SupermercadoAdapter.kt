import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView

class SupermercadoAdapter(val supermercados: List<Supermercado>) : RecyclerView.Adapter<SupermercadoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_supermercado, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nome.text = supermercados[position].nome
    }

    override fun getItemCount(): Int = supermercados.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView = view.findViewById(R.id.nome)
    }
}
