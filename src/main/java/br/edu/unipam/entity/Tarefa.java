/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipam.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.ManyToOne;

/**
 *
 * @author felipelsouza
 */
@Entity
public class Tarefa extends AbstractEntity implements Serializable{
  @NotNull  
  @Size(min = 5, max = 100)
  @Column(name = "DescricaoTarefa")
  private String Descricao;
  @NotNull
  private LocalDate DataPrevista;
  private LocalDate DataTermino;
  
  @ManyToOne
  @NotNull
  private Usuario usuario;

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public String getDescricao() {
    return Descricao;
  }

  public void setDescricao(String Descricao) {
    this.Descricao = Descricao;
  }

  public LocalDate getDataPrevista() {
    return DataPrevista;
  }

  public void setDataPrevista(LocalDate DataPrevista) {
    this.DataPrevista = DataPrevista;
  }

  public LocalDate getDataTermino() {
    return DataTermino;
  }

  public void setDataTermino(LocalDate DataTermino) {
    this.DataTermino = DataTermino;
  }
}