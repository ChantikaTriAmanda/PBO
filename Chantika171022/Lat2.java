/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chantika171022;
import java.util.Scanner;
class Grade{
    String G1(int a1, char a, char b, char c, char d, char e){
        if(a1 <= 100){
            return "a";
        }
        else if(a1 <= 85){
            return "b";
        }
        else if(a1 <= 70){
            return "c";
        }
        else if(a1 >= 50){
            return "d";
        }
        else{
            return "e";
        }
    }
    String G2(int a1, String a, String b, String c, String d, String e){
        if(a1 <= 100){
            return "a";
        }
        else if(a1 <= 85){
            return "b";
        }
        else if(a1 <= 70){
            return "c";
        }
        else if(a1 >= 50){
            return "d";
        }
        else{
            return "e";
        }
    }


}


public class Lat2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        Grade g = new Grade();
        int ni;
        
        System.out.println("Nilai = ");
        ni = in.nextInt();
        
        System.out.println("Grade = "+g.G1(ni, 'A', 'B', 'C', 'D', 'E'));
        System.out.println("Keterangan = "+g.G2(ni, 'Sangat Baik', 'Cukup Baik', 'Baik', 'Cukup', 'Kurang'));
    }
}
