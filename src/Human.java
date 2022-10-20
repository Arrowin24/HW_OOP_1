import java.time.LocalDate;

public class Human {
    private int birthYear;
    private String name;
    private String location;
    private String job;

    public Human(String name, String location, int age, String job) {
        LocalDate ld = LocalDate.now();
        this.birthYear = ld.getYear() - age;
        this.name = name;
        this.location = location;
        this.job = job;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear != 0) {
            this.birthYear = birthYear;
        }

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (!location.isEmpty() && !location.isBlank() && location != null) {
            this.location = location;
        }
    }

    public void hello() {
        System.out.println(String.format("Привет! Меня зовуе %s. Я из города %s." +
                " Я родился в %d году." +
                " Я работаю на должности %s." +
                " Будем знакомы!", name, location, birthYear, job));
    }
}
