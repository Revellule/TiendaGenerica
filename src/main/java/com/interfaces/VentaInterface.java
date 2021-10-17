package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modelo.Venta;

@Repository
public interface VentaInterface extends CrudRepository<Venta, Long>{
    Venta findFirstByCodigoVenta (Long codigo);

}
