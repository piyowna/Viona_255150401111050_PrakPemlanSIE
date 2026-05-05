package Searching;

import java.util.Arrays;

public class Search {
    public static int linearSearch(int[] arr, int search) {
        int check = 0; // Deklarasi variabel loka
        for (int i = 0; i < arr.length; i++) {
            check++; // Bertambah setiap perulangan
            if (arr[i] == search) {
                System.out.println("Jumlah pengecekan: " + check + " kali");
                return i;
            }
        }
        System.out.println("Jumlah pengecekan: " + check + " kali");
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0; // Deklarasi variabel loka
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            check++; // Bertambah setiap perulangan
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Jumlah pengecekan: " + check + " kali");
                return mid;
            }
            if (arr[mid] < search) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Jumlah pengecekan: " + check + " kali");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
            10, 56, 3, 88, 12, 45, 9, 21, 77, 34,
            6, 15, 90, 2, 67, 43, 11, 29, 50, 8,
            99, 14, 33, 72, 5, 20, 60, 31, 80, 25
        };

        Arrays.sort(arr); 

        int target = 88;

        System.out.println("Pencarian Linear (Linear Search):");
        int resLinear = linearSearch(arr, target);
        System.out.println("Nilai " + target + " berada pada indeks " + resLinear);
        System.out.println();

        System.out.println("Pencarian Biner (Binary Search):");
        int resBinary = binarySearch(arr, target);
        System.out.println("Nilai " + target + " berada pada indeks " + resBinary);
    }
}
