class chapter_7 {
    
    public static void main (String[] args) {
        int[] cheese = {6,12,8,17,11,2};
        System.out.println(indexOfMax(cheese));
        for(int i = 0; i < 121; i++) {
        System.out.println(sieve(121)[i]);
        }
    }
    
    public static int indexOfMax(int[] nums) {
        int dugus = nums[0];
        int bugus = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && dugus < nums[i]) {
                dugus = nums[i];
                bugus = i;
            }
        }
        return bugus;
    }
    
    public static boolean[] sieve(int n) {
        boolean[] done = new boolean [n];
        for(int i = 2; i < Math.sqrt(n); i++) {
            done[i] = true;
            
            for(int j = (int)Math.pow(i,2); j < n; j = (int)Math.pow(i,2)+j*i) {
                done[j] = false;
            }
        }
        return done;
    }
}