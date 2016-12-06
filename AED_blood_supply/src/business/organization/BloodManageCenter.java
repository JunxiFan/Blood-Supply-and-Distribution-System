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
    private ArrayList<DistributionCenter> distributionCenterList;

    public ArrayList<BloodBank> getBloodBankList() {
        return bloodBankList;
    }

    public void setBloodBankList(ArrayList<BloodBank> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }

    public ArrayList<DistributionCenter> getDistributionCenterList() {
        return distributionCenterList;
    }

    public void setDistributionCenterList(ArrayList<DistributionCenter> distributionCenterList) {
        this.distributionCenterList = distributionCenterList;
    }

    public ArrayList<BloodManageCenter> getNextLvBloodManageCenterList() {
        return nextLvBloodManageCenterList;
    }

    public void setNextLvBloodManageCenterList(ArrayList<BloodManageCenter> nextLvBloodManageCenterList) {
        this.nextLvBloodManageCenterList = nextLvBloodManageCenterList;
    }
    private ArrayList<BloodManageCenter> nextLvBloodManageCenterList;

    public BloodManageCenter() {
        super(OrganizationType.BloodMngCenter.getValue());
        bloodBankList=new ArrayList();
        distributionCenterList=new ArrayList();
        nextLvBloodManageCenterList = new ArrayList();
    }
    
    public BloodManageCenter createBloodManageCenter() {
        BloodManageCenter bloodManageCenter = new BloodManageCenter();
        nextLvBloodManageCenterList.add(bloodManageCenter);
        return bloodManageCenter;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
