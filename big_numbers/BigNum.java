package big_numbers;

public class BigNum {
    private String bigNumber = "";

    BigNum(int... numbers) {
        for (int index = 0; index < numbers.length; index++) {
            bigNumber += numbers[index];
        }
    }

    BigNum(String number) {
        bigNumber = number;
    }


    // Сумма двух объектов big_numbers.BigNum
    // -> Возвращает тип big_numbers.BigNum
    public BigNum addition(BigNum another) {
        int[] currentBigNum = bigNumToArray();
        int[] anotherBigNum = another.bigNumToArray();
        int remains = 0; // остаток
        String totalResult = "";
        for (int index = 0; index < getMinArrayLength(currentBigNum, anotherBigNum); index++) {
            int result = currentBigNum[index] + anotherBigNum[index] + remains;
            if (result >= 10) {
                totalResult += result % 10;
                remains = result / 10;
            } else {
                totalResult += result;
                remains = 0;
            }
        }
        if (currentBigNum.length > anotherBigNum.length) {
            for (int index = anotherBigNum.length; index < currentBigNum.length; index++) {
                totalResult += currentBigNum[index];
            }
        }
        if (currentBigNum.length < anotherBigNum.length) {
            for (int index = currentBigNum.length; index < anotherBigNum.length; index++) {
                totalResult += anotherBigNum[index];
            }
        }
        return new BigNum(getReversedBigNum(totalResult));
    }

    public BigNum addition(int number) {
        int[] currentBigNum = bigNumToArray();
        int[] anotherNum = numToArray(number);
        int remains = 0; // остаток
        String totalResult = "";
        for (int index = 0; index < getMinArrayLength(currentBigNum, anotherNum); index++) {
            int result = currentBigNum[index] + anotherNum[index] + remains;
            if (result >= 10) {
                totalResult += result % 10;
                remains = result / 10;
            } else {
                totalResult += result;
                remains = 0;
            }
        }

        if (currentBigNum.length > anotherNum.length) {
            for (int index = anotherNum.length; index < currentBigNum.length; index++) {
                totalResult += currentBigNum[index];
            }
        }
        if (currentBigNum.length < anotherNum.length) {
            for (int index = currentBigNum.length; index < anotherNum.length; index++) {
                totalResult += anotherNum[index];
            }
        }
        return new BigNum(getReversedBigNum(totalResult));
    }

    public BigNum multiply(BigNum another) {
        int[] currentBigNum = bigNumToArray(); // 11
        int[] anotherBigNum = another.bigNumToArray(); // 11
        int remains = 0; // остаток
        BigNum totalResult = new BigNum(0);
        if (currentBigNum.length >= anotherBigNum.length) {
            for (int index = 0; index < currentBigNum.length; index++) {
                String totalResultStr = "";
                for(int index2 = 0; index2 < anotherBigNum.length; index2++) {
                    int result = currentBigNum[index] * anotherBigNum[index2] + remains; // 1
                    if (result >= 10) {
                        totalResultStr += result % 10;
                        remains = result / 10;
                    } else {
                        totalResultStr += result;
                        remains = 0;
                    }
                }
                for (int index3 = 0; index3 < index; index3++) {
                    totalResultStr = "0" + totalResultStr;
                }
                totalResult = totalResult.addition(new BigNum(getReversedBigNum(totalResultStr)));
            }

        } else if (currentBigNum.length < anotherBigNum.length) {
            for (int index = 0; index < anotherBigNum.length; index++) {
                String totalResultStr = "";
                for(int index2 = 0; index2 < currentBigNum.length; index2++) {
                    int result = anotherBigNum[index] * currentBigNum[index2] + remains; // 1
                    if (result >= 10) {
                        totalResultStr += result % 10;
                        remains = result / 10;
                    } else {
                        totalResultStr += result;
                        remains = 0;
                    }
                }
                for (int index3 = 0; index3 < index; index3++) {
                    totalResultStr = "0" + totalResultStr;
                }
                totalResult = totalResult.addition(new BigNum(getReversedBigNum(totalResultStr)));
            }
        }
        return totalResult;
    }

    public BigNum multiply(int number) {
        int[] currentBigNum = bigNumToArray(); // 11
        int[] anotherNum = numToArray(number); // 11
        int remains = 0; // остаток
        BigNum totalResult = new BigNum(0);
        if (currentBigNum.length >= anotherNum.length) {
            for (int index = 0; index < currentBigNum.length; index++) {
                String totalResultStr = "";
                for(int index2 = 0; index2 < anotherNum.length; index2++) {
                    int result = currentBigNum[index] * anotherNum[index2] + remains; // 1
                    if (result >= 10) {
                        totalResultStr += result % 10;
                        remains = result / 10;
                    } else {
                        totalResultStr += result;
                        remains = 0;
                    }
                }
                for (int index3 = 0; index3 < index; index3++) {
                    totalResultStr = "0" + totalResultStr;
                }
                totalResult = totalResult.addition(new BigNum(getReversedBigNum(totalResultStr)));
            }

        } else if (currentBigNum.length < anotherNum.length) {
            for (int index = 0; index < anotherNum.length; index++) {
                String totalResultStr = "";
                for(int index2 = 0; index2 < currentBigNum.length; index2++) {
                    int result = anotherNum[index] * currentBigNum[index2] + remains; // 1
                    if (result >= 10) {
                        totalResultStr += result % 10;
                        remains = result / 10;
                    } else {
                        totalResultStr += result;
                        remains = 0;
                    }
                }
                for (int index3 = 0; index3 < index; index3++) {
                    totalResultStr = "0" + totalResultStr;
                }
                totalResult = totalResult.addition(new BigNum(getReversedBigNum(totalResultStr)));
            }
        }
        return totalResult;
    }


    // Предстваление числа в обратном порядке для произведения операций
    // 12345 -> 54321
    public String getReversedBigNum() {
        String reversedBigNum = "";
        String[] reversedBigNumArray = bigNumber.split("");
        for (int index = reversedBigNumArray.length - 1; index >= 0; index--) {
            reversedBigNum += reversedBigNumArray[index];
        }
        return reversedBigNum;
    }

    // Инвертирование передаваемой строки в обратном порядке
    public String getReversedBigNum(String number) {
        String reversedBigNum = "";
        String[] reversedBigNumArray = number.split("");
        for (int index = reversedBigNumArray.length - 1; index >= 0; index--) {
            reversedBigNum += reversedBigNumArray[index];
        }
        return reversedBigNum;
    }


    // Предсавление числа в виде массива чисел
    // 12345 -> [5, 4, 3, 2, 1]
    private int[] bigNumToArray() {
        String[] bigNumberStringArray = getReversedBigNum().split("");
        int[] bigNumberIntArray = new int[bigNumberStringArray.length];
        for (int index = 0; index < bigNumberIntArray.length; index++) {
            bigNumberIntArray[index] = Integer.parseInt(bigNumberStringArray[index]);
        }
        return bigNumberIntArray;
    }


    // Возращает самую минимальную длину из двух массивов
    private int getMinArrayLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array2.length;
        } else if (array1.length < array2.length) {
            return array1.length;
        } else {
            return array1.length;
        }
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

    public String getBigNumber() {
        return bigNumber;
    }

}
