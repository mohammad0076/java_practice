public class LabeledForExample {
    public static void main(String[]args){
        //using level
        aa:
        for(int i=1;i<=3;i++){
         for(int j=1;j<=3;j++){
             if(i==2 && j==2){
                 break aa;
             }
             System.out.println(i +" "+ j);
         }
        }


    }

}
