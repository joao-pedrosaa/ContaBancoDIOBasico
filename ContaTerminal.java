import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua agencia");
		String agencia = sc.next();
		
		System.out.println("Digite o numero da sua conta");
		int numero = sc.nextInt();
		
		System.out.println("Digite seu nome");
		String nome = sc.next();
		
		System.out.println("Digite seu saldo");
		double saldo = sc.nextDouble();
		
		System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia
				+ ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
	}
}
