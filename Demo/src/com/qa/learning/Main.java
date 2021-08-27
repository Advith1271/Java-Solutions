package com.qa.learning;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println(blackJack(22,41));
	}
	
	public static int addition(int a ,int b) {
		return a+b;
	}
	public static int multiplication(int a, int b) {
		return a*b;
		
	}
	public static double division(double a, double b) {
		if(a<b)
			return a/b;
		else
			System.out.println("Cannot perform division");
		
		return 0;
	}
	public static int subtraction(int a, int b) {
		return a-b;
		
	}
	public static int flowchart(int a, int b, boolean bool) {
		if(bool)
			return a+b;
		
		return a*b;
		
	}
	public static int flowchart1(int a) {
		if(a>2000) {
			System.out.println("A");
			if(a>6000) {
				System.out.println("C");
				return 0;
			}else {
				System.out.println("B");
				if(a>4000) {
					System.out.println("D");
					return 0;
				}else {
					System.out.println("E");
					return 0;
				}
			}
		}else {
			System.out.println("1");
			if(a>100) {
				System.out.println("3");
				if(a>600) {
					System.out.println("5");
					return 0;
				}else {
					System.out.println("4");
					if(a>500) {
						System.out.println("6");
						return 0;
					}else {
						System.out.println("7");
						return 0;
					}
				}
			}else {
				System.out.println("2");
				return 0;
			}
		}
	}
	public static int blackJack(int a, int b) {
		if(a > 21 && b > 21)
			return 0;
		if(a>21)
			return b;
		if(b>21)
			return a;
		
		return(Math.max(a, b));
		

	}
	public static int uniqueSum(int a, int b ,int c) {
		if(a == b && a ==c) {
			return 0;
		}
		if(a == b) {
			return c;
		}
		if( b == c) {
			return a;
		}
		if(a == c) {
			return b;
		}
		return a+b+c;
		
	}
	public static String FizzBuzz(int a) {
		if(a%3 == 0 && a%5 == 0) 
			return "FizzBuzz";
		
		if(a%3 == 0) 
			return "Fizz";
		if(a%5 == 0)
			return "Buzz";
		
		
		return Integer.toString(a);
	}
	public static int GCD(int p, int q) {
		int gcd = 1;
		for(int i = 0;i<=p && i<=q;i++) {
			if(p%i == 0 && q%i == 0) {
				gcd =i;
			}
		}
		return gcd;
	}
	public static boolean packageRice(int big, int small, double goal) {
		if(goal%1 == 0) {
			return true;
		}
		return false;	
	}

}

class results{
	static int total;
	static int physics,chem,bio;
	public static int examresults(int physics,int chem, int bio) {
		System.out.println("Results:"+ "\n " + "Physics: "+ physics+ "\n " + "Chemistry: " + chem+ "\n " + "Biology: " +bio);
		total = physics+chem+bio;
		System.out.println("Total = " + (total));
		results.physics = physics;
		results.chem = chem;
		results.bio = bio;
		
		return total;
	}
	public static void Percentage(int total) {
		boolean physicsFail = false;
		boolean chemFail = false;
		boolean bioFail = false;
		int i =0;
		if((total*100)/450 < 60) {
			System.out.println("Failed");
			
		}
		if((results.physics*100)/150 < 60 ) {
			physicsFail = true;
			System.out.println("Less than 60% in Physics");
			i++;
		}
		if((results.chem*100)/150 < 60 ) {
			System.out.println("Less than 60% in Chemistry");
			chemFail = true;
			i++;
		}
		if((results.bio*100)/150 < 60 ) {
			System.out.println("Less than 60% in Biology");
			bioFail = true;
			i++;
		}
		else {
			System.out.println("Congratulations, your percentage is: "+ (total*100)/450 + "%");
		}
		if(i > 0) {
			System.out.println ("Percentage is greater than 60% but you got less than 60% in " + i + " exams so overall grade is fail.");
			
		}
		
	}
		
}
class Tax{
	public static int taxBracket(int salary) {
		if(salary<=14999) {
			return 0;
		} if(salary<20000) {
			return 10;
		}if (salary < 30000) {
			return 15;
		}if(salary< 45000) {
			return 20;
		}
		return 25;
	}
	public static int taxAmount(int salary) {
		int taxPercentage = taxBracket(salary);
		if(taxPercentage==0)
			return salary;
		
		int amountTax = salary*(100-taxPercentage);
		return amountTax/100;
	}
	

}




























