package komodo_gestion_seguridad

class Empleado {
 //Datos generales del empleado
    String nombres
    String apellidos
    String genero 
    String estadoCivil
    Date fechaNacimiento
    double salario
    String dui
    String iss
    String nup    
 //Datos del empleado que son otras clases        
    Departamento departamento 
    Municipio municipio
    String direccion
    PuestoTrabajo puesto
    AreaTrabajo area  

    
    static constraints = {
        nombres blank:false,matches:"[a-zA-Z-' ']+"
        apellidos blank:false,matches:"[a-zA-Z-' ']+"
        genero blank:false,matches:"[a-zA-Z-' ']+"
        estadoCivil blank:false,matches:"[a-zA-Z-' ']+"
        fechaNacimiento blank:false 
        departamento  blank:false
        municipio  blank:false 
        direccion blank:false
        dui blank:false,matches:"[0-9]{9}"
        iss blank:false,matches:"[0-9]{9}"
        nup blank:false,matches:"[0-9]{13}"
        area  blank:false
        puesto  blank:false
        salario blank:false
        
    }
    static mapping={
        table 'empleado'
        version false
    }
}
