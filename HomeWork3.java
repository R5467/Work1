/**
 * Java 3. Home work #3
 *
 * @avthor Inna
 * @version 16.2.2022
 */

class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = {  1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		System.out.println("");
        invertArray(arr1);
        System.out.println("");
        fillArray(100);
        System.out.println("");
        changeArray(arr3); 
        System.out.println("");
        fillDiagonal(); 
        System.out.println("");
        fillDiagonal0(3, 2);
	}

    static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        } 
    }
    
    static void fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    
    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    
    static void fillDiagonal() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void fillDiagonal0(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
    }
}