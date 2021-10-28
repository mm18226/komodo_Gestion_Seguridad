package komodo_gestion_seguridad


class Municipio {

    //Datos generales
    String id
    String nombre
    
    //Datos que son clases
    static belongsTo =[departamento:Departamento]
        
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
