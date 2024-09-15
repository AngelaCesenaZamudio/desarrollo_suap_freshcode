/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.facade.FacadeAlumno;
import mx.desarrollo.facade.FacadeUnidadAprendizaje;
import mx.desarrollo.facade.FacadeUsuario;

 
public class ServiceFacadeLocator {
    
    private static FacadeAlumno facadeAlumno;
    private static FacadeUsuario facadeUsuario;
    private static FacadeUnidadAprendizaje facadeunidad;
    
    public static FacadeAlumno getInstanceFacadeAlumno() {
        if (facadeAlumno == null) {
            facadeAlumno = new FacadeAlumno();
            return facadeAlumno;
        } else {
            return facadeAlumno;
        }
    }
    
    public static FacadeUsuario getInstanceFacadeUsuario() {
        if (facadeUsuario == null) {
            facadeUsuario = new FacadeUsuario();
            return facadeUsuario;
        } else {
            return facadeUsuario;
        }
    }
    
    public static FacadeUnidadAprendizaje getInstanceFacadeUnidadAprendizaje(){
        if(facadeunidad == null){
            facadeunidad = new FacadeUnidadAprendizaje();
            return facadeunidad;
        }else{
            return facadeunidad;
        }
    }
}
