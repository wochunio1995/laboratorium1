
public class main_class {

public static void main(String[] args){
	
	punkt punkt1 = new punkt(); //tworzenie pierwszego punktu konstruktorem domy�lnym

		punkt1.opis();          //metoda wyswietla "Punkt Materialny"
		System.out.println("Warto�� masy: "+ punkt1.getMasa()); //pobieranie wartosci masy
		punkt1.moment_glowny(); //metoda obliczajaca moment g��wny
		punkt1.stainer(2);      //metoda obliczaj�ca moment wzgledem nowej osi
		System.out.println();   //drukowanie czystej linii
		
		punkt1.setMasa(8);      //zmiana wartosci pierwszego punktu
		System.out.println("Warto�� masy: "+ punkt1.getMasa());
		punkt1.moment_glowny();
		punkt1.stainer(2);
		System.out.println();
		
		punkt punkt2 = new punkt(11);
		punkt2.opis();
		System.out.println("Warto�� masy: "+ punkt2.getMasa());
		punkt2.moment_glowny();
		punkt2.stainer(5);
		System.out.println();
		
punkt[] p = new punkt[4];         //tworzenie tablicy obiekt�w

for (int i =0; i<p.length ; i++) {	
	p[i] = new punkt(i);          //przypisywanie warto�ci kolejnym obiektom w tablicy
	p[i].opis();
	System.out.println("Warto�� masy: "+ p[i].getMasa());
	p[i].moment_glowny();
	p[i].stainer(10);
	System.out.println();
}

}
}
