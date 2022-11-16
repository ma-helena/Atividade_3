import java.util.Scanner;

public class Q1_Voto_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Integer idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Sem direito a votar");
            
        } else if (idade >= 18 && idade <=70){
            System.out.println("Voto obrigatório");
        } else{
            System.out.println("Voto facultativo");
        }
    }
}
