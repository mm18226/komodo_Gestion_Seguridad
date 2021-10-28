package komodo_gestion_seguridad
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes

class Departamento {

    //Datos generales
    String id
    String nombre
  
    //Datos que son clases
    static hasMany = [municipios:Municipio]
        
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
