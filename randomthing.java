package java_programs;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;
public class randomthing {
	public static void main(String[] args) {
		int num = 0;
		while (num <=60) {
			num++;
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println(num);
		}
		
	}
}
