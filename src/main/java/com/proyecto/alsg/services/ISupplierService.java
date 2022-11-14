package com.proyecto.alsg.services;


import com.proyecto.alsg.entitys.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);
}
