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
public enum ChannelEnum {
    RETAIL("retail", 0),TV("TV", 1), INTERNET("internet", 2), EMAIL("email", 3), MAGAZINE("magazine", 4), LEAFLET("leaflet", 5);

    private String name;
    private int index;

    // Constructor
    ChannelEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (ChannelEnum c : ChannelEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
