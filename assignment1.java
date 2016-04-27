interface Shape{
	public void area(float side);
}

class size implements Shape{
	public void area(float side){
		System.out.println("lenght of Square is " +side);
	}
}
class area implements Shape{
	public void area(float side){ 
		System.out.println("Area of Square is " +(side*side));
	}
}

class assignment1{
	public static void 	main(String[] args) {
		size s=new size();
		area a=new area();
		s.area(5);
		a.area(6);
	}
}