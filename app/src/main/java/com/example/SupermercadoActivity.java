package com.example;
public class SupermercadoActivity extends AppCompatActivity {
    private ListView listaProduutos;
    private List<Produto> produtos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermercado);
        listaProduutos = (ListView) findViewById(R.id.lista_produutos);
        produtos = new ArrayList<>();