/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateUnidadAprendizaje;
import mx.desarrollo.entidad.Unidadaprendizaje;

/**
 *
 * @author C.Basicas
 */
public class FacadeUnidadAprendizaje {
    private final DelegateUnidadAprendizaje delegateUnidadA;
    
    public FacadeUnidadAprendizaje(){
        this.delegateUnidadA = new DelegateUnidadAprendizaje();
    }
    
    public void guardarUnidadAprendizaje(Unidadaprendizaje unidadA){
        delegateUnidadA.saveUnidadAprendizaje(unidadA);
    }
}
