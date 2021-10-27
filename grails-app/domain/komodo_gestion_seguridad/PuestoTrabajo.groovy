package komodo_gestion_seguridad

class PuestoTrabajo {
    //Datos generales 
    String nombre
    //Datos que son otra clase
    AreaTrabajo area
    
    static constraints = {
        nombre(nullable:false, blank:false)
    }
    static mapping={
        version false
    }
    String toString(){
        "${nombre}"
    }
}
