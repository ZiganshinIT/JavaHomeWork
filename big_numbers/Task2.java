package big_numbers;

public class Task2 {
    public static void main(String[] args) {
        BigNum bigNum1 = new BigNum(1,2,3,4,5,6);
        BigNum bigNum2 = new BigNum(1,2,3,4,5,6);
        BigNum bigNum3 = bigNum1.multiply(bigNum2);
        System.out.println(bigNum3.getBigNumber());
    }
}
