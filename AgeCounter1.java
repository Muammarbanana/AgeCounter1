/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecounter1;

import java.util.Scanner;

/**
 *
 * @author Ahmad Muammar Fanani
 */
public class AgeCounter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] noleap = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Age Counter Simple");
        Scanner input = new Scanner(System.in);
        System.out.print("Input your birth date (1-31) : ");
        int a = input.nextInt();
        System.out.print("Input your birth month (1-12): ");
        int b = input.nextInt();
        System.out.print("Input your birth year        : ");
        int c = input.nextInt();
        System.out.print("Input current date           : ");
        int d = input.nextInt();
        System.out.print("Input current month          : ");
        int e = input.nextInt();
        System.out.print("Input current year           : ");
        int f = input.nextInt();
        //Counter
        int year = (f-1) - (c);
        int month1 = 0;
        int month2 = 0;
        int temp = 0;
        for(int i = b; i < 12; i++){
            month1++;
        }
        for(int i = 0; i < e-1; i++){
            month2++;
        }
        int month = month1+month2;
        if(c%400==0 || c%4==0 && c%100!=0){
            temp = leap[b-1] - a;
        }else{
            temp = noleap[b-1] - a;
        }
        int date = temp + d;
        if(date>=30){
            month = month + 1;
            if(c%400==0 || c%4==0 && c%100!=0){
                date = date - leap[e-1];
            }else{
                date = date - noleap[e-1];
            }
        }
        if(date<0){
            date = 0;
        }
        if(month>=12){
            year = year+1;
            month = month-12;
        }
        System.out.println("Your Age Is : ");
        System.out.print(year+" year(s) ");
        System.out.print(month+" month(s) ");
        System.out.println(date+" day(s) ");
        if(date==0 && month==0){
            System.out.println("HAPPY BIRTHDAY");
        }
    } 
}
