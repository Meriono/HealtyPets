package Inlämningar.Inlämning1;

/**
 * Created by Hanna Edlund
 * Date: 2020-09-26
 * Time: 11:07
 * Project: Sprint1
 */
public enum TypAvFoder {
    HUNDFODER("hundfoder"),
    KATTFODER("kattfoder"),
    ORMPELLETS("ormpellets");

    private final String typAvFoder;

    TypAvFoder(String foder){
        typAvFoder = foder;
    }

    public String getStringTypAvFoder(){
        return typAvFoder;
    }
}
