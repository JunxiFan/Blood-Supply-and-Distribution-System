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
public class Market {
    private int size;
    private int monetaryValue;
    private int marketLevel;
    private String marketName;
    private Market seniorMarket;
    private ArrayList<Market> juniorMarketList;
    private ArrayList<Characteristic> characteristicsList;
    private ArrayList<String> benefitsList;
    private ArrayList<Channel> channelList;
    private ArrayList<ProductPackage> productPackagesList;
}
