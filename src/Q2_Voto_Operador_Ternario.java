import java.util.Scanner;

public class Q2_Voto_Operador_Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Integer idade = sc.nextInt();
        String podeVotar = (idade < 16)? "Sem direito a votar" : (idade >= 18 && idade <=70)? "Voto obrigatório": "Voto facultativo";
        System.out.println(podeVotar);
    }
}
