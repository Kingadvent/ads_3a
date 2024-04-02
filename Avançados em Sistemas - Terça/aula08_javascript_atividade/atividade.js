class Pessoa {
    constructor(pNome,pEndereco){
        if(pNome.length < 2){console.log("ERROR RAZAO SOCIAL INVALIDA");}
        if(pEndereco.length < 2){console.log("ERROR RAZAO SOCIAL INVALIDA");}
        this.nome = pNome;
        this.endereco = pEndereco;
    }

    getNome(){return this.nome;}
    setNome(pNome){this.nome = pNome;}
    getEndereco(){return this.endereco;}
    setEndereco(pEndereco){this.endereco = pEndereco;}

    Imprimir(){
        return "-- Electronic --\n\n Pessoa: "+ this.nome +"\n Endereco: "+ this.endereco +""
    }

    Pessoa(pNome, pEndereco){
        this.nome = pNome;
        this.endereco = pEndereco;
    }
}

class Juridica extends Pessoa {
    constructor(pNome,pEndereco,pCNPJ,pRazaoSocial){
        super(pNome,pEndereco);
        this.cnpj = pCNPJ;
        this.razaoSocial = pRazaoSocial;
    }

    getCNPJ(){return this.cnpj;}
    setCNPJ(pCNPJ){this.cnpj = pCNPJ;}
    getRazaoSocial(){return this.razaoSocial;}
    setRazaoSocial(pRazaoSocial){this.razaoSocial = pRazaoSocial;}

    Imprimir(){
        return super.Imprimir() +"\n CNPJ: "+ this.cnpj +"\n Razao Social: "+ this.razaoSocial +"\n"
    }
}

class Fisica extends Pessoa {
    constructor(pNome,pEndereco,pCpf,pDtNascimento){
        if(pCpf.length < 11){console.log("ERROR CPF INVALIDO");}
        if(pDtNascimento.length < 10){console.log("ERROR DATA INVALIDO EXEMPLO 01/01/2022");}
        super(pNome,pEndereco);
        this.cpf = pCpf;
        this.dtNascimento = pDtNascimento;
    }

    getCpf(){return this.cpf;}
    setCpf(pCpf){this.cpf = pCpf;}
    getDtNascimento(){return this.dtNascimento;}
    setDtNascimento(pDtNascimento){this.dtNascimento = pDtNascimento;}

    Imprimir(){
        return super.Imprimir() +"\n CPF: "+ this.cpf +"\n Data de Nascimento: "+ this.dtNascimento +"\n"
    }
}

var juridica = new Juridica("Vanderley","08140290","35848215816","Loja JR");
console.log(juridica.Imprimir());

var fisica = new Fisica("Vanderley","08140290","35848215816","19/12/2001");
console.log(fisica.Imprimir());