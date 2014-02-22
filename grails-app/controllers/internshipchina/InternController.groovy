package internshipchina

import dao.InternDAO
import scraper.HTMLParser

class InternController {

    def index() { 
        
//        println interns.size()
//        InternDAO intern = new InternDAO();
//        def internlist = intern.getInternList();

        def interns = Intern.list()
        for (i in interns) {
            String str = i.description
            String[] lines = str.split("\\n");
//            println lines.length
            List<String> lineArr = new ArrayList<String>();
            for (int j = 0; j < lines.length; j++) {
                lineArr.add(lines[j]);
//                println lines[j]
            }
            i.desclines = lineArr
        }
        return [internlist : interns]
    }
}
