import java.time.LocalDate;

public class Human {
    int dob;
    String name;
    String location;
    String job;

    public Human(String name, String location, int age, String job) {
        LocalDate ld = LocalDate.now();
        this.dob = ld.getYear() - age;
        this.name = name;
        this.location = location;
        this.job = job;
    }

    public void hello() {
        System.out.println(String.format("Привет! Меня зовуе %s. Я из города %s." +
                " Я родился в %d году." +
                " Я работаю на должности %s." +
                " Будем знакомы!", name, location, dob, job));
    }
}
