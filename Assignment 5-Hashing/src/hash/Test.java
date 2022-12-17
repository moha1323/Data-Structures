package hash;

public class Test {
    public static void main(String[] args){
//        System.out.println("\nHashLookupPrototype Test\n");
//        lookupSpeedHashLookupPrototypeStudentTest(10);
//        System.out.println("\n");
//        lookupSpeedHashLookupPrototypeEmployeeTest(10);

        System.out.println("\nHashLookup Test\n");
        lookupSpeedHashLookupStudentTest(10000000);
//        System.out.println("\n");
//        lookupSpeedHashLookupEmployeeTest(10);
    }

    public static void lookupSpeedHashLookupPrototypeStudentTest(int size){
        long startTime = System.currentTimeMillis();
        HashLookupPrototypeStudentTest hashLookupPrototypeStudentTest = new HashLookupPrototypeStudentTest(size);
        long stopTime = System.currentTimeMillis();
        double speed = (stopTime - startTime) * .001;
        System.out.println("\nLookup Speed: " + speed + " seconds");
    }

    public static void lookupSpeedHashLookupPrototypeEmployeeTest(int size){
        long startTime = System.currentTimeMillis();
        HashLookupPrototypeEmployeeTest hashLookupPrototypeEmployeeTest = new HashLookupPrototypeEmployeeTest(size);
        long stopTime = System.currentTimeMillis();
        double speed = (stopTime - startTime) * .001;
        System.out.println("\nLookup Speed: " + speed + " seconds");
    }

    public static void lookupSpeedHashLookupStudentTest(int size){
        long startTime = System.currentTimeMillis();
        HashLookupStudentTest hashLookupStudentTest = new HashLookupStudentTest(size);
        long stopTime = System.currentTimeMillis();
        double speed = (stopTime - startTime) * .001;
        System.out.println("\nLookup Speed: " + speed + " seconds");
    }

    public static void lookupSpeedHashLookupEmployeeTest(int size){
        long startTime = System.currentTimeMillis();
        HashLookupEmployeeTest hashLookupEmployeeTest = new HashLookupEmployeeTest(size);
        long stopTime = System.currentTimeMillis();
        double speed = (stopTime - startTime) * .001;
        System.out.println("\nLookup Speed: " + speed + " seconds");
    }
}
