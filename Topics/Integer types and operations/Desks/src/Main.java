import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int tables1;
        int tables2;
        int tables3;

        if(class1%2==0){
            tables1 = class1/2;
        } else {
            tables1 =(class1/2) +1;
        }

        if(class2%2==0){
            tables2 = class2/2;
        } else {
            tables2 =(class2/2) +1;
        }

        if(class3%2==0){
            tables3 = class3/2;
        } else {
            tables3 =(class3/2) +1;
        }



        int tables = tables1 + tables2 + tables3;
        System.out.println(tables);
    }
}