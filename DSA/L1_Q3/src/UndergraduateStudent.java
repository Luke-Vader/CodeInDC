//class for Under grad student with tuition $4k
public class UndergraduateStudent extends Student{

	
	public UndergraduateStudent() {
		this.setTuition();
	}
	
	@Override
	public void setTuition() {
		this.tuition = "4,000";
	}
	
}
