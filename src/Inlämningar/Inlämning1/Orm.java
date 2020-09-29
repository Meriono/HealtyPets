package Inlämningar.Inlämning1;

import javax.swing.*;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-25
 * Time: 09:10
 * Project: Sprint1
 */
public class Orm extends Djur{

    public Orm(String namn, int vikt){
        super(namn, vikt);
    }

    @Override
    public void printFoder() {
        JOptionPane.showMessageDialog(null, "20 gram av " + TypAvFoder.ORMPELLETS);
    }
}

