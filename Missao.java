package Desafio1;

public class Missao {
    private String nome;
    private StatusDaMissao status;
    private char dificuldade;

    public Missao(String nome, StatusDaMissao status, char dificuldade) {
        this.nome = nome;
        this.status = status;
        this.dificuldade = dificuldade;
    }

    public Missao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusDaMissao getStatus() {
        return status;
    }

    public void setStatus(StatusDaMissao status) {
        this.status = status;
    }

    public char getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(char dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "Nome da Missão: " + nome + "\n" +
                "Status: " + status + "\n" +
                "Dificuldade: " + dificuldade;
    }




}
