package multipleInheritance.com;

class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}

