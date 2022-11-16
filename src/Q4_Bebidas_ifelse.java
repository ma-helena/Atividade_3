import java.util.Scanner;

public class Q4_Bebidas_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println(" 1 - Coca-Cola - R$ 5\n 2 - Coca-Cola 0 - R$ 4.50\n 3 - Pepsi - R$ 4,40\n 4 - Guaraná Antarctica - R$ 3,50\n 5 - Fanta Laranja - R$ 4,23\n 6 - Água - R$ 2,50");
        System.out.println("Escolha uma bebida do menu: ");
        Integer bebida = sc.nextInt();

        if (bebida == 1) {
            System.out.println("A bebida escolhida foi: Coca-Cola - R$ 5");
        }else if (bebida == 2) {
            System.out.println(" A bebida escolhida foi: Coca-Cola 0 - R$ 4.50");
        }else if(bebida== 3) {
            System.out.println("A bebida escolhida foi: 3 - Pepsi - R$ 4,40");
        } else if (bebida == 4) {
            System.out.println("A bebida escolhida foi: 4 - Guaraná Antarctica - R$ 3,50");
        } else if (bebida == 5) {
            System.out.println("A bebida escolhida foi: 5 - Fanta Laranja - R$ 4,23");
        } else if (bebida == 6 ) {
            System.out.println("A bebida escolhida foi: 6 - Água - R$ 2,50");
        }else{
            System.out.println("Escolha uma das bebidas do menu");
        }
    }
}