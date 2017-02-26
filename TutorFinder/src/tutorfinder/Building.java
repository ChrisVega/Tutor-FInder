/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorfinder;

import java.awt.Rectangle;
import java.util.ArrayList;
import tutorfinder.Ref.location;

/**
 *
 * @author School - Chris
 */
public class Building {
    Rectangle coord = new Rectangle();
    ArrayList<Event> events = new ArrayList<Event>();
    location location; 
    
    public Building(Rectangle cord,location loc){
        coord = cord;
        location = loc;
    }
    
    public location getLoc(){
        return location;
    }
    
    public Rectangle getCoords(){
        return coord;
    }
    
    public void setCoords(Rectangle update){
        coord = update;
    }
    
    public String getbuilding(){
        return location.toString();
    }
    
    public ArrayList<Event> getevents(){
        return events;
    }
    
    public void addevent(Event e){
        events.add(e);
    }
    
}
