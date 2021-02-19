public class Animal {
    String nome = "";

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Cao extends Animal {
    public Cao(String nome) {
        super(nome);
        System.out.println("O cão " + this.nome + " ladra");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super();
        System.out.println("O gato " + this.nome + " mia");
    }
}