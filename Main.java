public class Main {

    public static class Person {

        private String name;
        private int age;

        public Person(String name) {
            this.name = name;
            this.age = 18; // default age
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayName() {
            System.out.println("Name: " + name);
        }


        public void displayAge() {
            System.out.println("Age: " + age);
        }

        
        public static void main(String[] args) {
            Person p1 = new Person("Alice");
            Person p2 = new Person("Bob", 25);

            p1.displayName();
            p1.displayAge();

            p2.displayName();
            p2.displayAge();
        }
    }

}