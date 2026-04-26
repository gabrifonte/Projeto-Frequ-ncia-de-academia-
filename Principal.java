/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frquenciaacademia;

/**
 *
 * @author gabrielfontenele
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Aluno av = new AlunoVip();
        AlunoEstudante ae = new AlunoEstudante();
        
        a.setNome("Carlos");
        a.setMensalidadeBase(100.0);
        a.baterCatraca();
        a.baterCatraca();
        a.baterCatraca();
        a.baterCatraca();
        a.baterCatraca();
        
        av.setNome("Mariana");
        av.setMensalidadeBase(150.0);
        av.setPersonalTrainer("Sérgio");
        av.baterCatraca();
        
        ae.setNome("Lucas");
        ae.setMensalidadeBase(100.0);
        ae.setNomeFaculdade("Fatec");
        
        Aluno[] ListadeAlunos = {a, av,ae};
        System.out.println("Mensalidade da Academia");
        
        for (Aluno all : ListadeAlunos){
            System.out.println("Nome:"+ all.getNome());
            System.out.println("Vezes que treinou:"+ all.getFrequenciasemanal());
            System.out.println("Valor a Pagar:"+ all.calcularMensalidade());
            
        }
    }
    
}
