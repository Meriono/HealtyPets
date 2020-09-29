package Inlämningar.Inlämning1;

import javax.swing.*;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-25
 * Time: 09:10
 * Project: Sprint1
 */
public class Katt extends Djur {
    private int matPortion = beräknaFoder(getViktIgram(getVikt()), 150);

    public Katt(String namn, int vikt, TypAvFoder foder){
        super(namn, vikt, foder);
    }

    @Override
    public void printFoder() {
        JOptionPane.showMessageDialog(null, matPortion + " gram av " + getTypAvFoder().stringTypAvFoder);
    }
}

