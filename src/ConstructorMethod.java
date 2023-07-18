public class ConstructorMethod {
    private String animal;
    private String sound;
    // We can create a constructor method to initialize the class level variables.
    ConstructorMethod(String animalName, String animalSound) {
        this.animal = animalName;
        this.sound = animalSound;
    }

    public String getName() {
        return this.animal;
    }

    public String getSound() {
        return this.sound;
    }

    public String getProperties() {
        return String.format("The %s says %s", this.getName(), this.getSound());
    }
}
