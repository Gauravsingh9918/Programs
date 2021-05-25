import java.util.stream.Stream;

public class Run {

	public static void main(String[] args) {
		
		String[] items= {"car","bike","toothpaste","toy","telescope","teeth","pen","gun","powderr","pencil"};
		Stream.of(items)
		.filter((x)->x.startsWith("t")) // intermediate operation
		.sorted() // intermediate operation
		.forEach(n->System.out.println(n+",")); //Terminal operation
		System.out.println();
	}

}
