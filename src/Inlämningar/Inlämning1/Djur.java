package Inlämningar.Inlämning1;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-25
 * Time: 09:10
 * Project: Sprint1
 */
abstract class Djur implements IFoder {
    //Inkapsling
    private String namn;
    private int vikt;
    private int viktIgram;
    private int matMängd;
    private TypAvFoder foder;

    public Djur(){}

    public Djur(String namn, int vikt, TypAvFoder foder) {
        this.namn = namn;
        this.vikt = vikt;
        this.foder = foder;
    }

    public String getNamn() {
        return namn;
    }

    public TypAvFoder getTypAvFoder() { return foder; }

    public int getVikt() {
        return vikt;
    }
    public int beräknaFoder(int vikt, int beräkning) {
        return matMängd = vikt/beräkning;
    }
    public int getViktIgram(int vikt) {
        return viktIgram = vikt * 1000;
    }


}
