package entities;

public class Alunos{

  private String nome;
  private double priNota;
  private double segNota;

  public Alunos(String nome, double priNota, double segNota){
    this.nome = nome;
    this.priNota = priNota;
    this.segNota = segNota;
  }
    
  public String getNome() {
  	return nome;
  }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public double getPriNota() {
  	return priNota;
  }
  public void setPriNota(double priNota) {
  	this.priNota = priNota;
  }
  public double getSegNota() {
  	return segNota;
  }
  public void setSegNota(double segNota) {
  	this.segNota = segNota;
  }
  
  


  

  

  
}