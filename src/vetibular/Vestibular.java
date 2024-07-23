package vetibular;
import candidato.Candidato;

public class Vestibular {
    Candidato candidato;

    public boolean vestibular(double nota) {
        if(candidato.getNota() < 6){
             System.out.println("Você foi reprovado, mais sorte na próxima!");
             return true;
        }else {
            System.out.println("Você foi aprovado, parabéns!");
            return false;
        }
    };


}
