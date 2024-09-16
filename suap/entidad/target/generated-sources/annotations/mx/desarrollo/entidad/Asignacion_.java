package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.entidad.Unidadaprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T15:10:42")
@StaticMetamodel(Asignacion.class)
public class Asignacion_ { 

    public static volatile SingularAttribute<Asignacion, Unidadaprendizaje> idUnidadAprendizaje;
    public static volatile SingularAttribute<Asignacion, Profesor> idProfesor;
    public static volatile SingularAttribute<Asignacion, Integer> idAsignacion;

}