/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Casper
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("tes.zip");
        String string = file.getAbsolutePath();
        System.out.println(string);
        System.out.println(string.toUpperCase().endsWith(".ZIP"));
    }

}
