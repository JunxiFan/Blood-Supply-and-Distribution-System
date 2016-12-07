/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.clinic.*;
import business.role.Role;
import business.useraccount.UserAccountDir;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Clinic extends Organization{
    private ArrayList<Organization> organizationList;
    
        public Clinic(String name){
        super(OrganizationType.Clinic.getValue());
        organizationList = new ArrayList();
        this.setName(name);
        initialClinic();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    public void initialClinic(){
        Laboratory laboratory=new Laboratory(this.getName()+"Laboratory");
        NurseCenter nurseCenter = new NurseCenter(this.getName()+"Nurce Center");
        ReceptionistService receptionistService = new ReceptionistService(this.getName()+"Receptionist Service");
        organizationList.add(laboratory);
        organizationList.add(nurseCenter);
        organizationList.add(receptionistService);
    }

        
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    //dfdfdfsdflskjafksjd
}
