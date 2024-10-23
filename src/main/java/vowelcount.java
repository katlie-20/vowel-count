/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class vowelcount {
    public static int countVowels(String sentence){
        int count = 0;
        sentence = sentence.toLowerCase();
        
        for(int i =0; i < sentence.length();i++){
            char ch = sentence.charAt(i);
        if("aeiou".indexOf(ch)! = -1){
            count ++;
        }
    }
}
