import java.util.ArrayList;

public class myArrayList {
	
	int size;
    ArrayList<Fraction> list;
    myArrayList(int size)
    {
        list = new ArrayList<Fraction>(size);
    }
    
    
    
    public int indexOf(Fraction input) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).compare(input) == 0) {
                return i;
            }
        }
        return -1;
    }
    public void add (int index, Fraction input)
    
    {
        Fraction next = list.get(index);
        Fraction oneAfter;
        Fraction last = list.get(size  -1);
        list .set(index, input);
        
        for(int i = index + 1; i < list.size(); i++)
        {
            oneAfter = list.get(i);
            list.set(i, next);
            next = oneAfter;
        }
        list.add(last); 
        size = list.size(); 
        
    
    
    }
	
 public static Fraction remove(int index) {
        if (index >= 0 && index < list.size()) {
            return list.remove(index);
    }
    }
 public class myListIterator {
		
	 /*
		 * Zachary Nadeau
		 * returns true if Next will not throw an exception
		 * @return returns a boolean value 
		 */
		public Boolean hasNext() {
			if(list.next != null) {
				return true; 
			}else {
				return false;
			}
		}
		/*
		 * Zachary Nadeau
		 * Returns true if previous will not throw an exception
		 * @return returns a booolean value
		 */
		public Boolean hasPrevious() {
			if(list.prev != null) {
				return true;
			}else {
				return false;
			}
		}
	}
 /*
	 * Samuel Fickett
	 * This method adds an array of Fraction objects to 
	 * the existing arraylist
	 * @param frc the input arraylist of Fraction objects
	 * @return true
	 */
	public static boolean addAll(Fraction[] frc) {
		int index = list.indexOf(list.get((next()));
		for (int i = 0; i < list.size(); ++i) {
			list.add(index ,frc[i]);
		}
		return true;
	}
 
	/*
	 * Samuel Fickett
	 * This method removes all Fraction objects after
	 * the return method from next() would be called
	 */
public static void removeAllNext() {
		int index = list.indexOf(list.get(next()));
		while(hasNext()) {
			list.remove(index);
			next();
		}
	}

}

