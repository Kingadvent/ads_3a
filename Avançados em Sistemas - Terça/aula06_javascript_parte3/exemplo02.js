class Livro {
    constructor(pNome, pPreco){
        this.Nome = pNome;
        this.Preco = pPreco;
    }

    get Nome(){ return this.nome; }
    set Nome(pNome){ this.nome = pNome; }

    get Preco(){ return this.Preco; }
    set Preco(pPreco){ this.preco = pPreco; }
}

var obj_livro1 = new Livro("Use a cabeça Java", 39.99);
console.log("\nNome do Livro: " + obj_livro1.nome + " custa "+ obj_livro1.preco + " reais");