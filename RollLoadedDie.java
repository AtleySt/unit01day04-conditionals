// good
public class RollLoadedDie {
    public static void main(String[] args) {
        double rand = Math.random();

        if (rand <= .125) {
            System.out.println("1");
        } else if (rand<=.25) {
            System.out.println("2");
        } else if (rand<=.375) {
            System.out.println("3");
        } else if (rand<=.5){
            System.out.println("4");
        } else if (rand<=.625){
            System.out.println("5");
        } else if (rand>.625){
            System.out.println("6");
        }
        // (all those extra checks were unnecessary)
        
    }
}
