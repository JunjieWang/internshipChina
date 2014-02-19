class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"intern", action:"index")
        "/aboutus"(controller:"aboutUs", action:"index")
        "500"(view:'/error')
        "404"(view:'/error')
	}
}
