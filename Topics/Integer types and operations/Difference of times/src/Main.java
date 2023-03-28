import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt()*3600;
        int minutes1 = scanner.nextInt()*60;
        int seconds1 = scanner.nextInt();

        int hours2 = scanner.nextInt()*3600;
        int minutes2 = scanner.nextInt()*60;
        int seconds2 = scanner.nextInt();


        int timer1 = hours1+minutes1+seconds1;
        int timer2 = hours2+minutes2+seconds2;

        System.out.println(timer2-timer1);








    }
}