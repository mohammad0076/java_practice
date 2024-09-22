import java.util.Locale;

public class duplicate {
    public static void main(String[] args){
        String s ="Hackerearth".toLowerCase();
        char[] character=s.toCharArray();
//        System.out.println(character);
        boolean isnotduplicate=false;
        for(int i=0;i<character.length;i++){
//            System.out.println(character[i]);
            boolean isduplicate=false;
            for(int j=i+1;j<s.length();j++){
                if(character[i]==character[j]){
                    isduplicate=true;
                    break;
                }
            }
            if(isduplicate){
                System.out.println(character[i]);
                isnotduplicate=true;
            }
        }
        if(!isnotduplicate){
            System.out.println("No duplicated");
        }


    }
}
