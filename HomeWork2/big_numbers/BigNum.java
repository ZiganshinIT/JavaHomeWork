package big_numbers;

public class BigNum {
    private StringBuilder bigNumber = new StringBuilder();

    public BigNum(int... numbers) {
        for (int index = 0; index < numbers.length; index++) {
            bigNumber.append(numbers[index]);
        }
    }

    public BigNum(StringBuilder number) {
        bigNumber = number;
    }


    // Сумма двух объектов big_numbers.BigNum
    // -> Возвращает тип big_numbers.BigNum
    public BigNum addition(BigNum another) {
        int[] currentBigNum = bigNumToArray();
        int[] anotherBigNum = another.bigNumToArray();
        int remains = 0; // остаток
        StringBuilder totalResult = new StringBuilder();
        for (int index = 0; index < Math.min(currentBigNum.length, anotherBigNum.length); index++) {
            int result = currentBigNum[index] + anotherBigNum[index] + remains;
            if (result >= 10) {
                totalResult.append(result % 10);
                remains = result / 10;
            } else {
                totalResult.append(result);
                remains = 0;
            }
        }
        if (currentBigNum.length >= anotherBigNum.length) {
            for (int index = anotherBigNum.length; index < currentBigNum.length; index++) {
                totalResult.append(currentBigNum[index]);
            }
        } else {
            for (int index = currentBigNum.length; index < anotherBigNum.length; index++) {
                totalResult.append(anotherBigNum[index]);
            }
        }
        return new BigNum(totalResult.reverse());
    }

    public BigNum addition(int number) {
        int[] currentBigNum = bigNumToArray();
        int[] anotherNum = numToArray(number);
        int remains = 0; // остаток
        StringBuilder totalResult = new StringBuilder();
        for (int index = 0; index < Math.min(currentBigNum.length, anotherNum.length); index++) {
            int result = currentBigNum[index] + anotherNum[index] + remains;
            if (result >= 10) {
                totalResult.append(result % 10);
                remains = result / 10;
            } else {
                totalResult.append(result);
                remains = 0;
            }
        }

        if (currentBigNum.length >= anotherNum.length) {
            for (int index = anotherNum.length; index < currentBigNum.length; index++) {
                totalResult.append(currentBigNum[index]);
            }
        } else {
            for (int index = currentBigNum.length; index < anotherNum.length; index++) {
                totalResult.append(anotherNum[index]);
            }
        }
        return new BigNum(totalResult.reverse());
    }

    public BigNum multiply(BigNum another) {
        int[] currentBigNum = bigNumToArray(); // 11
        int[] anotherBigNum = another.bigNumToArray(); // 11
        int remains = 0; // остаток
        BigNum totalResult = new BigNum(0);
        for (int index = 0; index < Math.max(currentBigNum.length, anotherBigNum.length); index++) {
            StringBuilder totalResultStr = new StringBuilder();
            for (int index2 = 0; index2 < Math.min(currentBigNum.length, anotherBigNum.length); index2++) {
                int result = currentBigNum[index] * anotherBigNum[index2] + remains; // 1
                if (result >= 10) {
                    totalResultStr.append(result % 10);
                    remains = result / 10;
                } else {
                    totalResultStr.append(result);
                    remains = 0;
                }
            }
            for (int index3 = 0; index3 < index; index3++) {
                totalResultStr.insert(0, "0");
            }
            BigNum result = new BigNum(totalResultStr.reverse());
            totalResult = totalResult.addition(result);
        }
        return totalResult;
    }

    public BigNum multiply(int number) {
        int[] currentBigNum = bigNumToArray(); // 11
        int[] anotherNum = numToArray(number); // 11
        int remains = 0; // остаток
        BigNum totalResult = new BigNum(0);
        for (int index = 0; index < Math.max(currentBigNum.length, anotherNum.length); index++) {
            StringBuilder totalResultStr = new StringBuilder();
            for (int index2 = 0; index2 < Math.min(currentBigNum.length, anotherNum.length); index2++) {
                int result = currentBigNum[index] * anotherNum[index2] + remains; // 1
                if (result >= 10) {
                    totalResultStr.append(result % 10);
                    remains = result / 10;
                } else {
                    totalResultStr.append(result);
                    remains = 0;
                }
            }
            for (int index3 = 0; index3 < index; index3++) {
                totalResultStr.insert(0, "0");
            }
            totalResult = totalResult.addition(new BigNum(totalResultStr.reverse()));
        }
        return totalResult;
    }

    // Предсавление числа в виде массива чисел
    // 12345 -> [5, 4, 3, 2, 1]
    private int[] bigNumToArray() {
        String[] bigNumberStringArray = bigNumber.reverse().toString().split("");
        int[] bigNumberIntArray = new int[bigNumberStringArray.length];
        for (int index = 0; index < bigNumberIntArray.length; index++) {
            bigNumberIntArray[index] = Integer.parseInt(bigNumberStringArray[index]);
        }
        return bigNumberIntArray;
    }

    // Преобразует число в перевернутый массив
    // 1000 -> 0001
    public int[] numToArray(int number) {
        if (number < 10) {
            int[] numIntArray = {number};
            return numIntArray;
        } else {
            String[] numStrArray = Integer.toString(number).split("");
            int[] numIntArray = new int[numStrArray.length];
            for (int index = numStrArray.length - 1, index2 = 0; index >= 0; index--) {
                numIntArray[index2] = Integer.parseInt(numStrArray[index]);
                index2++;
            }
            return numIntArray;
        }
    }

    public StringBuilder getBigNumber() {
        return bigNumber;
    }

}
