package lab1;

/**
 *
 *
 *
 *
 *
 */
public class Person {
    private String fullName;
    private int age;
    private boolean retired;

    public Person() {
    }

    public Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }

    private String getFullName() {
        return fullName;
    }

    private int getAge() {
        return age;
    }

    private boolean isRetired() {
        return (age > 65);
    }

    @Override
    public String toString() {
        return "Person{"
                + "fullName='" + fullName + '\''
                + ", age=" + age
                + ", retired=" + retired
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (getAge() != person.getAge()) {
            return false;
        }
        if (isRetired() != person.isRetired()) {
            return false;
        }
        return getFullName() != null
                ? getFullName().equals(person.getFullName())
                : person.getFullName() == null;

    }

    @Override
    public int hashCode() {
        return fullName.length() * age;
    }

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withFullname(String fullName){
            newPerson.fullName = fullName;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withRetired(boolean retired){
            newPerson.retired = retired;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }


    public static void main(String... strings) {
        Person person1 = new Person.Builder()
                .withFullname("Jane Creative")
                .withAge(32)
                .withRetired(false)
                .build();
        Person person2 = new Person.Builder()
                .withFullname("Jane Creative")
                .withAge(32)
                .withRetired(false)
                .build();
        Person person3 = new Person.Builder()
                .withFullname("Kanye West")
                .withAge(32)
                .withRetired(false)
                .build();
        System.out.println("person1.equals(person2)? " + person1.equals(person2));
        System.out.println("person1.equals(person3)? " + person1.equals(person3));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}


