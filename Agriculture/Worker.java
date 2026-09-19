package Agriculture;

public  class Worker extends Person {

    String workerId;
    double salary;

    Worker(String name, int age, String phone,
           String workerId, double salary) {

        super(name, age, phone);

        this.workerId = workerId;
        this.salary = salary;
    }

    void displayWorker() {

        displayPerson();

        System.out.println("Worker ID : " + workerId);
        System.out.println("Salary    : ₹" + salary);
    }
}
