package com.Lokesh;

import java.util.Scanner;

public class Cv1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
       int ans =  nonPerfectSquaresOf(x);
        System.out.println(ans);

    }
    private static int  nonPerfectSquaresOf(int x) {
        int total = 0;
        for(int i = 2; i<x; i++){
            if(x%i == 0){
                int sr = (int)Math.sqrt(i);
                if(! (i * i == sr)){
                    total = total * 10 + i;
                }
            }
        }
        return ans(total);
    }
    static  int  ans(int tot){
        int nps = 0;
        while(tot>0){
            int rem = tot % 10;
            tot /= 10;
            nps++;
        }
        return nps;
    }
}