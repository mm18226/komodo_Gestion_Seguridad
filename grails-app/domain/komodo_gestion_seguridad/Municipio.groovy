package komodo_gestion_seguridad
package dropdown

class Municipio {

    //Datos generales
    String id
    String nombre
    
    //Datos que son clases
    static belongTo = Departamento
    
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
