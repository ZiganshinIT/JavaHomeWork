package big_numbers;

public class Task1 {
    public static void main(String... args) {
          StringBuilder arguments = new StringBuilder();
          for (String arg : args) {
              arguments.append(arg);
          }
        System.out.println(arguments);
        BigNum bigNum = new BigNum(arguments);
        System.out.println(bigNum.getBigNumber().reverse());
    }
}
