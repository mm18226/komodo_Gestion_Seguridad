package komodo_gestion_seguridad

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class MunicipioController {

    MunicipioService municipioService


    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond municipioService.list(params), model:[municipioCount: municipioService.count()]
    }

    def show(Long id) {
        respond municipioService.get(id)
    }


    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'municipio.label', default: 'Municipio'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
