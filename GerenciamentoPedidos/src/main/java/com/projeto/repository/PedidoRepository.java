package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}