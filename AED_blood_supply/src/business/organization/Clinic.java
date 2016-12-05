/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.useraccount.UserAccountDir;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Clinic extends Organization{
        public Clinic(){
        super(OrganizationType.Clinic.getValue());
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
