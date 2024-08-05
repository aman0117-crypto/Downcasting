package Non_primitive_typecasting.downcasting;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Vegetable v=new Vegetable();
        Potato p=new Potato();
        Onion o=new Onion();

        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter 1 for adding potato:");
        System.out.println("Enter 2 for adding onion:");
        int a=sc.nextInt();
        if(a==1){
            v=p;
            System.out.println("Items are added into cart..");

        }
        else if(a==2){
            v=o;
            System.out.println("Items are added into cart..");

        }
        else{
            System.out.println("invalid selection..");
        }
        if(v instanceof Potato){
            p=(Potato)v;
            System.out.println(p.region);
            System.out.println(p.price);
        }
        else if(v instanceof Onion){
            o=(Onion)v;
            System.out.println(o.region);
            System.out.println(o.price);
        }
        else{
            System.out.println("item not add..");
        }
       


        //v=o; //for downcasting first done upcasting
        //p=(Potato)v; //DOWNCASTING
        //System.out.println(p);

    }
    
}
