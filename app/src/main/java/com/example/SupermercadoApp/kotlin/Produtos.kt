package com.example.SupermercadoApp

class Produto(var nome: String, var preco: Double)

class SupermercadoApp {
    private val produtos = mutableListOf<Produto>()

    fun addProduto(nome: String, preco: Double) {
        produtos.add(Produto(nome, preco))
    }

    fun getProdutos(): List<Produto> {
        return produtos
    }
}