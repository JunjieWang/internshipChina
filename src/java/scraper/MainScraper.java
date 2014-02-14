/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scraper;

import internshipchina.Intern;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tazheng
 */
public class MainScraper {
    List<Intern> internList;
    
    public MainScraper() {
        internList = new ArrayList<Intern>();
    }
    
    public List<Intern> getInternList() {
        //some code to fetch intern information from websites
        return internList;
    }
}
