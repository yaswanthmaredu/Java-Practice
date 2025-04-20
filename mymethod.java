public class mymethod {
    static void myMethod(String fname) {
        System.out.println(" Prince " + fname);
      }
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
    static double plusMethodDouble(double x, double y) {
        return x + y;
      }
      public static void main(String[] args) {
        myMethod("Mahesbabu");
        myMethod("ghatamaneni Maeshbabu");
        myMethod("Gowtham");
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }  
}
