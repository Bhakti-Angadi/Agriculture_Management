package Agriculture;

public class FieldWorker extends Worker {

    String fieldArea;
    String workType;

    FieldWorker(String name, int age, String phone,
                String workerId, double salary,
                String fieldArea, String workType) {

        super(name, age, phone, workerId, salary);

        this.fieldArea = fieldArea;
        this.workType = workType;
    }

    void displayFieldWorker() {

        displayWorker();

        System.out.println("Field Area : " + fieldArea);
        System.out.println("Work Type  : " + workType);
    }
}
