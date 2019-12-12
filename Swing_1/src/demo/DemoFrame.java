/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author MichaelLake
 */
public class DemoFrame {
    public static void main(String[] a){
        JFrame frame = new JFrame("Test Content Pane");
        JLabel userNameLable = new  JLabel("User name");
        JTextField userNameText = new JTextField(20);
        JButton okButton = new JButton("OK");             
        JPanel contentPane =  (JPanel)frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        contentPane.add(userNameLable);
        contentPane.add(userNameText);
        contentPane.add(okButton);
        
        frame.pack();
        frame.setSize(400, 200);   
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);         
    
    }
}
