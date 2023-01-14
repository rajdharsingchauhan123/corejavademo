package org.example.com.array;

import java.util.Collection;
import java.util.Collections;

public class Demojava {
    public static void main(String[] args) {
        // how to declare in array in java
//        int[]a;
//        short[][] b;
//        Object[]ao;
       // int a,b[],c[][];

        int []a=new int[100];
        for (int i=0;i<a.length;i++)
            a[i]=i;
        int sum=0;
        for (int e:a){
            sum+=e;

        }
        System.out.println(sum);

    }
}
