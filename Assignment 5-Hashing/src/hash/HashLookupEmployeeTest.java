package hash;

public class HashLookupEmployeeTest {
    HashLookup<Integer, Object> hl;
    int employeeSSN = 100000000;
    String employeeName = "employee ";

    public HashLookupEmployeeTest(int size) {
        hl = new HashLookup<>(size);
        employeeTestMethod(size);
    }

    public void employeeTestMethod(int size){
        System.out.println("Employee Data\n");
        for(int i = 0; i < size; i++){
            Employee employee = new Employee(employeeSSN + i, employeeName + (i + 1));
            hl.put(employee.getEmployeeSSN(), employee);
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
