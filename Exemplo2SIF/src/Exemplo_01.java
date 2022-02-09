import java.util.Scanner;

public class Exemplo_01 {

	public static void main(String[] args) {
		

		int[] v = new int[5]; // variavel local ao metodo main
		lerDados(v); // argumento --> variavel que sera enviada para o metodo
		
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
		
		
	}
	
	public static int maiorValor(int[] v) {
	 int aux = v[0];
	 for(int i=0; i<v.length; i++) {
		 if(v[i] > aux) {
			 aux = v[i];
		 }
	 }
	 return aux;
	}
	
	public static int menorValor(int[] v) {
		 int aux = v[0];
		 for(int i=0; i<v.length; i++) {
			 if(v[i] < aux) {
				 aux = v[i];
			 }
		 }
		 return aux;
		}
	
	
	
	public static void lerDados(int[] v) { // parametro --> variavel que recebe valor
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < v.length; i++) {
			System.out.print("Valor: ");
			v[i] = teclado.nextInt();
		}
		
		teclado.close();
	}
	
	

}


