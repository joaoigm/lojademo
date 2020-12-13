package com.joaoigm.lojademo.domain

data class Produto(
    private var id: Long?,
    private var nome: String,
    private var preco: Double
) {
    constructor() {}
}
