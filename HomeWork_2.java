/**
 * Java 2. Home work #2
 *
 * @avthor Inna
 * @version 12.2.2022
 */

class HomeWork_2 {
    public static void main(String[] args) {
		 System.out.println(checkSumSign(5, 10));
         isPositiveOrNegative(5);
         isNegative(-4);
         printWordNTimes("Red",4);
	}
	
	static boolean checkSumSign(int a, int b) {
		int c = a + b;
		if (10<=c && c<=20) {
            return true;
        }	
        return false;
    }
    
    static void isPositiveOrNegative(int x) {
        if (x >=0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
   
    static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    
    static void printWordNTimes(String w, int t) {
        for (int i = 1; i <= t; i++) {
            System.out.println("[" + i + "]" + " " + w);
        }
    }
}