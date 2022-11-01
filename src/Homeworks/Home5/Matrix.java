package Homeworks.Home5;

import java.util.Arrays;
import java.util.Random;


public class Matrix {

    public static String[][] matrica = new String[10][10];
    public static String[] getMainDiagonal = new String[10];
    public static String[] getSecondDiagonal = new String[10];
    public String[] getDiagonalsArray = new String[20];
    public StringBuilder diagonalArrayStrings = new StringBuilder();

    public void runProgramm() {

        Matrica();
        getMainDiagonal();
        getSecondDiagonal();
        diagonalsEquality();
        getDiagonalsArray();
        printoutStringAndDoubles();
        printMainMatrica();

    }


    public String[][] Matrica() {

        int i;
        int j;
        int elementNumber = 0;
        for (i = 0; i < matrica.length; i++) {
            for (j = 0; j < matrica[i].length; j++) {
                elementNumber++;
                if (elementNumber % 3 == 0) {
                    matrica[i][j] = String.valueOf(getRandomDouble()).substring(0, 7);
                } else {
                    matrica[i][j] = getRandomText();
                }

            }


        }
        return matrica;
    }

    public String[] getMainDiagonal() {
        System.out.println();
        System.out.println("Main diagonal is below:");
        int maxIndex = matrica.length - 1;
        for (int i = 0; i <= maxIndex; i++) {
            getMainDiagonal[i] = matrica[i][i];
            System.out.print(matrica[i][i] + " ");
        }

        System.out.println();

        return getMainDiagonal;
    }

    public String[] getSecondDiagonal() {
        System.out.println();
        System.out.println("Second diagonal is below:");
        int maxIndex = matrica.length - 1;
        for (int i = 0; i <= maxIndex; i++) {
            getSecondDiagonal[i] = matrica[i][maxIndex - i];
            System.out.print(matrica[i][maxIndex - i] + " ");
        }
        System.out.println();

        return getSecondDiagonal;
    }

    public void diagonalsEquality() {
        System.out.println();
        System.out.println("Checking if diagonals are equal...");
        if (Arrays.equals(getMainDiagonal, getSecondDiagonal)) {
            System.out.println("Diagonals are not equal");
        } else {
            System.out.println("Diagonals are equal");
        }

    }

    public String[] getDiagonalsArray() {
        System.out.println();
        System.out.println("A new array from two diagonals created: ");
        for (int i = 0; i < getMainDiagonal.length; i++) {
            getDiagonalsArray[i] = getMainDiagonal[i];
        }
        for (int i = getDiagonalsArray.length - getMainDiagonal.length; i < getDiagonalsArray.length; i++) {
            getDiagonalsArray[i] = getSecondDiagonal[i - getMainDiagonal.length];

        }
        for (int i = 0; i < getDiagonalsArray.length; i++) {
            System.out.print(getDiagonalsArray[i] + " ");

        }

        return getDiagonalsArray;


    }

    public void printoutStringAndDoubles() {
        System.out.println();
        System.out.println("\nPRINTING OUT STRINGS FROM DIAGONALS ARRAY");
        for (int i = 0; i < getDiagonalsArray.length; i++) {
            if (!getDiagonalsArray[i].contains(".")) {
                String str = getDiagonalsArray[i].substring(2, 5);
                if (!diagonalArrayStrings.isEmpty()) {
                    diagonalArrayStrings.append(",");
                }
                diagonalArrayStrings.append(str);

            }
        }
        System.out.println(diagonalArrayStrings);

    }


    public void printMainMatrica() {
        System.out.println();
        System.out.println("PRINTING OUT MAIN MATRIX");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String getRandomText() {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int length = 7;
        StringBuilder sb = new StringBuilder(length);
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(alpha.charAt(rand.nextInt(alpha.length())));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    public static double getRandomDouble() {
        double a = (Math.random() * (7 - 2) + 1);
        System.out.println(a);
        return a;


    }

}


