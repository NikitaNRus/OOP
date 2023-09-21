package Seminars.Sem6.openClose;

// class Animal {
//     String name;

//     Animal(String name) {
//         this.name = name;
//     }

//     void makeSound() {
//         if ("Dog".equals(name)) {
//             System.out.println("гав-гав");
//         } else if ("Cat".equals(name)) {
//             System.out.println("мяу-мяу");
//         }
//     }
// }

// Нарушает второй принцип

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("гав-гав");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("мяу-мяу");
    }
}