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
public class ChannelManager  extends Person{
    private static int count=100;
    private int channelManagerID;
    
    public ChannelManager(){
        channelManagerID=count++;
    }
    
    @Override
    public String toString(){
        return this.getFirstName();
    }
    
}
