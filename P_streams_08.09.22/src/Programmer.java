import java.util.List;


public class Programmer {
    private String name;
    private String city;
    private List<Task> task;

    public Programmer(String name, String city, List<Task> task) {
        this.name = name;
        this.city = city;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Task> getTasks() {

        return task;
    }

    @Override
    public String toString() {

        return city + " " + name + " " + task;
    }

}