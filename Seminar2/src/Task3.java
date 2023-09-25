/**
 * 📌 Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает
 * boolean значение).
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(polydrome("10201") ? "Полиндром" : "Не полиндром");

    }

    static Boolean polydrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String strNew = sb.reverse().toString();
        return str.equals(strNew);
    }

//    public class task3 {
//
//        public static void main(String[] args) {
//            String str = "123454321";
//            boolean isPal = isPalindrome(str);
//            System.out.println(str);
//            System.out.println(isPal);
//
//        }
//
//        public static boolean isPalindrome(String str){
//            int len = str.length();
//            for (int i = 0; i < len/2; i++) {
//                if (str.charAt(i) != str.charAt(len - 1 - i))
//                    return false;
//
//            }
//
//            return true;
//        }
//    }

}
