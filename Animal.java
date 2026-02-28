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

public class gato extends Animal {
    public gato(String nome, int idade, String raca, int nPatas) {
        super(nome, idade, raca, nPatas);
    }

    @Override
    public void emitirSom() {
        System.out.println("miau!");
    }

public class cachorro extends Animal {
    public cachorro(String nome, int idade, String raca, int nPatas) {
        super(nome, idade, raca, nPatas);
    }

    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }
}

}
 