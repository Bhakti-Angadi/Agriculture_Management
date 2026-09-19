package Agriculture;

public class Supervisor extends Worker {

    String department;
    int teamSize;

    Supervisor(String name, int age, String phone,
               String workerId, double salary,
               String department, int teamSize) {

        super(name, age, phone, workerId, salary);

        this.department = department;
        this.teamSize = teamSize;
    }

    void displaySupervisor() {

        displayWorker();

        System.out.println("Department : " + department);
        System.out.println("Team Size  : " + teamSize);
    }
}