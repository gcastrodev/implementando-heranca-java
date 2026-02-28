public class Animal {
    protected String nome;
    protected int idade;
    protected int nPatas;
    protected String raca;
    
    public Animal(String nome, int idade, String raca, int nPatas) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.nPatas = nPatas;
    }

    public static void main(String[] args) {
        //CRIANDO UM OBJETO DA CLASSE GATO
        Animal gato = new Gato("Meia noite", 10, "siamês", 4);
        //CRIANDO UM OBJETO DA CLASSE CACHORRO
        Animal cachorro = new Cachorro("Rex", 5, "labrador", 4);



        //EXIBINDO AS INFORMAÇÕES DO GATO
        System.out.println("Informações do gato:");
        gato.exibirInformacoes();
        gato.emitirSom();

        //EXIBINDO AS INFORMAÇÕES DO CACHORRO
        System.out.println("\nInformações do cachorro:");
        cachorro.exibirInformacoes();
        cachorro.emitirSom();
    }

    public void emitirSom() {
        System.out.println("O animal emite o seguinte som.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Raça: " + raca); 
        System.out.println("Número de patas: " + nPatas);
    }
}

class Gato extends Animal {
    public Gato(String nome, int idade, String raca, int nPatas) {
        super(nome, idade, raca, nPatas);
    }

    @Override
    public void emitirSom() {
        System.out.println("miau!"); 
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String raca, int nPatas) {
        super(nome, idade, raca, nPatas);
    }

    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }
}
