/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import internshipchina.Intern;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tazheng
 */
public class InternDAO {
    List<Intern> internList;
    
    public InternDAO() {
        internList = new ArrayList<Intern>();
    }
    
    public List<Intern> getInternList() {
        //some code to fetch intern information from websites
        Intern i1 = new Intern();
        i1.setTitle("Intern 1");
        i1.setDescription("this is i1");
        Intern i2 = new Intern();
        i2.setTitle("Intern 2");
        i2.setDescription("this is i2");
        internList.add(i1);
        internList.add(i2);
        return internList;
    }
}
