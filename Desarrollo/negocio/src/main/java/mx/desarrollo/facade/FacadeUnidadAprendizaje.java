/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateUnidadAprendizaje;
import mx.suap.UnidadAprendizaje.entidad.Unidadaprendizaje;

/**
 *
 * @author C.Basicas
 */
public class FacadeUnidadAprendizaje {
    private final DelegateUnidadAprendizaje delegateUnidad;

    public FacadeUnidadAprendizaje() {
        this.delegateUnidad = new DelegateUnidadAprendizaje();
    }
    
    public void guardarAlumno(Unidadaprendizaje unidadA){
        delegateUnidad.guardarUnidadAprendizaje(unidadA);
    }
}
