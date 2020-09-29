package Inlämningar.Inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-26
 * Time: 11:30
 * Project: Sprint1
 */
public class MatDags {
    String input;

    public MatDags(){
        //Polymorfism vid instansiering av nya djur
        Djur Sixten = new Hund("Sixten", 5, TypAvFoder.HUNDFODER);
        Djur Dogge = new Hund("Dogge", 10, TypAvFoder.HUNDFODER);
        Djur Venus = new Katt("Venus", 5, TypAvFoder.KATTFODER);
        Djur Ove = new Katt("Ove", 3, TypAvFoder.KATTFODER);
        Djur Hypno = new Orm("Hypno", 1, TypAvFoder.ORMPELLETS);

        List<Djur> allaDjur = new ArrayList<>();
        //allaDjur.add(Sixten = new Hund("Sixten", 5));
        allaDjur.add(Sixten);
        allaDjur.add(Dogge);
        allaDjur.add(Venus);
        allaDjur.add(Ove);
        allaDjur.add(Hypno);

        printMatDags(allaDjur);
    }

    public void printMatDags(List<Djur> allaDjur) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

            if(!checkInput(input))
                continue;

            for (Djur d : allaDjur) {
                if (d.getNamn().toLowerCase().equals(input.toLowerCase())) {
                    d.printFoder();
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null, "Det finns inget djur med det namnet");
        }
    }

    public boolean checkInput(String input){
        if(input == null){
            JOptionPane.showMessageDialog(null, "Du har valt att avbryta programmet");
            System.exit(0);
            return true;
        }

        if(input.isEmpty()){
            JOptionPane.showMessageDialog(null, "Du har inte fyllt i något namn");
            return false;
        }
        return true;
    }
}
