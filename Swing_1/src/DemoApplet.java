/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.*;
/**
 *
 * @author MichaelLake
 */
public class DemoApplet extends JApplet {
        JLabel userNameLable = new  JLabel("User name");
        JTextField userNameText = new JTextField(20);
        JButton okButton = new JButton("OK");
                 
    public void init() {
        this.setLayout(new FlowLayout());
        this.add(userNameLable);
        this.add(userNameText);
        this.add(okButton);
    }

   
}
