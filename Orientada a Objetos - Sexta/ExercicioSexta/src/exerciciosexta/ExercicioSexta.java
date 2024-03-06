package exerciciosexta;

public class ExercicioSexta {
    public static void main(String[] args) {
        Eletrodomestico e = new Eletrodomestico();
        e.nome = "Geladeira";
        e.peso = 5;
        e.preco = 1200;
        
        System.out.println("Eletrodoméstico "+ e.nome +" no valor de R$"+ e.preco +" com peso de "+ e.peso +"kg");
    
        Carro c = new Carro();
        c.modelo = "Urus";
        c.marca = "Lamborghini";
        c.portas = 2;
        c.aroroda = 23;
        
        System.out.println("Carro "+ c.modelo +" da Marca "+ c.marca +" com "+ c.portas +"x Portas com a Roda no aro "+ c.aroroda +"");
    
        Dialogo d = new Dialogo();
        d.id = 1;
        d.usuario = "Vanderley";
        d.mensagem = "Olá Mundo Java!";
        
        System.out.println("["+ d.id +" | "+ d.usuario +"] Mensagem: "+ d.mensagem +"");
        
    }
}
