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

    public final String stringTypAvFoder;

    TypAvFoder(String foder){
        stringTypAvFoder = foder;
    }
}
