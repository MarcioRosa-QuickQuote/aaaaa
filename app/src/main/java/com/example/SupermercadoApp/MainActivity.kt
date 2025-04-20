import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    val lista = ListView(this)
    val itens = AppConfig().items
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens.map { it.nome })
        lista.adapter = adapter
    }
}