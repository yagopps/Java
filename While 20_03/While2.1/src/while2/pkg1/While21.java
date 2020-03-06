/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while2.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class While21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        do {
            JOptionPane.showMessageDialog(null, numero);
            numero++;
        } while (numero <= 100);

    }

}
