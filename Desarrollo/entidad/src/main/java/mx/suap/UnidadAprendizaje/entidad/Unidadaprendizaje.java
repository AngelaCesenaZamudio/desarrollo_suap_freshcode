/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.suap.UnidadAprendizaje.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author C.Basicas
 */
@Entity
@Table(name = "unidadaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadaprendizaje.findAll", query = "SELECT u FROM Unidadaprendizaje u")
    , @NamedQuery(name = "Unidadaprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM Unidadaprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "Unidadaprendizaje.findByNombreUnidadAprendizaje", query = "SELECT u FROM Unidadaprendizaje u WHERE u.nombreUnidadAprendizaje = :nombreUnidadAprendizaje")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasClase", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasTaller", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasLaboratorio", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class Unidadaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidadAprendizaje")
    private Integer idUnidadAprendizaje;
    @Column(name = "nombreUnidadAprendizaje")
    private String nombreUnidadAprendizaje;
    @Column(name = "horasClase")
    private Integer horasClase;
    @Column(name = "horasTaller")
    private Integer horasTaller;
    @Column(name = "horasLaboratorio")
    private Integer horasLaboratorio;

    public Unidadaprendizaje() {
    }

    public Unidadaprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombreUnidadAprendizaje() {
        return nombreUnidadAprendizaje;
    }

    public void setNombreUnidadAprendizaje(String nombreUnidadAprendizaje) {
        this.nombreUnidadAprendizaje = nombreUnidadAprendizaje;
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        this.horasClase = horasClase;
    }

    public Integer getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(Integer horasTaller) {
        this.horasTaller = horasTaller;
    }

    public Integer getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(Integer horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadaprendizaje)) {
            return false;
        }
        Unidadaprendizaje other = (Unidadaprendizaje) object;
        if ((this.idUnidadAprendizaje == null && other.idUnidadAprendizaje != null) || (this.idUnidadAprendizaje != null && !this.idUnidadAprendizaje.equals(other.idUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.suap.UnidadAprendizaje.entidad.Unidadaprendizaje[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
    
}
