
public class fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metado1();
		System.out.println("Fim do main");
	}
	
	public static void metado1() {
		System.out.println("Inicio do metado1");
		metado2();
		System.out.println("Fim do metado1");
	}
	
	public static void metado2() {
		System.out.println("Inicio do metado2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do metado2");
	}
}
