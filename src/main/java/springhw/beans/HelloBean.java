package springhw.beans;

public class HelloBean {
	private String name;

	HelloBean (){}
	//Конструктор
	public HelloBean(String name) {
		super();
		this.name = name;
	}

	public static HelloBean createHelloBean(String name){
		return new HelloBean(name);
	}

	public static void print(){
		System.out.println("hewy!");
	}

	//Getter
	public String getName() {
		return name;
	}
	//Setter	
	public void setName(String name) {
		this.name = name;
	}

	//Печать объекта в строку
	@Override
	public String toString() {
		return "HelloBean [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
