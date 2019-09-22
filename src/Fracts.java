//Common Denominators Exercise
public class Fracts {

    public static String convertFrac(long[][] lst) {
        for(int i = 0; i < lst.length; i++) {
            lst[i] = reduction(lst[i][0],lst[i][1]);
        }

        for(int i = 0; i < lst.length - 1; i++) {
            long denom1 = lst[i][1];
            long denom2 = lst[i+1][1];
            long gcd = euclidean(denom1,denom2);
            long lcm = denom1 * denom2 / gcd;

            int j = denom1 != lcm ? 0 : i + 1;
            while(j <= i + 1) {
                long multiplier = lcm / lst[j][1];
                lst[j] = new long[]{multiplier * lst[j][0], lcm};
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lst.length; i++) {
            sb.append("("+lst[i][0]+","+lst[i][1]+")");
        }

        return sb.toString();
    }

    public static long[] reduction(long a, long b) {
        long factor = euclidean(a, b);
        return new long[]{a / factor, b / factor};
    }

    public static long euclidean(long a, long b) {
        return a % b != 0 ? euclidean(b, a%b) : b;
    }

    public static void main(String[] args) {
        long[][] lst;
        lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
        Fracts.convertFrac(lst);
    }
}
