package com.enrique;

public class Main {

    public static void main(String[] args) {
        int[] dato = new int[8];
        dato[0] = 10;
        dato[1]= 11;
        dato[2]= 12;
        dato[3]= 14;
        dato[4] = 15;
        dato[5]=23;
        dato[6]= 23;
        dato[7]= 43;

        for (int i=0; i<8; i++){
        System.out.println("el numero es: " + dato[i]);

        }

            int j =0;
        while ( j<8){
            System.out.println("imprimiendo en j:" + dato[j]);
            j++;
        }

            for(int numero2: dato){
                System.out.println("foreach numeor del: "+numero2);

            }



    }
}
