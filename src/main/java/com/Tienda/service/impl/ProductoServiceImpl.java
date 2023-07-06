package com.Tienda.service.impl;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;
    
    
    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> lista = productoDao.findAll();
        
        if(activos){
            //Para remover las categorias donde activo = false;
            lista.removeIf(x -> !x.isActivo());
        }
        
        return lista;
    }
    
    
}
