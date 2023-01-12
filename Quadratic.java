public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            System.out.println(-c/b);
        } else if ((b*b-4*a*c)<0){
            System.out.println("No Solutions");
        } else if (b==0 && c>0){
            System.out.println("No Solutions");
        } else {
            double result = (-b + Math.sqrt(b*b - 4 * a * c))/(2 * a);
            double result2 = (-b - Math.sqrt(b*b - 4 * a * c))/(2 * a);

            System.out.println(result + ", " + result2);
        }

    }
}
