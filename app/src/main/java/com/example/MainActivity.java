package com.example;
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        listaProdutos = new ArrayList<>();
        listaProdutos.add("Arroz");
        listaProdutos.add("Feijão");
        listaProdutos.add("Ovos");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, listaProdutos);
        listView.setAdapter(adapter);
    }
}