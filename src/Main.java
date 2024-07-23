import candidato.Candidato;
import vetibular.Vestibular;


public class Main {
    public static void main(String[] args) {
        Candidato candidato = new Candidato("Fábio",5.7);
        Vestibular vestibular = new Vestibular();

        vestibular.vestibular(candidato.getNota());

    }
}