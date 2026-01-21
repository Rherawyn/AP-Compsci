public class insertionSort {
    
    public static void main(String[] args) {
         int[] array = {12,8,15,4,5,10,9};
         array = sort(array);
         
         for(int i = 0; i < array.length; i++) {
             System.out.print(array[i] + ", ");
            }
    }
    
    public static int[] sort(int[] input) {
        int temp = 0;
        for(int i = 1; i < input.length; i++) {
            for(int g = i-1; g > -1; g--) {
                temp = input[g+1];
                if(temp < input[g] && g >= 0) {
                    input[g+1] = input[g];
                    input[g] = temp;
                } else {
                    input[g+1] = temp;
                }
            }
        }
        return input;
    }
}