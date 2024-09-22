public class ifelse3 {
    public static void main(String[]args){
        String address="dhaka ,tongi";
        if(address.endsWith("tongi")){
            if(address.contains("dhak")){
                System.out.println("dhaka");
            }
            else {
                System.out.println(address.split(",")[1]);

            }

        }
        else {
            System.out.println("you are out of BD");
        }


    }
}
