package komodo_gestion_seguridad

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
//Grails
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
