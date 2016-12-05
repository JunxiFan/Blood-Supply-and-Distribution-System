/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.organization.Organization;
import business.useraccount.UserAccount;
import interfacepac.nurse.NurseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Nurse extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem business) {
        return new NurseWorkAreaJPanel(userProcessContainer);
    }
    
}
