abstract class Animal {
        public abstract void animalSound();
        public void sleep() {
          System.out.println("Jai babu");
        }
      }
      
      class lion extends Animal {
        public void animalSound() {
          System.out.println("The lion says: babulake babu maheshbabu");
        }
      }
      
      class Main {
        public static void main(String[] args) {
          lion mylion = new lion(); 
          mylion.animalSound();
          mylion.sleep();
        }
}
