public class duplo {
    public static void main(String[]args){
       String word="madam".toLowerCase();
       char[] character=word.toCharArray();
       boolean isnotduplicate=false;
       for (int i=0;i<word.length();i++){
           boolean isduplicate=false;
//           System.out.println(character[i]);
           for (int j=i+1;j<word.length();j++){
              if(character[i]==character[j]){
                  isduplicate=true;
                  continue;

              }

           }
           if(isduplicate){
               System.out.println(character[i]);
               isnotduplicate=true;

           }
       }
    }


}
