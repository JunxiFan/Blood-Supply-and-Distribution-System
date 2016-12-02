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

    public BloodManageCenter() {
        super(OrganizationType.BloodMngCenter.getValue());
        bloodBankList=new ArrayList();
        distributionCenterList=new ArrayList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
