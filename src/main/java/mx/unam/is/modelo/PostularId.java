package mx.unam.is.modelo;
// Generated 20/02/2018 02:50:15 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * PostularId generated by hbm2java
 */
public class PostularId  implements java.io.Serializable {


     private Serializable nombre;
     private Serializable puesto;

    public PostularId() {
    }

    public PostularId(Serializable nombre, Serializable puesto) {
       this.nombre = nombre;
       this.puesto = puesto;
    }
   
    public Serializable getNombre() {
        return this.nombre;
    }
    
    public void setNombre(Serializable nombre) {
        this.nombre = nombre;
    }
    public Serializable getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Serializable puesto) {
        this.puesto = puesto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PostularId) ) return false;
		 PostularId castOther = ( PostularId ) other; 
         
		 return ( (this.getNombre()==castOther.getNombre()) || ( this.getNombre()!=null && castOther.getNombre()!=null && this.getNombre().equals(castOther.getNombre()) ) )
 && ( (this.getPuesto()==castOther.getPuesto()) || ( this.getPuesto()!=null && castOther.getPuesto()!=null && this.getPuesto().equals(castOther.getPuesto()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNombre() == null ? 0 : this.getNombre().hashCode() );
         result = 37 * result + ( getPuesto() == null ? 0 : this.getPuesto().hashCode() );
         return result;
   }   


}


