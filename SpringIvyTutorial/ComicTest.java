import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComicTest {
	
	public static void main (String[]args) throws Exception{
		
		System.out.println("tess");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Borrow borrow =  (Borrow) context.getBean("borrowBean");
		Comic comic = (Comic) borrow.getComic();
		System.out.println(comic.getTitle());
		
	}

}
