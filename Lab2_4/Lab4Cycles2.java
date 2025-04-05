package Lab2_4;

public class Lab4Cycles2 {
    public double [] SortingAndCleaning(double [] array){

        int newLenght = 0;
        for(double i :array){
            if(i != 0){
                newLenght++;
            }
        }
        double [] result = new double[newLenght];
        int n = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                result[n]=array[i];
                n++;
            }
            if(array[i]<0){
                result[n]=array[i]*-1;
                n++;
            }
        }
        return result;
    }

}
