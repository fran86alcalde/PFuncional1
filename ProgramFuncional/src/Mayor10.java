import java.util.List;

public class Mayor10 {

	public static void main(String[] args) {


		List<Integer> numbers=List.of(18,6,4,12,55,78,12);

		Long Mayor10 = numbers.stream().filter(a->a>10).count();
		
		System.out.println(Mayor10);

	}

}
