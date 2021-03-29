import java.util.Arrays;  
public class RemoveDuplicate{  
public static int removeDuplicateElements(int array[], int check){  
        if (check==0 || check==1){  
            return check;  
        }  
        int[] temp = new int[check];  
        int j = 0;  
        for (int i=0; i<check-1; i++){  
            if (array[i] != array[i+1]){  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[check-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            array[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int[] array = {1, 12, 7, 3, 6, 9, 7, 15, 1, 8, 4, 3, 9, 4, 5};//unsorted array  
        Arrays.sort(array);//sorting array  
        int length = array.length;  
        length = removeDuplicateElements(array, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(array[i]+" ");  
           
    }  
}  

