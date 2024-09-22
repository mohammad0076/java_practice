

public class oop1 {
    int rollNo;
    String name;
    void insertRecord(int r,String n){
        rollNo=r;
        name =n;

    }
    void displayInformation(){
        System.out.println(rollNo +""+name);

    }


        class TestStudent4 {
            public static void main(String args[]) {
                oop1 s1=new oop1();
                s1.insertRecord(1,"asdf");
                s1.displayInformation();
            }
        }

}
