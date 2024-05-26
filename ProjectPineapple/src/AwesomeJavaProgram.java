
public class AwesomeJavaProgram {

	public static void burp()
	{
		System.out.println("buurrrrrp");
	}
	public static void main(String[] args) {
		//int is type of variable (Integer)
		//myInt is name of variable (can be whatever name)
		//= 7 give myInt a value. Everytime you call myInt it will now its = to 7
		int myInt = 7;
		
		//orange text such as double, char, and int are primative while System does not
		//Note that primatives start with a lowercase
		
		//double is a decimal number 
		double shoeSize = 9.5;
		
		//char is single character
		char myInitial = 'V';
		
		//Stores result of myInt * shoeSize using double since it will come out as a decimal
		double result = myInt * shoeSize;
		
		//String is similar to char but can hold up to more characters
		String myName = "Victor";
		//type out myName and push . to see a whole list of options you can use
		
		
		//need to remember System.out.println();
		//Can add any function in such as calling myName 
		System.out.println(myName.length());
		
		burp();
		
	}

}
