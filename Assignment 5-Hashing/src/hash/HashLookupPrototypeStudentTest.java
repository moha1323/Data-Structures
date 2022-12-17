package hash;

public class HashLookupPrototypeStudentTest {
    HashLookupPrototype hlp;

    int studentID = 100000;
    String studentName = "student ";

    public HashLookupPrototypeStudentTest(int size) {
        hlp = new HashLookupPrototype(size);
        studentTestMethod(size);
    }

    public void studentTestMethod(int size) {
        System.out.println("Student Data\n");
        for(int i = 0; i < size; i++) {
            Student student = new Student(studentID + i, studentName + (i + 1));
            hlp.put(student.getStudentID(), student);
        }

        System.out.println ("Size: " + hlp.size() + "\n");

        for(int i = 0; i < size; i++) {
            if (hlp.get(i) != null) {
                System.out.println(hlp.get(i).toString());
            } else {
                System.out.println("null");
            }
        }
    }

}
