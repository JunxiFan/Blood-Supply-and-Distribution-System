/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public enum AgeGroupEnum {
        PERIOD1("0~8"), PERIOD2("9~13"), PERIOD3("14~19"), PERIOD4("20~25"), PERIOD5("26~37"),PERIOD6("38~52"),PERIOD7("53~75"),PERIOD8("75 above");
 
    private String value;
 
    private AgeGroupEnum(String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
}
