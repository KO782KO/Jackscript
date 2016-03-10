/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Kevin
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

import sun.misc.Resource;
 
/**
 * This class demonstrates how to load an Image from an external file
 */
@SuppressWarnings({ "serial", "unused" })
public class LoadImageApp extends Component {
           
    BufferedImage img;
    ImageIcon i;
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
 
    public LoadImageApp() {
       //img = new ImageIcon (getClass().getResource("myimage.jpeg")));
    	try {
			img= ImageIO.read(getClass().getResource("/resources/GameIcon2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  // i = new ImageIcon (getClass().getResource("GameIcon.jpg"));
	 //  img=(BufferedImage) i.getImage();
 
    }
    public Image getImage(String path){
    	try {
			img= ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return img;
    }
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
 
    public static void main(String[] args) {
 
        JFrame f = new JFrame("Load Image Sample");
             
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
 
        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}