public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik", 3);
        dog.setAge(2);
        dog.setKlichka("Layka");
        System.out.println(dog);
        DogNursery dogNursery = new DogNursery();
        dogNursery.addDog(dog);
    }
}