package komodo_gestion_seguridad
<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DepartamentoController {

    DepartamentoService departamentoService
    
    //para especifico municipio
    static scaffold = Departamento


    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond departamentoService.list(params), model:[departamentoCount: departamentoService.count()]
    }

    def show(Long id) {
        respond departamentoService.get(id)
    }

//mostrar especifico
def dynamicDropdown = {
  }

  def findMunicipioForDepartamento = {
    def departamento = Departamento.get(params.departamento.id)
    render(template: 'municipioSelection', model:  [municipio: departamento.municipio])
  }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'departamento.label', default: 'Departamento'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
