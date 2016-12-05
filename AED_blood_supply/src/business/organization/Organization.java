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
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private UserAccountDir userAccountList;
    private int organizationID;
    private static int counter;

    public enum OrganizationType {
        Clinic("Clinic"),
        BloodBank("Blood Bank"),
        BloodMngCenter("Blood Manage Center"),
        Distribution("Distribution Center"),
        Lab("Laboratory"),
        NurseCenter("Nurse Center"),
        ReceptionistService("ReceptionistService");
        
        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountList = new UserAccountDir();
        organizationID = counter;
        counter++;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDir getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(UserAccountDir userAccountList) {
        this.userAccountList = userAccountList;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    @Override
    public String toString() {
        return name;
    }

}
