package SomaInteiros;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SomarDoisNumeros {
	public static void main(String[] Args) throws NumberFormatException, IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o primeiro número:");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.println("Digite o segundo número:");
		int num2 = Integer.parseInt(reader.readLine());
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}



