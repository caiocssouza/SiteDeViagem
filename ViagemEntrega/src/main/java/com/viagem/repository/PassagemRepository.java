package com.viagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viagem.model.Passagem;

public interface PassagemRepository extends JpaRepository <Passagem, Long> {

}
