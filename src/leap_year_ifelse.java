public class leap_year_ifelse {
    public static void main(String[]args){


        int var = 2054;
        if (((var % 4 == 0) && (var % 100 != 0)) || (var%400==0)) {
            System.out.println("leap");
        }

        else {
            System.out.println("not leap");
        }

    }

}
