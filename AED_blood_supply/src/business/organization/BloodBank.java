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
    private DistributionCenter distributionCenter;

    public BloodBank(String name) {
        super(OrganizationType.BloodBank.getValue());
        ClinicList = new ArrayList<>();
        this.setName(name);
    }

    public DistributionCenter getDistributionCenter() {
        return distributionCenter;
    }

    public void setDistributionCenter(DistributionCenter distributionCenter) {
        this.distributionCenter = distributionCenter;
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
