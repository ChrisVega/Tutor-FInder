/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorfinder;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static tutorfinder.Ref.location.PG6;

/**
 *
 * @author ntorr054
 */
public class University {
    private MapPannel maptst;
    private ImageIcon FIU_testmap = new ImageIcon("fiumap.png");
    int tnslx=0;
    int tnsly=0;
    int xx=0;
    int yy=0;
    ArrayList<Building> events = new ArrayList<Building>(){{
       add(new Building(new Rectangle(545,70,60,50),PG6));
    }};
    Building selectedbld = null;
    Boolean somethingwasselected = false;
    
    public University (MapPannel userMap){
        this.maptst = userMap;
    }
    
    void updateMap(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        tnslx = x-xx;
        tnsly = y-yy;
        updateBuldings();
    }
    
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        xx=x-tnslx;
        yy=y-tnsly;
    }
    
    public void mouseDragged(MouseEvent e) {
        updateMap(e);
    }

    public void mouseReleased(MouseEvent e) {

    }
    
    public void paint(Graphics2D maprndr){
        maprndr.setColor(Color.RED);
        
        Image map = FIU_testmap.getImage();
            maprndr.drawImage(map, 0+tnslx, 0+tnsly, null);
            maprndr.fillRect(545+tnslx,70+tnsly,60,50);
    }
    
    public void updateBuldings(){
        for(int i =0; i<events.size();i++){
            events.get(i).setCoords(new Rectangle(545+tnslx,70+tnsly,60,50));
        }
    }
    
    public ArrayList<Building> getBounds(){
        return events;
    }
    
    public ImageIcon getimg(){
        return FIU_testmap;
    }
    
    public void mouseClicked(MouseEvent e) {
        somethingwasselected=false;
        for(int i =0; i<getBounds().size();i++){
            if(getBounds().get(i).getCoords().contains(new Point(e.getX(),e.getY()))){
                somethingwasselected = true;
                selectedbld = events.get(i);
                return;
            }
        }
    }
    
    public Building getcurretn(){
        return selectedbld;
    }
    
    public Boolean getselectedboolean(){
        return somethingwasselected;
    }
    
    public void resetselectedboolean(){
        somethingwasselected=false;
    }
}
