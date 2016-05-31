package cui.oo;

public class Man {

	private Dog dog;

	public Man() {

	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public static void main(String[] args) {
		Man man = new Man();
		Dog dog = new Dog("DD");
		dog.say();

		man.setDog(dog);

		man.getDog().say();

		System.out.println(dog == man.getDog());
	}

}
