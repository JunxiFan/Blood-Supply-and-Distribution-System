/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.blood;

import business.organization.Clinic;
import business.useraccount.DRAccount;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Blood {
    private DRAccount donor;
    private String bloodType;
    private String date;
    private Clinic clinic;

    public Blood(DRAccount donor, String bloodType, String date, Clinic clinic) {
        this.donor = donor;
        this.bloodType = bloodType;
        this.date = date;
        this.clinic = clinic;
    }

    public DRAccount getDonor() {
        return donor;
    }

    public void setDonor(DRAccount donor) {
        this.donor = donor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
    
    
}
