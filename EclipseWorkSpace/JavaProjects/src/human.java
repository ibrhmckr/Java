
public class human {
	 String name;
	 String lastName;
	 int age;
	 char gender;
	  
	 human(	String name, String lastName, int age, char gender){ // Constractor
		 this.name = name;
		 this.lastName = lastName;
		 this.age =  age;
		 this.gender = gender;	 
	 }
	 
	 public boolean equals(human obj) {
		
		 if(this.name.equals(obj.name) && this.lastName.equals(obj.lastName) && this.age == obj.age && this.gender == obj.gender) {
			 return true;
			 
		 }
		 else
		 return false;
	 }
	 
	
	
	
}
