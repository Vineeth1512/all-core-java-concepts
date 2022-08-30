package polymorphism.com;

public class OverloadConstructor {
int id ;
String name;
String address;

/*
 * public int getId() { return id; } public void setId(int id) { this.id = id; }
 * public String getName() { return name; } public void setName(String name) {
 * this.name = name; } public String getAddress() { return address; } public
 * void setAddress(String address) { this.address = address; }
 */
public OverloadConstructor() {
	// TODO Auto-generated constructor stub
	
	id=43;
}
OverloadConstructor(int id){
	this.id=44;
	
}
OverloadConstructor(int id ,String name){
	this(45);
	this.name=
			"akash";
}
OverloadConstructor(int id, String name,String address){
	this(id, name);
	this.address=address;
	
}
void display() {
	System.out.println("ID NUMBER :"+ id+",NAME OF THE CANDIDATE : " + name + ", ADDRESS OF CANDIDATE :"+  address);
}
public static void main(String[] args) {
	OverloadConstructor obj=new OverloadConstructor();
//	System.out.println(obj.getId());
	OverloadConstructor objSecond=new OverloadConstructor(2,"vineeth","vemulawada");

	obj.display();
	objSecond.display();
	}

}
