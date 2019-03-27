package info.inetslov.springcontext;

public class Addres {
	private int pid;
	private String name;
	public Addres() {
		System.out.println("Addres object is created");
	}
	@Override
	public String toString() {
		return "Addres [pid=" + pid + ", name=" + name + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
