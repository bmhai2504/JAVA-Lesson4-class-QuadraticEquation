import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Nhap a: ");
        double a = input.nextDouble();
        System.out.printf("Nhap b: ");
        double b = input.nextDouble();
        System.out.printf("Nhap c: ");
        double c = input.nextDouble();

        QuadraticEquation ptBac1 = new QuadraticEquation(a, b, c);

        if(ptBac1.getDiscriminant() > 0){
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + ptBac1.getRoot1());
            System.out.println("x2 = " + ptBac1.getRoot2());
        } else if (ptBac1.getDiscriminant() == 0){
            System.out.println("Phuong trinh co 2 nghiem bang nhau: ");
            System.out.println("x1 = x2 = " + ptBac1.getRootChung());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}