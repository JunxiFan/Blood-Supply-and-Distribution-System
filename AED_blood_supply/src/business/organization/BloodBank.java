/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.blood.Blood;
import business.role.BloodBankManager;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BloodBank extends Organization {

    private ArrayList<Clinic> clinicList;
    private DistributionCenter distributionCenter;
    private ArrayList<Blood> BloodRepertory;

    //private BloodManageCenter upOrgan = null;

    public BloodBank(String name) {
        super(OrganizationType.BloodBank.getValue());
        clinicList = new ArrayList<>();
        this.setName(name);
        distributionCenter = new DistributionCenter(name+" distribution");
        distributionCenter.setUpOrgan(this);
        BloodRepertory = new ArrayList<>();
    }

    public DistributionCenter getDistributionCenter() {
        return distributionCenter;
    }

    public void setDistributionCenter(DistributionCenter distributionCenter) {
        this.distributionCenter = distributionCenter;
    }


    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }

    public void setClinicList(ArrayList<Clinic> clinicList) {
        this.clinicList = clinicList;
    }
    
    public Clinic createClinic(String name) {
        Clinic clinic = new Clinic(name);
        clinicList.add(clinic);
        return clinic;
    }

    public ArrayList<Blood> getBloodRepertory() {
        return BloodRepertory;
    }

    public void setBloodRepertory(ArrayList<Blood> BloodRepertory) {
        this.BloodRepertory = BloodRepertory;
    }

//    public BloodManageCenter getUpOrgan() {
//        return upOrgan;
//    }
//
//    public void setUpOrgan(BloodManageCenter upOrgan) {
//        this.upOrgan = upOrgan;
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManager());
        return roles;
    }
}
