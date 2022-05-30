import level2.*;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        Barcode barcode = new Barcode();
//        String barcode1 = barcode.barcode(8);
//        System.out.println("barcode1 = " + barcode1);

        boolean ok = barcode.isOk("123131");
        System.out.println("ok = " + ok);


        // 1231312
        // 23/23 12
        // 2 / 1
        // 12 /

    }
}

