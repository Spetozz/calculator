public class Main {
    public static String calc(String str) {
        //Инициализируем переменные
        int num1, num2, isRome1, isRome2, sum, dif, mul, div, calculation;
        calculation = 0;
        sum = 0;
        dif = 0;
        mul = 0;
        div = 0;
        //Разбиваем строку на части
        String[] words = str.split(" ");
        //Если строка не соответствует формату a + b, a - b, a * b, a / b, то программа выдаёт ошибку
        if (words.length !=3) {
            str = "throws Exception";
            return str;
        }
        //Переводим элементы массива в числа, при этом запоминаем римское ли данное число
        switch (words[0]) {
            case "1" -> {
                num1 = 1;
                isRome1 = 0;
            }
            case "2" -> {
                num1 = 2;
                isRome1 = 0;
            }
            case "3" -> {
                num1 = 3;
                isRome1 = 0;
            }
            case "4" -> {
                num1 = 4;
                isRome1 = 0;
            }
            case "5" -> {
                num1 = 5;
                isRome1 = 0;
            }
            case "6" -> {
                num1 = 6;
                isRome1 = 0;
            }
            case "7" -> {
                num1 = 7;
                isRome1 = 0;
            }
            case "8" -> {
                num1 = 8;
                isRome1 = 0;
            }
            case "9" -> {
                num1 = 9;
                isRome1 = 0;
            }
            case "10" -> {
                num1 = 10;
                isRome1 = 0;
            }
            case "I" -> {
                num1 = 1;
                isRome1 = 1;
            }
            case "II" -> {
                num1 = 2;
                isRome1 = 1;
            }
            case "III" -> {
                num1 = 3;
                isRome1 = 1;
            }
            case "IV" -> {
                num1 = 4;
                isRome1 = 1;
            }
            case "V" -> {
                num1 = 5;
                isRome1 = 1;
            }
            case "VI" -> {
                num1 = 6;
                isRome1 = 1;
            }
            case "VII" -> {
                num1 = 7;
                isRome1 = 1;
            }
            case "VIII" -> {
                num1 = 8;
                isRome1 = 1;
            }
            case "IX" -> {
                num1 = 9;
                isRome1 = 1;
            }
            case "X" -> {
                num1 = 10;
                isRome1 = 1;
            }
            default -> {
                //Все остальные числа нам не подходят из условия
                str = "throws Exception";
                return str;
            }
        }
        switch (words[1]) {
            case "+" -> sum = 1;
            case "-" -> dif = 1;
            case "*" -> mul = 1;
            case "/" -> div = 1;
            default -> {
                //Все остальные знаки нам не подходят из условия
                str = "throws Exception";
                return str;
            }
        }
        switch (words[2]) {
            case "1" -> {
                num2 = 1;
                isRome2 = 0;
            }
            case "2" -> {
                num2 = 2;
                isRome2 = 0;
            }
            case "3" -> {
                num2 = 3;
                isRome2 = 0;
            }
            case "4" -> {
                num2 = 4;
                isRome2 = 0;
            }
            case "5" -> {
                num2 = 5;
                isRome2 = 0;
            }
            case "6" -> {
                num2 = 6;
                isRome2 = 0;
            }
            case "7" -> {
                num2 = 7;
                isRome2 = 0;
            }
            case "8" -> {
                num2 = 8;
                isRome2 = 0;
            }
            case "9" -> {
                num2 = 9;
                isRome2 = 0;
            }
            case "10" -> {
                num2 = 10;
                isRome2 = 0;
            }
            case "I" -> {
                num2 = 1;
                isRome2 = 1;
            }
            case "II" -> {
                num2 = 2;
                isRome2 = 1;
            }
            case "III" -> {
                num2 = 3;
                isRome2 = 1;
            }
            case "IV" -> {
                num2 = 4;
                isRome2 = 1;
            }
            case "V" -> {
                num2 = 5;
                isRome2 = 1;
            }
            case "VI" -> {
                num2 = 6;
                isRome2 = 1;
            }
            case "VII" -> {
                num2 = 7;
                isRome2 = 1;
            }
            case "VIII" -> {
                num2 = 8;
                isRome2 = 1;
            }
            case "IX" -> {
                num2 = 9;
                isRome2 = 1;
            }
            case "X" -> {
                num2 = 10;
                isRome2 = 1;
            }
            default -> {
                //Все остальные числа нам не подходят из условия
                str = "throws Exception";
                return str;
            }
        }
        //Выполняем арифметическую операцию
        if (sum == 1) {
            calculation = num1 + num2;
        } else if (dif == 1) {
            calculation = num1 - num2;
        } else if (mul == 1) {
            calculation = num1 * num2;
        } else if (div == 1) {
            calculation = num1 / num2;
        }
        //Если числа арабские, то переведём ответ в строку
        if (isRome1 == 0 && isRome2 == 0) {
            str = Integer.toString(calculation);
        }
        // Если числа римские и положительные, то приведём ответ к нужному виду
        else if (isRome1 == 1 && isRome2 == 1 && calculation > 0) {
            StringBuilder strBuilder = new StringBuilder();
            while (calculation > 0) {
                if (calculation - 100 >= 0) {
                    calculation -= 100;
                    strBuilder.append("C");
                }
                if (calculation - 90 >= 0) {
                    calculation -= 90;
                    strBuilder.append("XC");
                }
                if (calculation - 50 >= 0) {
                    calculation -= 50;
                    strBuilder.append("L");
                }
                if (calculation - 10 >= 0) {
                    calculation -= 10;
                    strBuilder.append("X");
                } else {
                    switch (calculation) {
                        case 9 -> {
                            calculation -= 9;
                            strBuilder.append("IX");
                        }
                        case 8 -> {
                            calculation -= 9;
                            strBuilder.append("VIII");
                        }
                        case 7 -> {
                            calculation -= 9;
                            strBuilder.append("VII");
                        }
                        case 6 -> {
                            calculation -= 9;
                            strBuilder.append("VI");
                        }
                        case 5 -> {
                            calculation -= 9;
                            strBuilder.append("V");
                        }
                        case 4 -> {
                            calculation -= 9;
                            strBuilder.append("IV");
                        }
                        case 3 -> {
                            calculation -= 9;
                            strBuilder.append("III");
                        }
                        case 2 -> {
                            calculation -= 9;
                            strBuilder.append("II");
                        }
                        case 1 -> {
                            calculation -= 9;
                            strBuilder.append("I");
                        }
                    }
                }
            }
            str = strBuilder.toString();
        }
        //Если одно число римское, а другое арабское, то выведется ошибка
        else {
            str = "throws Exception";
            return str;
        }
        //Вернём ответ
        return str;
    }
    public static void main(String[] args) {
        System.out.println(calc("a + b"));
    }
}
