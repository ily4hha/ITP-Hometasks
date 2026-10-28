public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.name = "Orange";
        kitty.weight = 5;
        kitty.height = 20;
        kitty.color = "Orange";
        Dog puppy = new Dog();
        puppy.name = "Bone";
        puppy.weight = 20;
        puppy.height = 40;
        puppy.color = "Black";
        Cow minicow = new Cow();
        minicow.name = "Bus";
        minicow.weight = 100;
        minicow.height = 1000;
        minicow.color = "Brown";
        System.out.println(kitty.name);
        kitty.sleep();
        kitty.eat();
        kitty.makeSound();
        System.out.println(puppy.name);
        puppy.sleep();
        puppy.eat();
        puppy.makeSound();
        System.out.println(minicow.name);
        minicow.sleep();
        minicow.eat();
        minicow.makeSound();

    }
}
