public class AddNumbers {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = num1 + num2;
        System.out.println("Sum (as strings) = "+args[0]+args[1]);          // 2323
        System.out.println("Sum (as numbers) = "+num1+num2);                // 2323     why this didnot work ???????
        System.out.println("Sum (as numbers) = "+num3);                     // 56
    }
}