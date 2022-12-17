package hash;

public class HashLookupPrototypeEmployeeTest {
    HashLookupPrototype hlp;

    int employeeSSN = 100000000;
    String employeeName = "employee ";

    public HashLookupPrototypeEmployeeTest(int size) {
        hlp = new HashLookupPrototype(size);
        employeeTestMethod(size);
    }

    public void employeeTestMethod(int size){
        System.out.println("Employee Data\n");
        for(int i = 0; i < size; i++){
            Employee employee = new Employee(employeeSSN + i, employeeName + (i + 1));
            hlp.put(employee.getEmployeeSSN(), employee);
        }

        System.out.println ("Size: " + hlp.size() + "\n");

        for(int i = 0; i < size; i++){
            if (hlp.get(i) != null) {
                System.out.println(hlp.get(i).toString());
            } else {
                System.out.println("null");
            }
        }
    }
}
