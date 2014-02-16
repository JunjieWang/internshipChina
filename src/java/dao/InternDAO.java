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
        i1.setTitle("西门子财务部银行组急招实习生一枚");
        i1.setDescription("this is i1");
        i1.setDate("2014-02-14");
        i1.setLocation("北京");
        i1.setSource("对外经贸大学BBS");
        
        Intern i2 = new Intern();
        i2.setTitle("云基地天地超云招聘实习生");
        i2.setDescription("this is i1");
        i2.setDate("2014-02-14");
        i2.setLocation("北京");
        i2.setSource("北邮人BBS");
        
        Intern i3 = new Intern();
        i3.setTitle("互联网金融集团众筹网招聘实习生若干");
        i3.setDescription("this is i1");
        i3.setDate("2014-02-14");
        i3.setLocation("北京");
        i3.setSource("水木清华BBS");
        
        internList.add(i1);
        internList.add(i2);
        internList.add(i3);
        return internList;
    }
}
