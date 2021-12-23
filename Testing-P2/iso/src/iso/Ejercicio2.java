package iso;

public class Ejercicio2 {
	
	public static void main(String []args) {
		double precio;
		int IA=150, edad=21, contacto=16;
		boolean enferma=false, sintomas=false, covid=true, imprescindible=false;
		int caso;
		caso=calculaCaso(IA);
		precio=calcula(edad, contacto, imprescindible, enferma, covid, sintomas, caso);
		
		System.out.println("El precio del billete es: "+precio);
	}	
	
	public static int calculaCaso(int IA) {
		int caso;
		if(IA < 100) {
			caso = 0;
		}else if(IA>99 && IA<201){
			caso = 1;
		}else if(IA >  200 &&  IA < 301) {
			caso = 2;
		}else if(IA >300 && IA < 501) {
			caso = 3;
		}else {
			caso = 4;
		}
    	return caso;
	}


	public static double calcula(int edad, int contacto, boolean imprescindible, boolean enferma, boolean covid, boolean sintomas, int caso) {
		double precio=80;
		double plazas=100;
		if(contacto<10||enferma==true||sintomas==true) {
			System.out.println("No puedes viajar");
			return 0;
		}
		switch(caso) {
		case 0:
			System.out.println("Quedan "+plazas+" disponibles.");
			if(edad<23) {
				precio=precio-precio*0.6;
			}
			if(edad>65) {
				precio = precio-precio*0.8;
			}
			break;
		case 1:
			plazas=plazas-plazas*0.8;
			System.out.println("Quedan "+plazas+" disponibles.");
			if(edad<23) {
				precio=precio-precio*0.3;
			}
			if(edad>65) {
				precio = precio-precio*0.5;
			}
			break;
		case 2:
			plazas=plazas-plazas*0.6;
			System.out.println("Quedan "+plazas+" disponibles.");
			System.out.println("Quedan "+plazas*0.6+" disponibles para imprescindibles.");
			plazas=plazas-plazas*0.6;
			System.out.println("Quedan "+plazas+" disponibles para no imprescindibles.");
			if(edad>65) {
				precio = precio+precio*0.2;
			}
			break;
		case 3:
			plazas=plazas-plazas*0.4;
			System.out.println("Quedan "+plazas+" disponibles.");
			System.out.println("Quedan "+plazas*0.8+" disponibles para imprescindibles.");
			System.out.println("Quedan "+plazas+" disponibles para no imprescindibles.");
			if(imprescindible==true) {
				plazas--;
			}else {
				plazas=plazas-plazas*0.8;
			}
			
			
			if(edad<23) {
				precio=precio+precio*0.2;
			}
			if(edad>65) {
				precio = precio+precio*0.5;
			}
			break;
		case 4:
			plazas=plazas-plazas*0.3;
			System.out.println("Quedan "+plazas+" disponibles.");
			System.out.println("Quedan "+plazas*0.9+" disponibles para imprescindibles.");
			plazas=plazas-plazas*0.9;
			System.out.println("Quedan "+plazas+" disponibles para no imprescindibles.");
			
			if(edad<23) {
				precio=precio+precio*0.5;
			}
			if(edad>65) {
			System.out.println("No puedes viajar");
			return 0;
			}
			break;
		}
		
		return precio;
	}
}
