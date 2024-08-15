/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatable;

import java.util.Random;

/**
 *
 * @author SCORFi3LD
 */
public class RandomStringGenerator {

    private final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvqxuz";
    private final static Random R = new Random();

    public static String getString() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = R.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(ALPHABET.charAt(R.nextInt(ALPHABET.length())));
            }
        }
        return builder.toString();
    }
}
