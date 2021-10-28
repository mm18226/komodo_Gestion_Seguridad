package komodo_gestion_seguridad


class Departamento {

    //Datos generales
    String id
    String nombre
  
    //Datos que son clases
    static hasMany = [municipio:Municipio]
        
    static constraints = {
        nombre  blank:false
        municipios blank:false
    }
    static mapping={
        table 'departamento'
        id column:'codigo', type:'text'
        version false
    }
    String toString(){
        "${nombre}"
    }
    
}
