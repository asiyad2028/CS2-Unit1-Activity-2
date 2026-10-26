public class Main {
   public static double feetToInches(double feet) {
    double inches;
    // TODO: Convert feet to inches (1 foot = 12 inches)
    inches = feet * 12;
    return inches;
} 
   public static double calcLadderSize(double height, double width) {
   double ladderSize;
   // TODO: Calculate using Pythagorean theorem
   // Use Math.sqrt and Math.pow or *
   ladderSize = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
   return ladderSize; 
  }

   public static void main(String []args) {
    double result; feetToInches(8);
    //8.0 feet = 96.0 inches
    System.out.println("8.0 feet = " + result + " inches")

    double size = calcLadderSize(30,40);
    System.out.println("I need a " + size + " foot ladder!")
   }
}

