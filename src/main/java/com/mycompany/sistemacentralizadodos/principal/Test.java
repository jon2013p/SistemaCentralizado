
package com.mycompany.sistemacentralizadodos.principal;

import com.mycompany.sistemacentralizadodos.controladores.ProductoJpaController;
import com.mycompany.sistemacentralizadodos.entidades.Producto;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {


    public static void main(String[] args) {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
       
        ProductoJpaController pjc = new ProductoJpaController(emf);
        
        Producto p = new Producto();
        
        p.setNombre("CAFE INSTANTANEO");
        
        Double d1 = 18.10;
        
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        
        p.setPrecio(bd1);
        
        pjc.create(p);
        
        
    }
    
}
