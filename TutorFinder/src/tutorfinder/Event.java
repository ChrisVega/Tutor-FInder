/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorfinder;

import java.util.ArrayList;
import tutorfinder.Ref.area;
import tutorfinder.Ref.location;

/**
 *
 * @author School - Chris
 */
public class Event {
    Student init_user =null;
    area major=null;
    location location=null;
    String roomnumber="";
    String roomnum="";
    String Class="";
    String description="";
    Boolean needhelp=true;
    ArrayList<Student> students = new ArrayList<Student>();
    
    public Event(Student user, location loc, area maj, String des, String clss, String rmnum, Boolean help){
        init_user = user;
        location = loc;
        major = maj;
        description = des;
        Class = clss;
        roomnumber = rmnum;
        needhelp = help;
        
    }
    
    public Event(Student user, location loc, String des, String clss, String rmnum, Boolean help){
        init_user = user;
        location = loc;
        description = des;
        Class = clss;
        roomnumber = rmnum;
        needhelp = help;
    }
    
    public String getEventdis(){
        String s;
        if(needhelp==true){
            s="Need help with ";
        }else{
            s="Offering help with ";
        }
        return s=s.concat(Class);
    } 
    
    public void addUser(Student std){
        students.add(std);
    }
    
    public Student getinitUser(){
        return init_user;
    }
    
    @Override
    public String toString(){
        String s;
        if(needhelp==true){
            s="Need help with ";
        }else{
            s="Offering help with ";
        }
        s=s.concat(Class + "\nRoomnumber: " + roomnumber + "\n" + description 
                + "\nStarted by: " + init_user.getName() + "\nStudents attending: ");
        if(students.isEmpty()){
            s=s.concat("\nNone yet, be the first!");
        }else{
            for(int i=0;i<students.size();i++){
                s=s.concat("\n" + students.get(i).getName());
            }
        }
        return s;
    }
    
}
