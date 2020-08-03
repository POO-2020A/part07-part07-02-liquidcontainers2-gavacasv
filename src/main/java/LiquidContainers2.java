
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first=new Container();
        Container second=new Container();


        while (true) {
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partes=input.split(" ");
            int amount=Integer.valueOf(partes[1]);
            switch (partes[0]){
                case "add":
                    first.add(amount);
                 break;   
                case "remove":
                    second.remove(amount);
                 break;   
                case "move":
                    if(first.contains()<amount || first.contains()==0){
                        amount=first.contains();
                    }
                    second.add(amount);
                    first.remove(amount);

                 break;   
            }

           
            

        }
    }

}
