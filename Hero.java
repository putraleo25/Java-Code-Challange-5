public class Hero extends Human {
  private int energy = 100;

  public Hero(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void player() {
    System.out.println("========= Player ========");
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Energy: " + this.energy);
    System.out.println("=========================");
  }

  void checkEnergy() {
    if (energy <= 0) {
      System.out.println("Energi Anda habis! Player " + this.name + " tamat!");
      System.exit(0);
    }
  }

  void run() {
    checkEnergy();
    System.out.println(this.name + " sedang berlari....");
    energy -= 10;
  }

  void eat() {
    checkEnergy();
    System.out.println(this.name + " sedang makan....");
    energy += 20;
  }

  void drink() {
    checkEnergy();
    System.out.println(this.name + " sedang minum....");
    energy += 20;
  }

  void sit() {
    checkEnergy();
    System.out.println(this.name + " sedang duduk....");
    energy += 10;
  }

  void jump() {
    checkEnergy();
    System.out.println(this.name + " sedang lompat....");
    energy -= 20;
  }

  void attack() {
    checkEnergy();
    System.out.println(this.name + " sedang menyerang....");
    energy -= 30;
  }
}