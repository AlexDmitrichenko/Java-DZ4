// Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод (не void), 
// который вернет “перевернутый” список.

// import java.util.Collections;
// import java.util.LinkedList;

// public class Tasks {
//     public static void main(String[] args) {
//         LinkedList<String> ll = new LinkedList<>();
//         ll.add("zxc");
//         ll.add("7");
//         ll.add("asd");
//         ll.add("6");
//         ll.add("cvbn");
//         System.out.println("Исходный список элементов: " + ll);
//         Collections.reverse(ll);
//         System.out.println("Перевернутый список: " + ll);
//     }
// }

// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.  

// import java.util.Scanner;
// import java.util.Arrays;

// public class Tasks {
//     public static void main(String[] args) {
//         LinkedList<Object> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
//         System.out.printf("Cписок элементов: %s \n", list);
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("Ввод элемента: ");
//         enqueue(list, sc.nextInt());
//         System.out.println("enqueue() - помещает элемент в конец очереди " + list);
//         System.out.printf("LinkedListue() - возвращает первый элемент - %s из очереди и удаляет его \n", LinkedListue(list));
//         System.out.printf("Cписок элементов: %s \n", list);
//         System.out.printf("first() - возвращает первый элемент - %s из очереди, не удаляя его \n", first(list));
//         System.out.printf("Cписок элементов: %s \n", list);
//         sc.close();
//     }
//     public static void enqueue(LinkedList<Object> list, int element){
//         list.add(element);
//     }
//     public static Object LinkedListue(LinkedList<Object>list){
//         Object a = list.pollFirst();
//         return a;
//     }
//     public static Object first(LinkedList<Object> list){
//         return list.getFirst();
//     }
// }

// Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример  1 + 2 ответ: 3 + 4 ответ: 7 Отмена 3 * 3 ответ: 9 - 1 Ответ 8 Отмена -> 9 
// Отмена -> 7 Отмена -> 3 + 2 Ответ 5

// public class Tasks {
//     public static void main(String[] args) {
//         LinkedList<Double> resList = new LinkedList<Double>(); 
//         try (Scanner sc = new Scanner(System.in)) { 
//             System.out.print("Введите первое число: ");
//             resList.add(sc.nextDouble()); 
//             sc.nextLine();
//             while (true) { 
//                 System.out.print("Выберите действие ( +, -, *, / ) или клавишу [C] для отмены последнего действия: ");
//                 String Charr = sc.nextLine();
//                 if ("C".equals(Charr) || "c".equals(Charr)) {                                        
//                     resList.removeFirst();
//                     if (resList.isEmpty()) resList.add(0.0); 
//                 } else {
//                     System.out.print("Введите второе число: ");
//                     double Num2 = sc.nextDouble(); 
//                     calculate(resList, Charr, Num2); 
//                     sc.nextLine(); 
//                 }
//                 System.out.println("Результат: " + resList.getFirst()); 
//             }
//         }
//     }

//     public static void calculate(LinkedList<Double> resList, String Charr, double Num2) { 
//         double res = resList.getFirst(); 
//         switch (Charr) { 
//             case "+":
//                 resList.add(0, resList.getFirst() + Num2);
//                 System.out.printf(res + " " + Charr + " " + Num2 + " = " + resList.getFirst() + "\n");
//                 break;
//             case "-":
//                 resList.add(0, resList.getFirst() - Num2);
//                 System.out.printf(res + " " + Charr + " " + Num2 + " = " + resList.getFirst() + "\n");
//                 break;
//             case "*":
//                 resList.add(0, resList.getFirst() * Num2);
//                 System.out.printf(res + " " + Charr + " " + Num2 + " = " + resList.getFirst() + "\n");
//                 break;
//             case "/":
//                 if (Num2 == 0) { 
//                     System.out.println("Ошибка! На ноль делить нельзя");
//                     break;
//                 }
//                 resList.add(0, resList.getFirst() / Num2);
//                 System.out.printf(res + " " + Charr + " " + Num2 + " = " + resList.getFirst() + "\n");
//                 break;
//             default:
//                 System.out.println("Ошибка! Повториете ввод! ");
//         }
//     }
// }
