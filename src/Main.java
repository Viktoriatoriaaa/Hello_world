import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Введите количество секунд:");
//        Scanner scanner = new Scanner(System.in);
//        double seconds = scanner.nextDouble();
//        double minutes = seconds/60;
//        System.out.printf("С начала суток прошло: %.0f минут%n", minutes);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Введите T1, T2, T3:");
//        Scanner scanner = new Scanner(System.in);
//        double T1 = scanner.nextDouble();
//        double T2 = scanner.nextDouble();
//        double T3 = scanner.nextDouble();
//        double R = (T1+T2+T3)/3;
//        if ((T1+T2+T3)%3==0){
//            System.out.printf("Для выполнения плана требуется: %.2f часов%n", R);
//        }else{
//            System.out.printf("Для выполнения плана требуется: %.2f часа%n", R);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Введите x1, x2, y1, y2:");
//        Scanner scanner = new Scanner(System.in);
//        double x1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//        double P = (Math.abs(x2 - x1) + Math.abs(y2 - y1)) * 2;
//        double S = Math.abs(x2 - x1) * Math.abs(y2 - y1);
//        System.out.printf("Периметр прямоугольника равен: %.2f см%n", P);
//        System.out.printf("Площадь прямоугольника равна: %.2f см квадратных", S);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        for (; ; ) {
//            System.out.println("Введите V, U, T1, T2:");
//            Scanner scanner = new Scanner(System.in);
//            double V = scanner.nextDouble();
//            double U = scanner.nextDouble();
//            double T1 = scanner.nextDouble();
//            double T2 = scanner.nextDouble();
//            if ((V > U) && (V >= 0) && (U >= 0) && (T1 >= 0) && (T2 >= 0)) {
//                double S1 = V * T1;
//                double S2 = (V - U) * T2;
//                System.out.printf("Путь по озеру равен: %.2f км%n", S1);
//                System.out.printf("Путь против течения равен: %.2f км", S2);
//                break;
//            } else {
//                System.out.println("Введены неверные данные. Попробуйте ещё: ");
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу 1 м нити (г):");
        double m = scanner.nextDouble();

        System.out.print("Введите плотность (нитей на 1 м): ");
        double p = scanner.nextDouble();

        System.out.print("Введите ширину ткани (м): ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину ткани (м): ");
        double b = scanner.nextDouble();

        // Расчет массы ткани
        double fabricMass = p * m * a * b;

        // Вывод результата
        System.out.printf("Масса ткани составляет: %.2f г%n", fabricMass);
    }
}