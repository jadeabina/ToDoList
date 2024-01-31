package com.lista.todolist.persistence;

import com.lista.todolist.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository <Tarefa,Integer> {
}
