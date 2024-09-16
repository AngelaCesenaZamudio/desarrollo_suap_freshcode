package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Asignacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T15:10:42")
@StaticMetamodel(Unidadaprendizaje.class)
public class Unidadaprendizaje_ { 

    public static volatile SingularAttribute<Unidadaprendizaje, String> nombreUnidadAprendizaje;
    public static volatile SingularAttribute<Unidadaprendizaje, Integer> idUnidadAprendizaje;
    public static volatile SingularAttribute<Unidadaprendizaje, Integer> horasLaboratorio;
    public static volatile ListAttribute<Unidadaprendizaje, Asignacion> asignacionList;
    public static volatile SingularAttribute<Unidadaprendizaje, Integer> horasClase;
    public static volatile SingularAttribute<Unidadaprendizaje, Integer> horasTaller;

}