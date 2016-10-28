/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class Channel {
    private String channelName;
    private ArrayList<Market> MarketList;
    
    @Override
    public String toString(){
        return channelName;
    }
}
