/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        SAdmin("Admin"),
        Donor("Doctor"),
        Nurse("Nurse"),
        Receiver("Receiver"),
        Receptionist("Receptionist");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}