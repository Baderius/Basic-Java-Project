
public class Student implements Comparable<Student>{
	/**
	 * id of the Student object
	 */
	private int id;
	/**
	 * name is the name of the Student object
	 */
	private String name;
	/**
	 * duration is the remaining semesters of the Student until it graduates
	 */
	private int duration;
	/**
	 * minRating is the minimum rating that the Student object would be willing to reside in a house can have
	 */
	private double minRating;
	/**
	 * hasAssigned is true if a Student object has assigned to a House object at least once, otherwise false
	 */
	private boolean hasAssigned = false;
	
	public Student(int id, String name, int duration, double minRating) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.minRating = minRating;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.id - o.id;
	}
	
	/**
	 * decreases the duration of the Student object
	 */
	public void dcrsDuration() {
		if(duration>0) {
			duration--;
		}
	}
	/**
	 * When called, it sets the hasAssigned field of the student object to true
	 */
	public void hasAssigned() {
		setHasAssigned(true);
	}

	public boolean isAssigned() {
		return hasAssigned;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", duration=" + duration + ", minRating=" + minRating
				+ ", hasAssigned=" + hasAssigned + "]";
	}

	public void setHasAssigned(boolean hasAssigned) {
		this.hasAssigned = hasAssigned;
	}
	
	public double getMinRating() {
		return minRating;
	}

	public String getName() {
		return name;
	}
	
	public int getDuration() {
		return duration;
	}
	
}
