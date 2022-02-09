class HomeWork1 {
    //поля
	//методы
	//классы
	public static void main(String[] args) {
		 printThreeWords();
		 checkSumSign();
		 printColor();
		 compareNumbers();
	}
	
	static void printThreeWords() {
		System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
	}
	
	public static void checkSumSign() {
      int a = -1;
	  int b = 4;

      if ((a + b) >= 0) {
         System.out.println("Sum is more than 0");
      }
      else {
         System.out.println("Sum is less than 0");
      }
   }
   
      public static void printColor() {
      int value = 15;

      if (value <=0) {
         System.out.println("Red");
      } 
	  if ( value > 1 || value <= 100) {
         System.out.println("Yellow");
      } 
	  if (value > 101) {
         System.out.println("Зеленый");
      }
   }
   
   public static void compareNumbers() {
int d = 10;
int c = 5;

  if (d >= c) {
     System.out.println("d >= c");
  } else if (d < c) {
     System.out.println("a < b");
  }
   }
}
