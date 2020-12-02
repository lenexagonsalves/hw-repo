import java.util.ArrayList;
public class Utils 
{
  public static <T extends Comparable<T>> Pair<T> getMinMax(ArrayList<T> inputtedList) 
  {
    //set the max and min as unknown null vlaues
    T maximumElement = null; 
    T minimumElement = null; 
    //iterate through the inputted arraylist
    for (T element : inputtedList) 
    {
       // if either the min or max is unknown, set the current or first element as either. 
       if (minimumElement == null && maximumElement == null) 
       {
           maximumElement= element;
           minimumElement = element; 
        } 
        //when we pass the first element, and both min and max are set, we compare each number to the max or min and replace
        else 
         {
           //compare each element, if it is greater than the current max, set that element to max 
           if (element.compareTo(maximumElement) > 0) 
           {
              maximumElement = element;
            }  
            //compare each element to the current min, if it is less, than it is 
           if (element.compareTo(minimumElement) < 0) 
           {
              minimumElement = element;
           }
                                
         }
       }
                
    return new Pair<T>(minimumElement, maximumElement);
        }
}
