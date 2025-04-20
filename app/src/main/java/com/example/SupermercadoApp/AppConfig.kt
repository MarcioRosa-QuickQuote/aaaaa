class AppConfig { val items = mutableListOf<Item>() }

interface Item {
    val nome: String
    val preco: Double
}