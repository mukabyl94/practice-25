public class User {
    private String name;
    private String Surname;

    public User(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
