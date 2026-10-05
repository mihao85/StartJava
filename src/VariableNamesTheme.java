public class VariableNamesTheme { 
    
    public static void main(String[] args) { 
        System.out.println("1. РАЗНЫЕ ПЕРЕМЕННЫЕ");
        // Цифра
        int digit = 3;
        System.out.println("Цифра = " + digit);
        // Сумма чисел
        int numberSum = 3 + 7;
        System.out.println("Сумма чисел = " + numberSum);
        // Произведение цифр
        int digitProduct = 3 * 7;
        System.out.println("Произведение цифр = " + digitProduct); 
        // Максимальное число
        double numberMax = 8.7;
        System.out.println("Максимальное число = " + numberMax); 
        // Количество десятков
        int tenCount = 10;
        System.out.println("Количество десятков = " + tenCount); 
        // Вес собаки
        double weightDog = 8.7;
        System.out.println("Вес собаки = " + weightDog + "кг."); 
        // Исходное число
        long numberOriginal = 45612L;
        System.out.println("Исходное число = " + numberOriginal); 
        // Процент по вкладу
        byte depositPrecent = 6;
        System.out.println("Процент по вкладу = " + depositPrecent + "%"); 
        // Символ &
        char simbol = '&';
        System.out.println("Символ & = " + simbol); 
        // Код ошибки
        int codeError = 404;
        System.out.println("Код ошибки = " + codeError); 
        // Тип сообщения
        String typeMessage = "Текстовое сообщение.";
        System.out.println("Тип сообщения - " + typeMessage); 
        // Число нулей
        int numberOfZero = 2;
        System.out.println("Число нулей = " + numberOfZero); 
        // Уникальное число
        int numberUnique = 48;
        System.out.println("Уникальное число = " + numberUnique); 
        // Случайное число
        float numberRendom = 321F;
        System.out.println("Случайное число = " + numberUnique); 
        // Математическое выражение
        String expressionMath = "(76-13)*3";
        System.out.println("Математическое выражение = " + expressionMath); 
        // Счет в игре
        String gameScore = "1:1";
        System.out.println("Счет в игре = " + gameScore); 
        // Максимальная длинна
        int lenghtMax = 8;
        System.out.println("Максимальная длинна = " + lenghtMax); 
        // Пункт меню
        int itemMenu = 5;
        System.out.println("Пункт меню " + itemMenu); 
        // Стоимость кофе
        int coffePrice = 100;
        System.out.println("Стоимость кофе = " + coffePrice + "руб."); 
        // Начальная дата
        String dateStart = "01.01.01";
        System.out.println("Начальная дата " + dateStart); 
        // Окончание диапазона
        int rangeEnd = 100;
        System.out.println("Окончание диапазона = " + rangeEnd); 
        // Имя работника месяца
        String employeeNameMonth = "Маша";
        System.out.println("Имя работника месяца - " + employeeNameMonth); 
        // Название электронной книги
        String ebookTitle = "Звездные воины.";
        System.out.println("Название электронной книги - " + ebookTitle); 
        // Размер
        byte size = 46;
        System.out.println("Размер = " + size); 
        // Вместимость
        int capacity = 1024;
        System.out.println("Вместимость = " + capacity + "байт"); 
        // Счетчик
        String counter = "Водяной";
        System.out.println("Счетчик - " + counter); 
        // Путь до файла
        String pathFile = "D:/StartJava";
        System.out.println("Путь до файла: " + pathFile); 
        // Количество чисел в строке
        int countNamberOfString = 5;
        System.out.println("Количество чисел в строке = " + countNamberOfString); 
        System.out.println(); 
        System.out.println("2. BOOLEAN-ПЕРЕМЕННЫЕ"); 
        // Сотни равны?
        boolean hasEqualHundreds = true;
        String answe;
        if (hasEqualHundreds == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Сотни равны? " + answe); 
        // Компьютер включен?
        boolean isOnComputer = false;
        if (isOnComputer == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Компьютер включен? " + answe); 
        // Есть равные цифры?
        boolean hasEqualDigits = false;
        if (hasEqualDigits == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Есть равные цифры? " + answe); 
        // Служба создана?
        boolean isCreatedService = true;
        if (isCreatedService == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Служба создана? " + answe); 
        // Файл пустой?
        boolean isEmptyFile = true;
        if (isEmptyFile == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Файл пустой? " + answe); 
        // Соединение активное?
        boolean isConnectionActive = false;
        if (isConnectionActive == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Соединение активное? " + answe); 
        // Новый?
        boolean isNew = true;
        if (isNew == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Новый? " + answe); 
        // Электронная почта действительная?
        boolean isValidEmail = true;
        if (isValidEmail == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Электронная почта действительная? " + answe); 
        // Имеются уникальные строки?
        boolean hasStringUnique = false;
        if (hasStringUnique == true) { 
            answe = "Да";
        } else answe = "Нет";
        System.out.println("Имеются уникальные строки? " + answe); 
        System.out.println(); 
        System.out.println("3. АББРЕВИАТУРЫ"); 
        // Старый universally unique identifier
        String oldUuid = "Уникальный универсальный идентификатор - UUID";
        System.out.println(oldUuid); 
        // Производитель оперативной памяти
        String manufacturerRam = "Производитель оперативной памяти - RAM Kingston";
        System.out.println(manufacturerRam); 
        // Емкость жесткого диска
        String hddCapacity = "Емкость жесткого диска - HDD 2Тбайта";
        System.out.println(hddCapacity); 
        // Определение термина протокола передачи гипертекста
        String definationHttp = "Определение термина протокола передачи гипертекста - HTTP";
        System.out.println(definationHttp); 
        // Сокращенный uniform resource locator
        String abbreviatedUrl = "Сокращенный uniform resource locator - URL";
        System.out.println(abbreviatedUrl); 
        // Новый идентификатор клиента
        String clientNewId = "Новый идентификатор клиента - id клиента";
        System.out.println(clientNewId); 
        // Количество символов в american standard code for information interchange
        String quantityNamberAscii = "Количество символов в ASCII";
        System.out.println(quantityNamberAscii); 
    } 
} 