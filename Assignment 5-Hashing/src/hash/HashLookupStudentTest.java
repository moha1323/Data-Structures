package hash;

public class HashLookupStudentTest {
    HashLookup<Integer, Object> hl;
    int studentID = 100000;
    String studentName = "student ";

    public HashLookupStudentTest(int size) {
        hl = new HashLookup<>(size);
        studentTestMethod(size);
    }

    public void studentTestMethod(int size){
        System.out.println("Student Data\n");
        for(int i = 0; i < size; i++){
            Student student = new Student (studentID + i, studentName + (i + 1));
            hl.put(student.getStudentID(),student);
        }

        System.out.println ("Size: " + hl.bucketCount() + "\n");

        for(int i = 0; i < size; i++){
            if(hl.get(i) != null){
                System.out.println(hl.get(i).toString());
            } else {
                System.out.println("null");
            }
        }

    }
}
