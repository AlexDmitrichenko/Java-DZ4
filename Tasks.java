// Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод (не void), 
// который вернет “перевернутый” список. 
// import java.util.LinkedList;
// public class Tasks {
//     public static void main(String[] args) throws Exception{
//         LinkedList<String> ll = new LinkedList<>();
//         ll.add("zxc");
//         ll.add("7");
//         ll.add("asd");
//         ll.add("6");
//         ll.add("cvbn");
//         System.out.println("Исходный список элементов: " + ll);
//         LinkedList<String> reversedList = reverseLinkedList(ll);
//         System.out.println("Перевернутый список: " + reversedList);
//     }
//     public static LinkedList<String> reverseLinkedList(LinkedList<String> ll) {
//         LinkedList<String> reversedList = new LinkedList<>();
//         for (int i = ll.size() - 1; i >= 0; i--) {
//             String element = ll.get(i);
//             reversedList.add(element);
//         }
//         return reversedList;
//     }
// }
