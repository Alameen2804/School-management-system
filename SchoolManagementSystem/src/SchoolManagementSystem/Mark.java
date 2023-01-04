package SchoolManagementSystem;

public class Mark {

	int tamil,english,maths,science,history,totalMark;

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
	

	public int getTotalMark() {
		return tamil+english+maths+science+history;
	}

	public Mark(int tamil, int english, int maths, int science, int history) {
		super();
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.history = history;
	}
	
	public Mark()
	{
		
	}

	@Override
	public String toString() {
		return "Mark [tamil=" + tamil + ", english=" + english + ", maths="
				+ maths + ", science=" + science + ", history=" + history
				+ ", totalMark=" + getTotalMark() + "]\n";
	}
}
