

class slectionsort {
    
    public static void main (String[] args) {
        int[] array = {3, 1, 4, 2, 0, 5};
        int placeholder;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if (i == array[j]) {
                    placeholder = array[i];
                    array[i] = array[j];
                    array[j] = placeholder;
                }
            }   
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}