package komodo_gestion_seguridad
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes

class Municipio {

    //Datos generales
    String id
    String nombre
    
    //Datos que son clases
        
    static constraints = {
        nombre blank:false
    }
    static mapping={
        table 'municipio'
        id column:'codigo', type:'text'
        version false
    }
    String toString(){
        "${nombre}"
    }
}
