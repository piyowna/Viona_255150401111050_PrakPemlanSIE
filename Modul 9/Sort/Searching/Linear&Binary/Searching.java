package Searching;

import java.util.Arrays;

public class Search {
    public static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int low = 0, high = arr.length - 1;
        while (low <= high) { // Perbaikan logika agar pencarian akurat
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) return mid;
            if (arr[mid] < search) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
            10, 56, 3, 88, 12, 45, 9, 21, 77, 34,
            6, 15, 90, 2, 67, 43, 11, 29, 50, 8,
            99, 14, 33, 72, 5, 20, 60, 31, 80, 25
        };

        System.out.println("Array Sebelum Terurut (Acak):");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("\nArray Setelah Terurut (Ascending):");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------------------");
        
        int target = 88;
        int indeksHasil = linearSearch(arr, target); 
        int indeksTidakAda = linearSearch(arr, 999);
        int a = binarySearch(arr, target); 
        int b = binarySearch(arr, 999);
        
        System.out.println("Hasil pencarian Linear Search untuk nilai 88: " + indeksHasil);
        System.out.println("Hasil pencarian untuk nilai yang tidak ada: " + indeksTidakAda);
        System.out.println("Hasil pencarian Binary Search untuk nilai 88: " + a);
        System.out.println("Hasil pencarian Binary Search nilai tidak ada: " + b);
    }
}
