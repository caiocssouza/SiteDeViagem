package com.site.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.model.Compra;


@Repository
public interface CompraRepositorio extends JpaRepository<Compra, Long> {

}
