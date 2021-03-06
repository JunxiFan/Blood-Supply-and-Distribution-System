/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.clinic;

import business.organization.Clinic;
import business.organization.Organization;
import business.role.LabAssistant;
import business.role.Medicalstaff;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class NurseCenter extends Organization {

    //private Clinic upOrgan = null;
    
    public NurseCenter(String name) {
        super(OrganizationType.NurseCenter.getValue());
        this.setName(name);
    }
//
//    public Clinic getUpOrgan() {
//        return upOrgan;
//    }
//
//    public void setUpOrgan(Clinic upOrgan) {
//        this.upOrgan = upOrgan;
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
       roles.add(new Medicalstaff());
       return roles;
    }

}
