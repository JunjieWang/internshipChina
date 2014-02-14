package internshipchina

import dao.InternDAO

class InternController {

    def index() { 
        InternDAO intern = new InternDAO();
        def internlist = intern.getInternList();
        return [internlist : internlist]
    }
}
