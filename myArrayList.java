import java.util.ArrayList;
public class myArrayList {
	
	ArrayList<Fraction> list = new ArrayList<Fraction>(50);
	
	public static int indexOf(Fraction input) {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).compare(input) == 0) {
				return i;
			}
		}
		return -1;
	}
	public static void add(int index, Fraction input) {
		
	}

	public static Fraction remove(int index) {
		
		return new Fraction(0,0);
	}
}
