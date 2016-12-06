/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BloodManageCenter extends Organization {

    private ArrayList<BloodBank> bloodBankList;
    private DistributionCenter distributionCenter;

    public BloodManageCenter(String name) {
        super(OrganizationType.BloodMngCenter.getValue());
        bloodBankList = new ArrayList();
        nextLvBloodManageCenterList = new ArrayList();
        this.setName(name);
    }

    public ArrayList<BloodBank> getBloodBankList() {
        return bloodBankList;
    }

    public void setBloodBankList(ArrayList<BloodBank> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }

    public DistributionCenter getDistributionCenter() {
        return distributionCenter;
    }

    public void setDistributionCenter(DistributionCenter distributionCenter) {
        this.distributionCenter = distributionCenter;
    }

    public ArrayList<BloodManageCenter> getNextLvBloodManageCenterList() {
        return nextLvBloodManageCenterList;
    }

    public void setNextLvBloodManageCenterList(ArrayList<BloodManageCenter> nextLvBloodManageCenterList) {
        this.nextLvBloodManageCenterList = nextLvBloodManageCenterList;
    }
    private ArrayList<BloodManageCenter> nextLvBloodManageCenterList;

    public BloodManageCenter createBloodManageCenter(String name) {
        BloodManageCenter bloodManageCenter = new BloodManageCenter(name);
        nextLvBloodManageCenterList.add(bloodManageCenter);
        return bloodManageCenter;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
