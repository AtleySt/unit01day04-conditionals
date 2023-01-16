// good
public class ThreeEqual {
    public static void main(String[] args) {
        

        if (args.length < 3) {
            System.out.println("Please provide three numbers");
        }else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a == b){
                if (b == c){
                    System.out.println("equal");
                } else{
                    System.out.println("not equal");
                }
            } else{
                System.out.println("not equal");
            }
        }
        
    }
}