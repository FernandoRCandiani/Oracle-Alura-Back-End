import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");
		
		// Lambda	
	//	palavras.sort((s1, s2) ->Integer.compare(s1.length(), s2.length()));
	//	palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);
		
		// Lambda
	//	palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
	}
}


