import java.util.GregorianCalendar;
public class Termin implements Comparable <Termin> {

	
	public Termin(){
		
	}
	
    public Termin(int y,int m,int d,String u,String o,String b){ //Termin wird erstellt
		this.jahr = y;
		this.monat = m;
		this.tag = d;
		this.uhrzeit = u;
		this.ort = o;
		this.beschreibung = b;
	}
     // main
    
    
    
    



	//Atribute
	 private int jahr =  0;
	 private int monat =  0;
	 private int tag =  0;
	 private String uhrzeit =  new String();
	 private String ort =  new String();
	 private String beschreibung =  new String();
	 private Termin  nextTermin = null;
	 private String[] a = uhrzeit.split(":")  ;
	
	 GregorianCalendar calendar = new GregorianCalendar(jahr,monat,tag,Integer.parseInt(a[0]),Integer.parseInt(a[1]));
	 //Methoden
	 public void setNextTermin(Termin y){
		 this.nextTermin = y;
		 
	 }
	 public Termin getNextTermin(){
		 return nextTermin;
	 }
	 
	 //compareto
	 public int compareTo( Termin x){  //return -1 wenn kleiner ,0 wenn gleich und 1 wenn größer
		 if (calendar.compareTo(x.calendar )< 0){
			 return -1;
		 } else if (calendar.compareTo(x.calendar )== 0){
			 return 0;
		 } else if (calendar.compareTo(x.calendar )> 0){
			 return 1;
		 } else {
			 return 1;
		 }
		 
		
	 }
	//toString 
	public String toString(){
		
		String a =String.format("%n Testausgabe jahr:"+ this.jahr + "%20" +"monat:" + this.monat + "%20" + this.ort+ "%20" +this.tag+ "%20" +this.uhrzeit + "%20" + this.beschreibung);
		
		return a;
	}
	
	
	
	
	

}
