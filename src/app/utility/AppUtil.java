/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.utility;

/**
 *
 * @author casper
 */
public class AppUtil {

    public static String getExtension(String string) {
        if (string.toUpperCase().endsWith(".ZIP")) {
            return "zip";
        } else if (string.toUpperCase().endsWith(".RAR")) {
            return "rar";
        } else {
            return "rar";
        }
    }

}
