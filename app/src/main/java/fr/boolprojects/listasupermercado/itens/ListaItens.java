package fr.boolprojects.listasupermercado.itens;
import java.util.ArrayList;
import java.util.List;
public class ListaItens {
	public static List<Item> getItens() {
		List<Item> lista = new ArrayList<>();
		lista.add(new Item("Leite", 2.50));
		lista.add(new Item("Pão", 1.20));
		lista.add(new Item("Carne", 10.00));
		return lista;
	}
}