package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Proveedor;

@Repository
public interface ProveedorInterface extends CrudRepository<Proveedor, Long>{
    Proveedor findFirstByNitProveedor (Long nit);

}
