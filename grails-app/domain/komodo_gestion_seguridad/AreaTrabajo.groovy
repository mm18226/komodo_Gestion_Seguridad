package komodo_gestion_seguridad

class AreaTrabajo {

    String nombre
    
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
