package lambda_Test;

public class Driver {
	class manager implements Person_Test{
		public void speak() {
			System.out.println("This is Managers speaking");
			
		}
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Trainee t = new Trainee();
		
		e.speak();
		t.speak();
		manager m = new Driver().new manager();
		m.speak();
		Person_Test Director = new Person_Test() {//anonymous class
			public void speak() {
				System.out.println("This is the director speaking");
			}
			
		};
		Director.speak();
		//lambda expression
		Person_Test Hamad =()->{
							System.out.println("This is Hamad speaking");
							System.out.println("Hi Everyone A very Good Morning");
		};
		}
		Hamad.speak();
		
		Person_Test Meera =()->System.out.println("This is Meera speaking");
		Meera.speak();
		
		Person_Test Theyab =()->System.out.println("This is Theyab speaking");
		Theyab.speak();
		
		Person_Test Dabya =()->System.out.println("This is Dabya speaking");
		Dabya.speak();
			
		}

	}


