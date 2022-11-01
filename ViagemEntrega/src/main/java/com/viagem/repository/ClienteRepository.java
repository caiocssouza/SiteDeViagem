package com.viagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viagem.model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
