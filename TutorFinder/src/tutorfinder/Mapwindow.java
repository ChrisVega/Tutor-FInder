/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorfinder;


/**
 *
 * @author ntorr054
 */
public class Mapwindow {
    private MapPannel usermap;
    private University Uni;
    private int x;
    private int y;
    
    public Mapwindow(MapPannel mappnl, University uni){
        this.Uni = uni;
        this.usermap = mappnl;
        x = Uni.getimg().getIconWidth();
        y = Uni.getimg().getIconHeight();
    }
    
    public int getinit_x(){
        return x;
    }
    
    public int getinit_y(){
        return y;
    }

}
