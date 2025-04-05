package Lab2_4;
public class Lab4Cycles {

     public double [] GetElementToCalculate(double[] elements)
     { 
    int [] elementsNumber = getMaxMinElementInfo(elements);
    double [] newArray = mixElement(elements,elementsNumber);
    return newArray;
     }

     private int [] getMaxMinElementInfo(double[] elements)
     {
        int elementsNumberMin = 0, elementsNumberMax = 0;
        double maxElement=elements[0];
        double minElement=elements[0];
    
        for(int i=1;i< elements.length;i++ ){
          if(elements[i]>maxElement){
            maxElement=elements[i];
            elementsNumberMax=i;
          }
          if(elements[i]<minElement){
             minElement=elements[i];
             elementsNumberMin=i;
           }
        }
        int [] elementsNumberResult={elementsNumberMax,elementsNumberMin};
        return elementsNumberResult;
      }

    private double [] mixElement(double [] elements ,int [] elementsNumber)
    {
      double max = elements[elementsNumber[0]];
      double min = elements[elementsNumber[1]];
      System.out.println( "Max :"+max +": Min :"+ min);
      elements[elementsNumber[1]]= max;
      elements[elementsNumber[0]]=min;
      return elements;
    }
}
