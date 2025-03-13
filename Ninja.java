package Desafio1;

public class Ninja {
    private String nome;
    private int idade;
    private Missao missao;

    public Ninja(String nome, int idade, Missao missao) {
        this.nome = nome;
        this.idade = idade;
        setMissao(missao); // Usa o setter para validar a missão
    }

    public Ninja() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        if (this.idade < 15 && missao != null && (missao.getDificuldade() == 'B' || missao.getDificuldade() == 'A' || missao.getDificuldade() == 'S')) {
            System.out.println("O ninja " + nome + " é muito jovem para essa missão!");
            this.missao = null;
        } else {
            this.missao = missao;
        }
    }

    @Override
    public String toString() {
        return "Ninja: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Missão: " + (missao != null ? missao : "Nenhuma missão atribuída");
    }
}
