class Animal{
  public void sound(){
    System.out.println("Animal Makes Sound");
  }
}

class Dog extends Animal{
  @Override
  public void sound(){
    System.out.println("Dog Barks");
  }
}

class Cat extends Animal{
  @Override
  public void sound(){
    System.out.println("Cat Meows");
  }
}

public class AnimalMain{
  public static void main(String[] args){
    Animal a = new Animal();
    a.sound();
    Animal d = new Dog();
    d.sound();
    Animal c = new Cat();
    c.sound();
  }
}