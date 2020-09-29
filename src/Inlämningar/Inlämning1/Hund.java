package Inlämningar.Inlämning1;

import javax.swing.*;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-25
 * Time: 09:10
 * Project: Sprint1
 */
public class Hund extends Djur{
    private int matPortion = beräknaFoder(getViktIgram(getVikt()), 100);

    public Hund(String namn, int vikt){
        super(namn, vikt);
    }

    @Override
    public void printFoder() {
        JOptionPane.showMessageDialog(null, matPortion + " gram av " + TypAvFoder.HUNDFODER.getStringTypAvFoder());
    }
}


