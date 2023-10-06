public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean leapYear = isLeapYear(2001);
        boolean A = isLeapYear(2010);
        boolean B = isLeapYear(2012);
        boolean C = isLeapYear(2028);
        boolean D = isLeapYear(2027);
        boolean E = isLeapYear(2026);
        boolean F= isLeapYear(2024);
        boolean G = isLeapYear(2025);


        System.out.println(" a leap year? " + leapYear);
        System.out.println(" a leap year? " + A);
        System.out.println(" a leap year? " + B);
        System.out.println(" a leap year? " + C);
        System.out.println(" a leap year? " + D);
        System.out.println(" a leap year? " + E);
        System.out.println(" a leap year? " + F);
        System.out.println(" a leap year? " + G);

    }
}
