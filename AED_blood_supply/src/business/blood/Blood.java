/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.blood;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Blood {
    public enum BloodType {
        TYPEA("A"),
        TYPEB("B"),
        TYPEAB("AB"),
        TYPEO("O");
        
        private String value;

        private BloodType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
}
