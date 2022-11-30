package lab1;


/**
 * class Animal for Lab1 subject Java programming technologies
 * <p>
 * @author hrrcnnmdlr
 * @version 1.2.0
 */
public class Wolf {
    /**
     * Internal attribute: name is name of animal
     * Internal attribute: genus is genus of animal
     * Internal attribute: age is age of animal
     * Internal attribute: paws is number of paws of animal
     * Internal attribute: domestic is boolean variable indicating whether the animal is domestic or wild
     */
    private String name;
    private String genus;
    private int age;
    private int paws;
    private boolean domestic;
    /**
     * Getter method
     * @return name
     */
    private String getName() {
        return name;
    }
    /**
     * Getter method
     * @return genus
     */
    private String getGenus() {
        return genus;
    }
    /**
     * Getter method
     * @return age
     */
    private int getAge() {
        return age;
    }
    /**
     * Getter method
     * @return paws
     */
    private int getPaws() {
        return paws;
    }
    /**
     * Getter method
     * @return domestic
     */
    private boolean isDomestic() {
        return domestic;
    }
    /**
     * toString is override method for class Object
     * <p>
     * @return string with information of animal: name, genus, age, paws and domestic
     */
    @Override
    public String toString() {
        return "Animal: \n"
                + "    Name: " + name + '\n'
                + "    Genus: " + genus + '\n'
                + "    Age: " + age + " y.o\n"
                + "    Paws: " + paws + '\n'
                + "    Is domestic: " + domestic;
    }
    /**
     * equals is override method for class Object
     * <p>
     * @param o is object that is compared to the current object
     * @return true if animals is equals or false if animals isn't equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this.hashCode() != o.hashCode()) return false;
        if (this == o) return true;

        Wolf animal = (Wolf) o;

        if (getAge() != animal.getAge()) {
            return false;
        }
        if (getPaws() != animal.getPaws()) {
            return false;
        }
        if (isDomestic() != animal.isDomestic()) {
            return false;
        }
        if (!getName().equals(animal.getName())) return false;
        return getGenus().equals(animal.getGenus());
    }
    /**
     * hashCode is override method for class Object
     * <p>
     * @return hashCode that is defined from length of name multiply by age
     */
    @Override
    public int hashCode() {
        return name.length() * age;
    }
    public static class Builder {
        private final Wolf newWolf;

        public Builder() {
            newWolf = new Wolf();
        }

        public Builder withName(String name){
            newWolf.name = name;
            return this;
        }
        public Builder withGenus(String genus){
            newWolf.genus = genus;
            return this;
        }
        public Builder withAge(int age){
            newWolf.age = age;
            return this;
        }
        public Builder withPaws(int paws){
            newWolf.paws = paws;
            return this;
        }
        public Builder isDomestic(boolean domestic){
            newWolf.domestic = domestic;
            return this;
        }
        public Wolf build(){
            return newWolf;
        }
    }
    /**
     * Setter method
     * @param name is name of animal
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * addAge is method that increases by one
     */
    public void addAge() {
        age = this.age + 1;
    }
    /**
     * Setter method
     * @param genus is genus of animal
     */
    public void setGenus(String genus) {
        this.genus = genus;
    }
    /**
     * Setter method
     * @param paws is number of paws of animal
     */
    public void setPaws(int paws) {
        this.paws = paws;
    }
    /**
     * eat is method which print line that animal eat food
     * @param food is food which animal eat
     */
    public void eat(String food) {
        System.out.print(name);
        System.out.print(" eats ");
        System.out.println(food);
    }
    /**
     * sleep is method which print line that animal sleep
     */
    public void sleep() {
        System.out.print(name);
        System.out.println(" sleeps");
    }
    /**
     * run is method which print line that animal runs
     */
    public void run() {
        System.out.print(name);
        System.out.println(" runs");
    }

    public static void main(String... strings) {
        Wolf animal1 = new Wolf.Builder()
                .withName("Donald")
                .withGenus("Duck")
                .withAge(6)
                .withPaws(2)
                .isDomestic(true)
                .build();
        Wolf animal2 = new Wolf.Builder()
                .withName("Donald")
                .withGenus("Duck")
                .withAge(6)
                .withPaws(2)
                .isDomestic(true)
                .build();
        Wolf animal3 = new Wolf.Builder()
                .withName("Virginia")
                .withGenus("Wolf")
                .withAge(2)
                .withPaws(4)
                .isDomestic(false)
                .build();
        System.out.println("Is animal2 equals animal1? " + animal1.equals(animal2));
        System.out.println(animal1);
        System.out.println(animal2);
        animal2.addAge();
        System.out.println("Is animal2 equals animal1? " + animal1.equals(animal2));
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println("Is animal3 equals animal1? " + animal1.equals(animal3));
        System.out.println(animal1);
        System.out.println(animal3);
        animal1.eat("apple");
        animal2.run();
        animal2.setName("Mario");
        animal2.eat("apple");
        animal3.sleep();
    }
}
