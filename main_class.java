
public class main_class {

public static void main(String[] args){
	
	punkt punkt1 = new punkt(); //tworzenie pierwszego punktu konstruktorem domyœlnym

		punkt1.opis();          //metoda wyswietla "Punkt Materialny"
		System.out.println("Wartoœæ masy: "+ punkt1.getMasa()); //pobieranie wartosci masy
		punkt1.moment_glowny(); //metoda obliczajaca moment g³ówny
		punkt1.stainer(2);      //metoda obliczaj¹ca moment wzgledem nowej osi
		System.out.println();   //drukowanie czystej linii
		
		punkt1.setMasa(8);      //zmiana wartosci pierwszego punktu
		System.out.println("Wartoœæ masy: "+ punkt1.getMasa());
		punkt1.moment_glowny();
		punkt1.stainer(2);
		System.out.println();
		
		punkt punkt2 = new punkt(11);
		punkt2.opis();
		System.out.println("Wartoœæ masy: "+ punkt2.getMasa());
		punkt2.moment_glowny();
		punkt2.stainer(5);
		System.out.println();
		
punkt[] p = new punkt[4];         //tworzenie tablicy obiektów

for (int i =0; i<p.length ; i++) {	
	p[i] = new punkt(i);          //przypisywanie wartoœci kolejnym obiektom w tablicy
	p[i].opis();
	System.out.println("Wartoœæ masy: "+ p[i].getMasa());
	p[i].moment_glowny();
	p[i].stainer(10);
	System.out.println();
}

}
}
