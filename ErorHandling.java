/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Main;
import javax.swing.JOptionPane;
/**
 *
 * @author London
 */
public class ErorHandling {
    public void erTinggi(String erTinggi){
        JOptionPane.showMessageDialog(null, "For input string : " + erTinggi, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public void erPanjang(String erPanjang){
        JOptionPane.showMessageDialog(null, "For input string : " + erPanjang, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public void erLebar(String erLebar){
        JOptionPane.showMessageDialog(null, "For input string : " + erLebar, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}
