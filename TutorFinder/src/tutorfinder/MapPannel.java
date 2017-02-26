/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorfinder;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ntorr054
 */
public class MapPannel extends JPanel{
    private University uni = new University(this);
    private Mapwindow map = new Mapwindow(this, uni);
    private Student CurrentUser;
    
    public MapPannel(){
        addMouseListener(new MouseAdapter() {//does the stuff with the mouse
            @Override
             public void mouseClicked(MouseEvent e) {
                 uni.mouseClicked(e);
             }
             
            @Override
            public void mousePressed(MouseEvent e) {
                uni.mousePressed(e);
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                uni.mouseReleased(e);
                repaint();
            }
            
        });
            addMouseMotionListener(new MouseMotionAdapter() {//makes map move
            public void mouseDragged(MouseEvent e) {
                uni.mouseDragged(e);
                repaint();
           }
        });
    }
    
    public University getUni(){
        return uni;
    }
    
    public void setUser(Student s){
        CurrentUser =s;
    }
    
    public Student getUser(){
        return CurrentUser;
    }
    
    @Override
    public void paint(Graphics g){//renders map, important
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        uni.paint(g2d);
        g2d.dispose();
    }
}
