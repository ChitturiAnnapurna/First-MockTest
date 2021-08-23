package mocktest.animal;


public class Fish extends Animal implements Comparable<Fish>{
	
	private int sizeInFt;
	private boolean canEat;

	

	public Fish(int age, String gender, int sizeInFt, boolean canEat) {
		super(age, gender);
		this.sizeInFt = sizeInFt;
		this.canEat = canEat;
	}


	private void swim() {
		
	}


	public int getSizeInFt() {
		return sizeInFt;
	}

	public void setSizeInFt(int sizeInFt) {
		this.sizeInFt = sizeInFt;
	}

	public boolean isCanEat() {
		return canEat;
	}

	public void setCanEat(boolean canEat) {
		this.canEat = canEat;
	}

	@Override
	public String toString() {
		return "Fish [sizeInFt=" + sizeInFt + ", canEat=" + canEat + ", age=" + age + ", gender=" + gender + "]";
	}


	@Override
	public int compareTo(Fish o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


