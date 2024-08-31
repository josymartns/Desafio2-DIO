//TODO: conhecer e importar a classe scanner

//TODO: exibir as mensagens para o nosso usuário

//TODO: obter pela scanner os valores digitados no terminal

//TODO: exibir a mensagem conta criada

package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//atributos
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o número da Agencia !");
		agencia = sc.next();
		
		System.out.println("Agora, digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.println("Digite seu nome: ");
		nomeCliente = sc.next();
		
		System.out.println("Digite o valor do seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println(" ");
		System.out.println("--------------------------------------");
		System.out.println("PROCESSANDO DADOS");
		System.out.println("--------------------------------------");
		System.out.println(" ");
		
		System.out.printf("Olá %s, obrigada por criar uma conta em nosso banco, "
				+ "sua agência é %s, conta %d e seu saldo R$ %.2f "
				+ "já está disponível para saque. ", nomeCliente, agencia, numero, saldo);
				
		sc.close();
	}

}
