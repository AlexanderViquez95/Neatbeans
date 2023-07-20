
package com.Tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name="rol")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id_rol")
    private Long idRol;
    
    @NotEmpty
     private String nombre;
    
    @Column (name= "id_usuario")
     private Long idUsuario;
    
}
