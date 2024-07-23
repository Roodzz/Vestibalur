package candidato;

public class Candidato {
    private String nome;
    private double nota;

    public Candidato(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public double getNota(){
        return nota;
    }
    public void setNota(){
        this.nota = nota;
    }


}