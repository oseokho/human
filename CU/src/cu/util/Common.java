package cu.util;
import java.util.Scanner;
import cu.exception.*;
public class Common {
	static Scanner scanner = new Scanner(System.in);
	
	public static int nextInt(String text) {
		return Integer.parseInt(nextLine(text));
	}
	public static int nextInt(String text, int from, int to) throws RangeException {
		int val = Integer.parseInt(nextLine(text));
		if(val < from || val > to) throw new RangeException(from, to);
		return val;
	}

	public static String nextLine(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}
	
}
