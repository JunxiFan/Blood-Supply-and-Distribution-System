/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.BloodBankManager;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BloodBank extends Organization {

    private ArrayList<Clinic> ClinicList;
    private ArrayList<DistributionCenter> distributionCenterList;

    public BloodBank() {
        super(OrganizationType.BloodBank.getValue());
        ClinicList = new ArrayList<>();
        distributionCenterList = new ArrayList<>();
    }

    public ArrayList<DistributionCenter> getDistributionCenterList() {
        return distributionCenterList;
    }

    public void setDistributionCenterList(ArrayList<DistributionCenter> distributionCenterList) {
        this.distributionCenterList = distributionCenterList;
    }

    public ArrayList<Clinic> getClinicList() {
        return ClinicList;
    }

    public void setClinicList(ArrayList<Clinic> ClinicList) {
        this.ClinicList = ClinicList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManager());
        return roles;
    }
}
