package Sorting;

import java.util.Arrays;

public class Sort {

    // FUngsi Bubble
    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0; //Deklarasi variabel
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[i]) { //Diubah < menjadi >  
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++; //Mencatat setiap perubahan
                }
            }
        }
         System.out.println("Jumlah elemen ditukar (Bubble): " + tukarAtauGeser);
        return list;
    }

    // Fungsi Insertion
    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0; //Deklarasi variabel
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] < key) { //diubah > menjadi <
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++; //Mencatat setiap perubahan
            }
            list[k + 1] = key;
        }
        System.out.println("Jumlah elemen digeser (Insertion): " + tukarAtauGeser);
        return list;
    }

    // Fungsi Selection= 
    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0; //Deklarasi variabel
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) //diubah < menjadi >
                    minIndex = k;
            }
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++; //Mencatat setiap perubahan
        }
        System.out.println("Jumlah elemen ditukar (Selection): " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {
            12, 45, 7, 23, 56, 89, 34, 1, 67, 90, 
            2, 15, 38, 55, 99, 10, 44, 21, 76, 82, 
            18, 29, 4, 60, 33, 88, 51, 9, 72, 40
        };

        System.out.println("Isi Array arr[]: " + Arrays.toString(arr));
        System.out.println("--------------------------------------------------");

        // 1. Menguji Bubble Sort
        int[] dataBubble = arr.clone();
        bubble(dataBubble);
        System.out.println("Sesudah diurutkan (Bubble) :");
        System.out.println(Arrays.toString(dataBubble));
        System.out.println();

        // 2. Menguji Insertion Sort
        int[] dataInsertion = arr.clone();
        insertion(dataInsertion);
        System.out.println("Sesudah diurutkan (Insertion):");
        System.out.println(Arrays.toString(dataInsertion));
        System.out.println();

        // 3. Menguji Selection Sort
        int[] dataSelection = arr.clone();
        selection(dataSelection);
        System.out.println("Sesudah diurutkan (Selection):");
        System.out.println(Arrays.toString(dataSelection));
        
    }
}
