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

}
