package Maatriks;


import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class Main {

    public static void main(String[] args) {
        int[][] maatrix = new int[9][9];

        for (int i = 0; i < maatrix.length; i++)
            for (int j = 0; j < maatrix.length; j++) {
                if (i + j == i || i + j == j) {
                    maatrix[i][j] = 1;
                } else if (i + j == i + 1 || i + j == j + 1) {
                    maatrix[i][j] = 2;
                } else if (i + j == i + 2 || i + j == j + 2) {
                    maatrix[i][j] = 3;
                } else if (i + j == i + 3 || i + j == j + 3) {
                    maatrix[i][j] = 4;
                } else if (i + j == i + 4 || i + j == j + 4) {
                    maatrix[i][j] = 5;
                } else if (i + j == i + 5 || i + j == j + 5) {
                    maatrix[i][j] = 6;
                } else if (i + j == i + 6 || i + j == j + 6) {
                    maatrix[i][j] = 7;
                } else if (i + j == i + 7 || i + j == j + 7) {
                    maatrix[i][j] = 8;
                } else if (i + j == i + 8 || i + j == j + 8) {
                    maatrix[i][j] = 9;
                }


        /*for (int i = 0; i < maatrix.length; i++) {
            for (int j = 0; j < maatrix.length; j++) {
                if (i > j) {
                    maatrix[i][j] =  i  ;
                } else {
                    maatrix[i][j] =  maatrix.length-i ;

                }

            }
        }*/
                printMaatrix(maatrix);
            }
    }

    public static void printMaatrix (int [][] maatrix){
        for (int i = 0; i < maatrix.length; i++) {
            System.out.println(Arrays.toString(maatrix[i]));
        }
        System.out.println("");
    }
}
