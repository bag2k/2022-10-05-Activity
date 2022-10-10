import java.util.Scanner;
import java.util.ArrayList;

public class Mymain{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Names> names = new ArrayList<Names>();
            System.out.print("Enter number/s of person you want to add: ");
            int obj = scan.nextInt();
            scan.nextLine();
                try{
                        if(obj > 0 ){
                            for(int i = 0;i<obj; i++){
                                System.out.println("Enter the name of " + i + ": ");
                                String name = scan.nextLine();
                                names.add(new Names(name));
                            }
                            for(int j = 0;j<obj; j++){
                                System.out.println(names.get(j).getName());
                            }
                        }else if(obj == 0){
                            scan.close();
                            throw new ExceptionS("Zero is not valid to input");
                        }else{
                            scan.close();
                            throw new ExceptionS("Negative Variable is not allowed");
                        }
                }catch(ExceptionS e){
                    System.out.println(e.getMessage());
                }
        
    } 
}
