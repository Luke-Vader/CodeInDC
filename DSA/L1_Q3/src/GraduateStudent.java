//class for Under grad student with tuition $6k
public class GraduateStudent extends Student{

	@Override
	public void setTuition() {
		this.tuition = "6,000";
	}
	
	public GraduateStudent() {
		this.setTuition();
	}
	
}
