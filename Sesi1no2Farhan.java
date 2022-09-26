package tugaspbosesi1farhan;

import javax.swing.JOptionPane;

public class Sesi1no2Farhan {
    public static void main(String[] args) {
        String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}