package internshipchina


import dao.InternDAO
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InternInfoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InternInfo.list(params), model:[internInfoInstanceCount: InternInfo.count()]
//        InternDAO intern = new InternDAO();
//        def internlist = intern.getInternList();
//        return [internlist : internlist]
    }

    def show(InternInfo internInfoInstance) {
        respond internInfoInstance
    }

    def create() {
        respond new InternInfo(params)
    }

    @Transactional
    def save(InternInfo internInfoInstance) {
        if (internInfoInstance == null) {
            notFound()
            return
        }

        if (internInfoInstance.hasErrors()) {
            respond internInfoInstance.errors, view:'create'
            return
        }

        internInfoInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'internInfoInstance.label', default: 'InternInfo'), internInfoInstance.id])
                redirect internInfoInstance
            }
            '*' { respond internInfoInstance, [status: CREATED] }
        }
    }

    def edit(InternInfo internInfoInstance) {
        respond internInfoInstance
    }

    @Transactional
    def update(InternInfo internInfoInstance) {
        if (internInfoInstance == null) {
            notFound()
            return
        }

        if (internInfoInstance.hasErrors()) {
            respond internInfoInstance.errors, view:'edit'
            return
        }

        internInfoInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InternInfo.label', default: 'InternInfo'), internInfoInstance.id])
                redirect internInfoInstance
            }
            '*'{ respond internInfoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InternInfo internInfoInstance) {

        if (internInfoInstance == null) {
            notFound()
            return
        }

        internInfoInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InternInfo.label', default: 'InternInfo'), internInfoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'internInfoInstance.label', default: 'InternInfo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
