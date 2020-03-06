/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class While22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        do {
            JOptionPane.showMessageDialog(null, n);
            n--;
        } while (n >= 1);

    }
}
