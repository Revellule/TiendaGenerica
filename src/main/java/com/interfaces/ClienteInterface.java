package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Cliente;

@Repository
public interface ClienteInterface extends CrudRepository<Cliente, Long>{
    Cliente findFirstByCedulaCliente (Long cedula);

}
