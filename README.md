## Типы данных
* int - целочисленный
  Храним целые числа, например:
```java 
int x; //Объявление пустой переменной
int y = 10;
int z = 0
int g = -3;
```
* double - вещественный
  Храним смешанные числа, дроби и т.п.
```java
double a = 3.14;
double b = -0.5;
```
* String - строковый
  Храним строки, предложения и т.п.
```java
String s = "Hello";
String text = "Java is cool";
```
* сhar - символьный
  Храним отдельные символы
```java
char c = 'A';
char digit = '5';
```
* boolean - логический
  Храним истину или ложь
```java
boolean isReady = true;
boolean hasError = false;
```
## Условный оператор

**Используется для выполнения кода при выполнении условия.**
```java
int x = 5;

if (x > 0) {
    System.out.println("Положительное число");
} else if (x < 0) {
    System.out.println("Отрицательное число");
} else {
    System.out.println("Ноль");
}
```
## Циклы

**Позволяют повторять выполнение кода.**

* for
  Используется, когда известно количество повторений.
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
* while
  Работает, пока условие истинно.
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
* do-while
  Тело выполняется минимум один раз.
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

## Работа с массивами

* Массив хранит несколько значений одного типа.
```java
int[] arr = new int[3];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
```
* Инициализация сразу:
```java
int[] numbers = {1, 2, 3, 4, 5};
```
* Перебор массива:
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```