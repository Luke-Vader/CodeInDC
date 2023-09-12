//class for at large student with tuition $2k
public class StudentAtLarge extends Student{

	@Override
	public void setTuition() {
		this.tuition = "2,000";
	}
	
	public StudentAtLarge() {
		this.setTuition();
	}
}
