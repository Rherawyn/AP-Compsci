class chapter_7 {
    
    public static void main (String[] args) {
        int[] cheese = {6,12,8,17,11,2};
        System.out.println(indexOfMax(cheese));
        System.out.println(areFactors(5, cheese));
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
        boolean[] sieve = new boolean[n];
        for (int i = 0; i < n; i++) {
            sieve[i] = true;
        }
        sieve[0] = sieve[1] = false;

        int i = 0;
        while (i < n) {
            while (sieve[i] == false) {
                i++;
            }
            int cPrime = i;
            while (i < n) {
                i = i + cPrime;                                        
                if (i < n) 
                sieve[i] = false;  
                }
            i = cPrime+1;
        }
        return sieve;
    }
    
    public static boolean areFactors(int n, int[] f) {
        for(int i = 0; i < f.length; i++) {
            if(f[i]%n != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean arePrimeFactors(int n, int[] f) {
        boolean[] primes = sieve(n);      
        int product = 1;
        for (int i = 0; i < primes.length; i++) {
            if (!primes[i]) return false;  
            product *= i;              
        }
        return product == n;  
    }
    
    public static int[] letterHist (String text) {
        int[] counts = new int[26];   
        text = text.toLowerCase();    
        
        for (int i = 0; i < text.length(); i++) { 
            char letter = text.charAt(i);   
            int index = letter - 'a';       
            counts[index]++;    
        }
        return counts;   
    }
    
    public static boolean isAnagram (String a, String b) {
        int[] aHist = letterHist(a.toLowerCase());    
        int[] bHist = letterHist(b.toLowerCase());    
        for (int i = 0; i < aHist.length; i++) {
            if (aHist[i] != bHist[i]) return false;
        }
        return true;                                  
    }
    
}