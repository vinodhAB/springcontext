package info.inetslov.springcontext;

public class Parent {
  private Integer pid;
  private String name;
   public Parent() {
	  System.out.println("Parent  object is ctreated");
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
@Override
public String toString() {
	return "Parent [pid=" + pid + ", name=" + name + "]";
}
 
public void display() {
System.out.println("pid");
System.out.println("name");
}
}
