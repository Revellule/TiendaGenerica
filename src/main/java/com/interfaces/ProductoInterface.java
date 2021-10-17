package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Producto;

@Repository
public interface ProductoInterface extends CrudRepository<Producto, Long>{
    Producto findFirstByCodigoProducto (Long codigo);

}
