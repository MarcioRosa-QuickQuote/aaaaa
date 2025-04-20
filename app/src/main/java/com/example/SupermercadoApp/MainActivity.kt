import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()) {
	private lateinit var supermercadoLista: ListView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// Cria lista de supermercado
		supermercadoLista = findViewById(R.id.supermercadoLista)
	}
}
