package PooBasico;

public class Anotacoes {
    /*
    Getters e Setters

    private significa: ninguém de fora dessa classe consegue acessar diretamente

    *Getter*

    public String getNome() {
    return nome;
    }

    public → qualquer classe pode chamar esse método
    String → ele devolve um texto
    getNome → convenção: sempre começa com get + nome do atributo
    return nome → devolve o valor que está guardado no atributo

    String n = p1.getNome(); // n = "Ana"
    -----------------------------------

    *Setter*

    public void setNome(String nome) {
    this.nome = nome;
    }

    void → não devolve nada, só executa
    setNome → convenção: sempre começa com set + nome do atributo
    String nome → recebe o novo valor como parâmetro
    this.nome = nome → aqui está o ponto mais confuso
    ----------------------------------------------------

    O que é this.nome = nome?

    O problema é que o parâmetro e o atributo têm o mesmo nome.
    O Java precisa saber qual é qual:

    private String nome; // atributo da classe

    public void setNome(String nome) { // "nome" aqui é o parâmetro
    this.nome = nome;
    //  ↑            ↑
    // atributo    parâmetro recebido
}
    this significa "este objeto" — é uma forma de dizer
    "o nome que pertence a mim, o objeto".

    Então a linha diz:
    "pegue o valor que veio no parâmetro e guarde no meu atributo."

    Por que não deixar tudo public e acabar?
        Porque com setter você pode colocar regras:
    public void setIdade(int idade) {
    if (idade < 0) {
        System.out.println("Idade inválida!");
        return;
    }
    this.idade = idade;
}
    Se o atributo fosse public, qualquer um poderia fazer
    p1.idade = -999 e ninguém barraria. O setter é o porteiro do atributo.
     */
}
