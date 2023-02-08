package big_numbers;

public class Task3 {
    public static void main(String[] args) {
        BigNum bigNum1 = new BigNum(1,2,3,4,5,6,7,8,9,10,11,12);
        BigNum bigNum2 = bigNum1.multiply(2);
        System.out.println(bigNum2.getBigNumber());
    }
}
