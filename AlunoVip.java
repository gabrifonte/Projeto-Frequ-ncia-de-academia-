/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frquenciaacademia;

/**
 *
 * @author gabrielfontenele
 */
public class AlunoVip extends Aluno {
    private String personalTrainer;
    public AlunoVip(){
        
    }

    public String getPersonalTrainer() {
        return personalTrainer;
    }

    public void setPersonalTrainer(String personalTrainer) {
        this.personalTrainer = personalTrainer;
    }
    @Override
    public double calcularMensalidade(){
      return getMensalidadeBase() + 150.00;
    }
}
