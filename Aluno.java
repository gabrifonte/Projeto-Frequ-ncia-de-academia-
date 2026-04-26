/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frquenciaacademia;

/**
 *
 * @author gabrielfontenele
 */
public class Aluno {
  private String nome;
  private double mensalidadeBase;
  private int frequenciasemanal;
  public Aluno(){
      
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public void setMensalidadeBase(double mensalidadeBase) {
        this.mensalidadeBase = mensalidadeBase;
    }

    public int getFrequenciasemanal() {
        return frequenciasemanal;
    }
   public void baterCatraca(){
       this.frequenciasemanal = this.frequenciasemanal + 1;
   }
   public double calcularMensalidade(){
       if (this.frequenciasemanal >= 5)
           return getMensalidadeBase()*0.90;
     
    else  {
            
            return getMensalidadeBase(); 
}
   }         

    void setPersonalTrainer(String sérgio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
