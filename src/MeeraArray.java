public class MeeraArray {static int isFill(int[] a) {
    boolean zero= false, prime = false;
    for(int i=0; i<a.length; i++) {
        if (a[i] == 0)
            zero = true;
        if(isPrime(a[i]) && a[i]>1)
            prime = true;
    }
    if(prime && zero)
        return 1;
    if(!prime && !zero)
        return 1;
    return 0;
}
    /*for(int j=2; j<a.length; j++)
        if(isPrime(a[j]) && zero   && a[j]!=1)
            return 1;
    return 0;*/

    static boolean isPrime(int n){
        for(int i=2; i<n; i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("the return is"+isFill(new int[] {7,6,0,10,1} ));
    }
}


