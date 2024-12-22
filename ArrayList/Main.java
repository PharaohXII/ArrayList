import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    // Selection sort method
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the elements
            Student temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students to the ArrayList
        students.add(new Student(5, "Alice", "123 Elm St"));
        students.add(new Student(3, "Bob", "456 Oak St"));
        students.add(new Student(10, "Charlie", "789 Maple St"));
        students.add(new Student(1, "Daisy", "321 Pine St"));
        students.add(new Student(7, "Eve", "654 Birch St"));
        students.add(new Student(4, "Frank", "987 Cedar St"));
        students.add(new Student(8, "Grace", "111 Spruce St"));
        students.add(new Student(6, "Hank", "222 Redwood St"));
        students.add(new Student(2, "Ivy", "333 Aspen St"));
        students.add(new Student(9, "Jack", "444 Fir St"));

        // Sort by roll number
        System.out.println("Sorting by Roll Number:");
        selectionSort(students, new Student.RollNoComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by name
        System.out.println("\nSorting by Name:");
        selectionSort(students, new Student.NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}