package Homeworks.HW6.liskov;

// public class Animal {
//     protected String run;
//     protected String movement;
//     protected String fly;
//     protected String name;

//     public void setRun(){
//         this.run = "Бегает";
//     }

//     public void setFly(int flySpeed){
//         this.fly = "Летает";
//     }

//     public void movement(Animal animal){
//         if (animal.name == "Lion"){
//             this.movement = this.run;
//         }
//         // .... и так каждого животного
//     }
// }

// class Lion extends Animal {
//     @Override
//     public void movement(Animal animal){
//         this.movement = run;
//     }
// }

// Нарушается принцип наследования функций Барбары Лисков. Дучше создать интерфейс, который универсальный для всех животных и может быть переписан в зависимости от животного в классе

interface AnimalMovement {
    void movement();
}

class Lion implements AnimalMovement {
   @Override
   public void movement(){
        System.out.println("Бежит");;
   }
}
