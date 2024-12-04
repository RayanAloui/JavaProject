import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 20, "Alice"));
        students.add(new Student(2, 22, "Bob"));
        students.add(new Student(3, 21, "Charlie"));
        students.add(new Student(4, 23, "David"));
        students.add(new Student(5, 20, "Eva"));
        students.add(new Student(6, 22, "Frank"));
        students.add(new Student(7, 21, "Grace"));
        students.add(new Student(8, 23, "Hank"));
        students.add(new Student(9, 19, "Ivy"));
        students.add(new Student(10, 24, "Jack"));


        StudentManagement st = new StudentManagement();

        //lambda
        Consumer<Student> con = s -> System.out.println(s);
        st.displayStudents(students, con);
        //reference method
        st.displayStudents(students, System.out::println);

        //lambda
        Predicate<Student> pre = t -> t.getAge() > 22;
        st.displayStudentsByFilter(students, pre,con);

        //lambda
        Function<Student, String> fun = e -> e.getNom();
        String names1 = st.returnStudentsNames(students, fun);
        System.out.println(names1);
        //reference method
        String names2= st.returnStudentsNames(students, Student::getNom);
        System.out.println(names2);

        //lambda (create empty student object)
        Supplier<Student> sup1 = () -> new Student();
        Student student1 = st.createStudent(sup1);
        System.out.println(student1);
        //lambda (create parametrized student object)
        Supplier<Student> sup2 = () -> new Student(11, 23,"Amy");
        Student student2 = st.createStudent(sup2);
        System.out.println(student2);

        //reference method (create empty student object)
        Supplier<Student> sup3 = Student::new;
        //Student student3 = st.createStudent(sup3);
        Student student3 = sup3.get();
        System.out.println(student3);
        //reference method (create parametrized student object)
        TripleFunction<Integer, Integer, String, Student> tf = Student::new;
        Student student4 = tf.convert(11, 23, "Amy");
        System.out.println(student4);

        //lambda
        Comparator<Student> com = (a,b) -> a.getId() - b.getId();
        List<Student> students1 = st.sortStudentsById(students, com);
        System.out.println(students1);
        //reference method
        List<Student> students2 = st.sortStudentsById(students, Comparator.comparing(Student::getId));
        System.out.println(students2);

    }
}
