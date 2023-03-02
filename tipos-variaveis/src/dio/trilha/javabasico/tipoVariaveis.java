package dio.trilha.javabasico;

public class tipoVariaveis {
    public static void main(String[] args) {
        // Tipos Primitivos
        byte idade = 25;
        byte temperatura = -10;
        short distancia = 500;
        short populacao = 1000;
        int quantidade = 10;
        int preco = 2000;
        long populacaoLong = 123456789L;
        long distanciaLong = 987654321L;
        float precoFloat = 4.99f;
        float altura = 1.75f;
        double precoDouble = 2.99;
        double peso = 70.5;
        char letra = 'A';
        char simbolo = '$';
        boolean aprovado = true;
        boolean ativo = false;

        // Tipos de Referência
        String nome = "João";
        String endereco = "Rua das Flores, 123";
        int[] numeros = { 1, 2, 3 };
        String[] nomes = { "João", "Maria", "Pedro" };
        Pessoa pessoa = new Pessoa("João", 25);
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
