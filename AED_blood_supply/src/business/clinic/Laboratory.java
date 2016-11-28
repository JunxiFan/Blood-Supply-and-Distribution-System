/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.clinic;

import business.organization.*;
import business.role.LabAssistant;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Laboratory extends Clinic{
    
    public Laboratory(){
        super(ClinicType.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
       roles.add(new LabAssistant());
       return roles;
    }
}
