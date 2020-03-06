/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while3;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class While3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r= 0, c = 1, n = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
        
        while(c<=10){ 
            r = n*c;
            JOptionPane.showMessageDialog(null, n+" X "+c+" = "+r);
            
            c++;
        
    }
    
 }
}