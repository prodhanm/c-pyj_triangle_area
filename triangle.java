import java.util.Scanner;

class Triangle {

    public static double triArea(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    public static void main(String[] args) {
        double b, h;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        b = inp.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        h = inp.nextDouble();
        double areaTri = triArea(b, h);
        System.out.println("The area of the triangle is: " + areaTri);
        inp.close();
    }
}