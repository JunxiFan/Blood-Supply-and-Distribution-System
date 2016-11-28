/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.organization.*;
import business.role.Role;
import business.role.SAdmin;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<BloodManageCenter> bloodManageCenterList;

    private EcoSystem() {
        super(null);
        bloodManageCenterList = new ArrayList();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public ArrayList<BloodManageCenter> getBloodManageCenterList() {
        return bloodManageCenterList;
    }

    public void setBloodManageCenterList(ArrayList<BloodManageCenter> bloodManageCenterList) {
        this.bloodManageCenterList = bloodManageCenterList;
    }

    public BloodManageCenter createBloodManageCenter() {
        BloodManageCenter bloodManageCenter = new BloodManageCenter();
        bloodManageCenterList.add(bloodManageCenter);
        return bloodManageCenter;
    }



    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SAdmin());
        return roleList;
    }

}
