
public class punkt {


private int masa;
public int wmg;

public int getMasa(){  //akcesor  
return masa;
}

public punkt(){        //konstruktor domyslny
	masa=1;
}

public punkt(int masa){ //konstruktor z parametrem
  this.masa=masa;
}

public void setMasa(int m){  //mutator
  masa= m;
}

public void moment_glowny(){
wmg=0;
System.out.println("Wartosc momentu glownego: "+wmg);
}

public void stainer(int dlugosc){
int moment_stainer=wmg+masa*dlugosc*dlugosc;
System.out.println("Moment bezw³adnoœci wzgledem osi: "+moment_stainer);
}

public void opis(){
System.out.println("Punkt materialny");
}

}
