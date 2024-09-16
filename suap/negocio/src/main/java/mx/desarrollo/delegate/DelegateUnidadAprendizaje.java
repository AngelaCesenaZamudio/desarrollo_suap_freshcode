/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import mx.desarrollo.entidad.Unidadaprendizaje;
import mx.desarrollo.integracion.ServiceFacadeLocator;
import mx.desarrollo.integracion.ServiceLocator;

/**
 *
 * @author C.Basicas
 */
public class DelegateUnidadAprendizaje {
    
    public void saveUnidadAprendizaje(Unidadaprendizaje unidadA){
        ServiceLocator.getInstanceUnidadAprendizajeDAO().save(unidadA);
    }
}
