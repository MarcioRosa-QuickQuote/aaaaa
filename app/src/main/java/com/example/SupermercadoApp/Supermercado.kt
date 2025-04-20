data class Supermercado(val id: Int, val nome: String, val produtos: List<Produto>)

case class Produto(val id: Int, val nome: String)

class SupermercadoDAO {
    fun listaSupermercados(): List<Supermercado>
}
