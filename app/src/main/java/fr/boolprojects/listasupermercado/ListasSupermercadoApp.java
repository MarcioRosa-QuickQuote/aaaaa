package fr.boolprojects.listasupermercado;
import androidx.appcompat.app.AppCompatActivity;
public class ListasSupermercadoApp extends AppCompatActivity {
	private List listaSupermercado;
	private ListDecorator decorador;
	public ListasSupermercadoApp() {
		listaSupermercado = new ArrayList<>();
		decorador = new ListDecorator();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}