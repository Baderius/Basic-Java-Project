
public class House implements Comparable<House>{
	/**
	 * id of the House
	 */
	private int id;
	/**
	 * duration of the house is the number of semester that the house will not be available
	 */
	private int duration;
	/**
	 * rating is the rating of the house
	 */
	private double rating;
	
	public House(int id, int duration, double rating) {
		this.id = id;
		this.duration = duration;
		this.rating = rating;
	}

	@Override
	public int compareTo(House o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "House [id=" + id + "]";
	}

	public int getDuration() {
		return duration;
	}
	
	/**
	 * 
	 * @param duration is the new duration of the House object
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Decreases the House object's duration by 1 when called
	 */
	public void dcrsDuration() {
		if(duration>0) {
			
			duration--;
		}
	}
	
	
	public double getRating() {
		return rating;
	}
	
	

}
