
public class P3_DasGupta_Bhaswati_YelpRating implements Comparable<P3_DasGupta_Bhaswati_YelpRating> {
	private String target;
	
	private String review;
	
	private double rating;
	
	private String userName; 
	
	
	public P3_DasGupta_Bhaswati_YelpRating(String target, String review, double rating, String userName) {
		super();
		this.target = target;
		this.review = review;
		this.rating = rating;
		this.userName = userName;
	}


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public static void main(String[] args) {
		P3_DasGupta_Bhaswati_YelpRating y = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "awesome pizza", 5, "Eric F");
		
		System.out.println(y);
		

	}
	
	@Override 
	public int compareTo(P3_DasGupta_Bhaswati_YelpRating o) {
		if (this.rating - o.getRating() > 0 && this.rating - o.getRating() < 1) {
			return 1;
		}else if (this.rating - o.getRating() < 0 && this.rating - o.getRating() > -1) {
			return -1;
		}else {
			return (int)this.rating - (int)o.getRating();
		}
	}
	
	@Override
	public String toString() {
		String str = "Target:\t" + target + "\nReview:\t" + review + "\nRating:\t" +
					 rating + "\nUser:\t" + userName + "\n";
		return str;
	}
	
	

}
