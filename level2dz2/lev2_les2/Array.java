package lev2_les2;
/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче
массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой
 именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения
 MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */
public class Array {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] number = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","1","3","4"},
                {"1","2","3","4"},
        };
        checkSize(number);
        System.out.println(calc(number));}

        static int calc (String[][] number){
            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number[i].length; j++) {
                    try {
                        sum += Integer.parseInt(number[i][j]);
                    }catch (NumberFormatException e){
                        throw  new MyArrayDataException(String.format("value is not a digit: %s",number[i][j]), e);}}}
            return sum;}
        static void checkSize(String[][] value) throws MyArraySizeException {
            if(value.length != 4){
                throw  new MyArraySizeException(String.format("Array size %s insted 4",value.length));
            }
            for (int i = 0; i < value.length; i++) {
               if(value[i].length != 4){
                   throw new MyArraySizeException(String.format("Array size %s insted 4", i,value.length));
               }
            }
        }

    }

