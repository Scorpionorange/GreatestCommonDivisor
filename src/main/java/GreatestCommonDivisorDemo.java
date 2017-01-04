/**
 * Created by ScorpionOrange on 2017/01/05.
 */
public class GreatestCommonDivisorDemo {
    public static void main(String[] args){
        System.out.println("The greatest common divisor of 1984 and 1987 is : "
                           + GreatestCommonDivisor(1984, 1987));
    }

    /**
     * 欧几里得算法：
     * 1、确保被除数不为零；
     * 2、两数相除求余数，去除大数，小数与余数相除，依次重复；
     * @param m 大数；
     * @param n 被除数；
     * @return 返回最后的余数，则为最大公约数；
     */
    public static long GreatestCommonDivisor(long m, long n){
        while (n != 0){
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}
