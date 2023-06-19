
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    public List<Categoria> getCategirias(boolean activos);

    public List<Categoria> getCategorias(boolean b);
    
}
