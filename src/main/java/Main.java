public class Main {
    public static void main(String[] args) {
        Person person = new Person(170);
        System.out.println("person.getHeight() = " + person.getHeight());
        person.setHeight(171);
        System.out.println("person.getHeight() = " + person.getHeight());
    }
}
