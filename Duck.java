package mocktest.animal;

public class Duck extends Animal {
	public String beakColor = "yellow";
	

	public Duck(int age, String gender, String beakColor) {
		super(age, gender);
		this.beakColor = beakColor;
	}

	public void swim() {
		
	}
	
	public void quack() {
		
	}

	

	@Override
	public String toString() {
		return "Duck [beakColor=" + beakColor + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
