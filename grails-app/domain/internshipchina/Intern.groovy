package internshipchina

class Intern {
    String title
    String date
    String source
    String location
    String description
    String category
    def desclines
    
    static constraints = {
        desclines nullable:true
    }
    
    static mapping = {
        sort date:"desc"
        
    }
}
