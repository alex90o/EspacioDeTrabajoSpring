package exc;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejemplo exepcion 1
		try {
			
		
		int a = 10;
		int b = 0;
		float t;
		System.out.println("iniciendo...");
		t = a/b;
		System.out.println(t);
		System.out.println("ejecutando...");
		System.out.println("terminado...");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error del sistema");
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		catch (NullPointerException e) {
			
			System.out.println("Error null");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ;(");
		}

		finally {
			System.out.println("El programa finalizó");
		}
		*/
		
		//ejemplo exeption 2
	
		int num1 [] = {4,8,16,32,64,128,256,512};
		int num2 [] = {2,0,4,4,0,8};
		for(int i = 0; i < num1.length; i++) {
			try {
				System.out.println(num1[i]/num2[i]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("ERROR de indice");
				System.out.println(e.getMessage());
			}catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ERROR aritmético");
				System.out.println(e.getMessage());
			}
		}
	}
}
