public class trans {
    public static void main(String[] args) {
        int check = -1;
        java.util.Scanner select = new  java.util.Scanner(System.in);


        double fah;
        double cel;

        while (check != 0){
        System.out.println(" 1. Fahrenheit to Celsius");
        System.out.println(" 2. Celsius to Fahrenheit");
        System.out.println(" 0. Exit ");
        check = select.nextInt();



            switch (check){
                case 1:
                    System.out.println("Moi ban nhap nhiet do theo Cel");
                    java.util.Scanner input = new java.util.Scanner(System.in);
                    fah = input.nextDouble();
                    cel =(5.0 / 9) * (fah - 32);
                    System.out.println("Result: " + cel );
                    break;
                case 2:
                    System.out.println("Moi ban nhap nhiet do theo Fah");
                    java.util.Scanner input2 = new java.util.Scanner(System.in);
                    cel = input2.nextDouble();
                    fah =  (9.0 / 5) * cel + 32;
                    System.out.println("Result: " + fah );
                    break;
                case 0:
                    System.exit(0);



            }
        }
    }
}
