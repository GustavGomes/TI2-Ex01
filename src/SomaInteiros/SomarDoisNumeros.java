package SomaInteiros;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SomarDoisNumeros {
	public static void main(String[] Args) throws IOException {
		int num1 = ReadInt();
		int num2 = ReadInt();
		PrintInt(num1 + num2);
	}
	
	static int ReadInt( ) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite um número inteiro:");
		int input = Integer.parseInt(reader.readLine());
		return input;
	}
	
	static void PrintInt(int num) {
		System.out.println(num);
	}
}
