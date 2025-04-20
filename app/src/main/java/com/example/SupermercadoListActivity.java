package com.example;
public class SupermercadoListActivity extends AppCompatActivity {

private ArrayList<Produto> produtos;
private RecyclerView listaProdutos;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_supermercado_list);

    produtos = new ArrayList<>();