public class pratice {
    @SuppressWarnings("unused")
    public pratice(String[] args) {
        String name = "Maheshbabu";
        System.out.println(name);
        int HundredcroresRecords = 5;
        System.out.println(HundredcroresRecords);
        final int SSMB29day1 = 350;
     //     SSMB29day1 = 250;
        double twohundredcrgross = 1;
        int myint = (int) twohundredcrgross;
        System.out.println(twohundredcrgross);
        System.out.println(myint);
        int Srimanthudu = 143;
        int BAN = 164;
        int Maharshi =174;
        int sln = 213;
        int svp = 169;
        int GK = 216;
        int total =  Srimanthudu + BAN + Maharshi + sln + svp + GK;
        System.out.println(total);
        if (total > 1500) {
            System.out.println("SUPERSTAR THOPU VEELU AITE AAPU");
        } else if (total > 1000) {
            System.out.println("Babu lake babu mahesh babu");
        } else {
                System.out.println("eesari opening day ne 500 kodatam");
            }
       String result = (total > 2000) ? "Superstar." : "prince.";
        System.out.println(result);
        int totals = 1079;
         switch (totals) {
           case 100:
             System.out.println("hundred crores");
             break;
           case 200:
             System.out.println("two hundres crores");
             break;
           case 300:
              System.out.println("three hundred crores");
              break;
           case 400:
               System.out.println("four hundred crores");
               break;
           case 1079:
               System.out.println("Babu thopu veelu aite aapu");
               break;
         }
        int i = 0;
        do {
          System.out.println(i);
          i++;
        }
        while (i<5);
      String[] Movies = {"Srimanthudu", "SLN", "SVP", "GK"};
       for (String a : Movies) {
        System.out.println(a);
       }  
       for (int X = 0; X < 5; X++) {
        System.out.println(X);
      } 
       for (int d = 0; d <= 2; d++) {
         System.out.println("outer :" +d);
       for (int j = 1; j <= 3; j++) {
          System.out.println(" Inner: " + j);
        } 
       } 
      }
