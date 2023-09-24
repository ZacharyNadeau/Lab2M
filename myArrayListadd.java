import java.util.ArrayList;

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
