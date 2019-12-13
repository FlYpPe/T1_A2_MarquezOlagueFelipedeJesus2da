import java.util.Scanner;

class TDACadenaEspecialConString{
	private String cadena;

	public TDACadenaEspecialConString(String cadenaEx) {
		this.setCadena(cadenaEx);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	//operacion

	public String invertirCadenaPorLetras() {
		String palabraInversa = "";

		for (int i = 0; i < this.getCadena().length(); i++) {
			String letra = this.getCadena().substring(i,i+1); 
			palabraInversa = letra + palabraInversa;
		}
		return palabraInversa;
	}

	public String invertirCadenaPorPalabra() {
		String inversa ="";

		String palabraA[] = this.getCadena().split(" ");

		for (int j = 0; j < palabraA.length; j++) {
			inversa = palabraA[j]+" "+inversa;
		}
		return inversa;

	}

	public String agregarCaracterEnPosicion(String caracter,int posicion) {

		String primerParte = this.getCadena().substring(0,posicion);
		String SegundaParte = this.getCadena().substring(posicion,getCadena().length());
		String cha = caracter+"";
		String nuevaCadena = primerParte+cha+SegundaParte;
		return nuevaCadena;

	}

	public String agregarCadenaEnPosicion(String caracter,int posicion) {

		String primerParte = this.getCadena().substring(0,posicion);
		String SegundaParte = this.getCadena().substring(posicion,getCadena().length());
		String nuevaCadena = primerParte+caracter+SegundaParte;
		return nuevaCadena;
	}

}
public class PruebaManipulacionCadena {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TDACadenaEspecialConString p = new TDACadenaEspecialConString("Instituto tecnologico superior de jerez");

		byte opcion;
		do {
			
			System.out.println("Cadena con la que se va a trabajar '"+p.getCadena()+"'\n¿Que desea realizar?");
			
			System.out.println("---------= OPERACIONES =---------");
			System.out.println("1) Invertir Cadena por letras");
			System.out.println("2) Invertir Cadena por palabras");
			System.out.println("3) Agregar un caracter en una posicion de la cadena");
			System.out.println("4) Agregar un palabra en una posicion de la cadena");
			System.out.println("========================");
			System.out.println("5) Salir");
			System.out.print("Elige una opcion: ");
			opcion = entrada.nextByte();

			switch (opcion) {
			case 1: 
				System.out.println("-------------------------------------------------------");
				
				String invertido = p.invertirCadenaPorLetras();
				
				System.out.println("invertido: "+invertido);
				System.out.println("-------------------------------------------------------\n");
				
			break;
			case 2: 
				
				System.out.println("-------------------------------------------------------");
				String x = p.invertirCadenaPorPalabra();
				
				System.out.println("invertido: "+x);
				System.out.println("-------------------------------------------------------\n");
				
			break;
			case 3: 
				
				System.out.println("-------------------------------------------------------");
				
				System.out.println("Caracter a agregar: ");
				String c = entrada.next();
				
				System.out.println("ingrese la posicion: ");
				int s = entrada.nextInt(); 
				System.out.println("Se agrego un caracter a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(c,s));
				
				System.out.println("-------------------------------------------------------\n");
				
			break;
			case 4: 
				
				System.out.println("-------------------------------------------------------");
				
				System.out.println("cadena a agregar: ");
				String b = entrada.next();
				
				System.out.println("ingrese la posicion: ");
				int t = entrada.nextInt(); 
				System.out.println("Se agrego un texto  a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(b,t));
				
				System.out.println("-------------------------------------------------------\n");
				
			break;
			case 5: break;
			default: System.out.println("Opcion incorrecta");break;
			}
		}while(opcion != 5);




/*
		// Prueba de metodos

		// Palabra invertida
		System.out.print("Palabra "+p.getCadena()+" invertida: ");
		System.out.println(p.invertirCadenaPorLetras());

		//Cadena invertida
		System.out.print("Cadena "+p.getCadena()+" invertida: ");
		System.out.println(p.invertirCadenaPorPalabra());

		//Agregar caracter en posicion
		System.out.println("Se agrego un caracter a la cadena");
		char x = 'X';
		System.out.println(p.agregarCaracterEnPosicion(x,10));

		//Agregar Cadena en posicion
		System.out.println("Se agrego una palabra a la cadena");
		String C = "==Hola a todos== ";
		System.out.println(p.agregarCadenaEnPosicion(C,10));
*/
	}

}
