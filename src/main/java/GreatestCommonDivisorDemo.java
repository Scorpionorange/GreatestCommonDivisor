/**
 * Created by ScorpionOrange on 2017/01/05.
 */
public class GreatestCommonDivisorDemo {
    public static void main(String[] args){
        System.out.println("The greatest common divisor of 1984 and 1987 is : "
                           + GreatestCommonDivisor(1984, 1987));
    }

    public static long GreatestCommonDivisor(long m, long n){
        while (n != 0){
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}
