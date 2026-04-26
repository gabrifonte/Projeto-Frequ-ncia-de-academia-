/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frquenciaacademia;

/**
 *
 * @author gabrielfontenele
 */
public class AlunoEstudante extends Aluno {
  private String nomeFaculdade;
  
  public AlunoEstudante(){
      
  }

    public String getNomeFaculdade() {
        return nomeFaculdade;
    }

    public void setNomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }
  public double calcularMensalidade(){
      return getMensalidadeBase() * 0.70;
  }
   
}
