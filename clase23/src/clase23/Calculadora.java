package clase23;

public class Calculadora {
/*	
public int sumar(int x,int y) {
	return x+y;
}
*/
static int a;
//int final b = 100; final contantes 
int b = 100;
Calculadora(){
	a++;
}
public void setB(int v) {
	b = v;
}
public static int sumar(int x,int y) {
	return x+y;
}

public static int restar(int i, int j) {
	// TODO Auto-generated method stub
	return i - j;
}
public static void mostrar() {
	System.out.println("El valor de a es : " +a);
}
public void mostrarB() {
	System.out.println("El valor de b es : " +b);
}
}
