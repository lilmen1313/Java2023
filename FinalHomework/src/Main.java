import java.util.*;

/**
 *Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 * фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
 * хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить
 * параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Aser", "AMD", 8, 2400,
                "GTX 1660 Ti", 6, 8, 512, 15.6);
        Laptop laptop2 = new Laptop("Samsung", "Intel", 16, 3000,
                "RTX 4050", 6, 16, 256, 17.0);
        Laptop laptop3 = new Laptop("HP", "Intel", 4, 3200,
                "RTX 2080", 8, 32, 1024, 17.3);

        Set<Laptop> setLaptop = new HashSet<>(); //уникальные значения без ключа (множество ноутбуков в магазине)
        setLaptop.add(laptop1);
        setLaptop.add(laptop2);
        setLaptop.add(laptop3);

        Map<String, Object> filters = getCriteria(); // метод для запроса критериев от пользователя

        Set<Laptop> newLaptop = filterLaptops(setLaptop, filters);
        System.out.println(newLaptop);
    }

    static public Map<String, Object> getCriteria(){

        Map<Integer, String> contsMap = getInfoCriteria();
        for (Map.Entry<Integer, String> entry: contsMap.entrySet()){
            System.out.println(entry);
        }

        Map<String, Object> result = new HashMap<>(); //коллекция с критериями от пользователя
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print(System.lineSeparator() + "Введите номер критерия: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) break;

            switch (number){
                case 1:
                case 2:
                case 5:
                    System.out.print("Введите значение критерия: ");
                    Object value = scanner.nextLine();
                    result.put(contsMap.get(number), value);
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                    System.out.print("Введите значение критерия: ");
                    value = Integer.parseInt(scanner.nextLine());
                    result.put(contsMap.get(number), value);
                    break;
                case 9:
                    System.out.print("Введите значение критерия: ");
                    value = Double.parseDouble(scanner.nextLine());
                    result.put(contsMap.get(number), value);
                    break;
            }
        }

        scanner.close();
        return result;
    }

    private static Map<Integer, String> getInfoCriteria() {
        Map<Integer, String> contsMap = new HashMap<>();
        contsMap.put(0, "Выход");
        contsMap.put(1, "Название производителя ноутбука");
        contsMap.put(2, "Производитель чипа ЦП");
        contsMap.put(3, "Количество ядер ЦП");
        contsMap.put(4, "Тактовая частота ЦП");
        contsMap.put(5, "Название видеокарты");
        contsMap.put(6, "Объем видеопамяти");
        contsMap.put(7, "Объем оперативной памяти");
        contsMap.put(8, "Объем жесткого диска");
        contsMap.put(9, "Диагональ экрана");
        return contsMap;
    }

    public static Set<Laptop> filterLaptops(Set<Laptop> setLap, Map<String, Object> filter){ //вход-множество ноутбуков, критерии фильтрации

        Set<Laptop> result = new HashSet<>(); // результат поиска по множеству(будем заполнять, если удовл критериям поиска)

        for (Laptop lap: setLap) {                                                              //перебор по коллекции ноутбуков

            boolean flag = true;

            for (Map.Entry<String, Object> entry: filter.entrySet()){                           //перебор критериев фильтрации

                String criteria = entry.getKey(); //получили ключ (строка: критерий ноутбука)
                Object value = entry.getValue(); //получили значение (число, строка)

                switch (criteria){
                    case "Название производителя ноутбука":
                        if (!lap.getFirmManufacturer().equals(value)){
                            flag = false;
                        }
                        break;
                    case "Производитель чипа ЦП":
                        if (!lap.getCpu().equals(value)){
                            flag = false;
                        }
                        break;
                    case "Количество ядер ЦП":
                        if (lap.getQuantityCores() < (int) value){
                            flag = false;
                        }
                        break;
                    case "Тактовая частота ЦП":
                        if (lap.getClockSpeedMhz() < (int) value){
                            flag = false;
                        }
                        break;
                    case "Название видеокарты":
                        if (!lap.getVideoAdapter().equals(value)){
                            flag = false;
                        }
                        break;
                    case "Объем видеопамяти":
                        if (lap.getVramGb() < (int) value){
                            flag = false;
                        }
                        break;
                    case "Объем оперативной памяти":
                        if (lap.getRamGb() < (int) value){
                            flag = false;
                        }
                        break;
                    case "Объем жесткого диска":
                        if (lap.getHardDriveCapacity() < (int) value){
                            flag = false;
                        }
                        break;
                    case "Диагональ экрана":
                        if (lap.getScreenDiagonalInch() < (double) value){
                            flag = false;
                        }
                        break;
                }

                if (!flag){   //переключатель ноутбуков (в зависимости от блока свитч-кейс)
                    break;
                }
            }

            if (flag){
                result.add(lap);
            }
        }
        return result;
    }
}