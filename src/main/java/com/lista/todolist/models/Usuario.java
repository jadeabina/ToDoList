package com.lista.todolist.models;

import jakarta.persistence.*;

import java.sql.Time;



@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NOME")
    private String nome;
    @Column (name = "HORARIO_DIPONIVEL")
    private Time disponibilidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Time disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
