//pojo(plain old java objects) or bean
class A {
	
	private void psvm() {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.getEid();

	}
}
public class Emp {
	
	//maitainability ,flexibility,extensibiity of code
	private int eid;
	private String ename;
	
	
	
	
	public int getEid() {
		
		return eid;
	}





	public void setEid(int eid) {
		if(eid!=0) {
			this.eid = eid;
		}else {
			System.out.println("eid is invalid");
		}
		
	}





	public String getEname() {
		return ename;
	}





	public void setEname(String ename) {
		this.ename = ename;
	}





	void empBusinessLogic() {
		
	}
	
	//getter and setter method
	

}
