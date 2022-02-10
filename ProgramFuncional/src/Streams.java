import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		 class Libro {
			 
		    private String titulo;
		    private int paginas;
		     
		     
		    public Libro(String titulo, int paginas) {
		        super();
		        this.titulo = titulo;
		        this.paginas = paginas;
		    }
		    public String getTitulo() {
		        return titulo;
		    }
		    public void setTitulo(String titulo) {
		        this.titulo = titulo;
		    }
		    public int getPaginas() {
		        return paginas;
		    }
		    public void setPaginas(int paginas) {
		        this.paginas = paginas;
		    }
		}
		
		Libro l1= new Libro ("Biblia",800);
		Libro l2= new Libro ("Quijote",500);
		
		
		
		Optional<Integer> st;
		String resultado = st.map((l) -> l.getTitulo()).collect(Collectors.joining(","));
		
		Optional<Integer> lista = st.map((l) -> l.getPaginas()).collect(Collectors.reducing(Integer::sum));	 
		 
		List <Libro> lista2 = Arrays.asList(l1, l2);
				 
		 Collection<Libro>   lista;
		  lista.stream()
         .filter(libro -> libro.getPaginas() > 1000)
         .map(libro -> libro.getTitulo())
         .forEach(System.out::println);
		 
		 
	}

}
