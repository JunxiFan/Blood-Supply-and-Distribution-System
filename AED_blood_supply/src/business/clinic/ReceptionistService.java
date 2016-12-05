/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.clinic;

import business.organization.Clinic;
import business.organization.Organization;
import business.role.LabAssistant;
import business.role.Receptionist;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class ReceptionistService extends Organization{
     public ReceptionistService(){
        super(OrganizationType.ReceptionistService.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
       roles.add(new Receptionist());
       return roles;
    }
}
