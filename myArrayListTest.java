
/**
 * Write a description of class myArrayListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myArrayListTest
{
    public static void main (String args[])
    {
    myArrayList list = new myArrayList(20);
    
    for(int i = 0; i < 20; i++)
    {
        Fraction frac = new Fraction(i, i+1);
        list.add(i, frac);
        System.out.print(list.indexOf(frac));
        
        
        
    }
    list.remove(12);
    
    
    
    }

}
