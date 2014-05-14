
public class Termin {
	
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
	
	//Atribute
	 private int jahr =  0;
	 private int monat =  0;
	 private int tag =  0;
	 private String uhrzeit =  new String();
	 private String ort =  new String();
	 private String beschreibung =  new String();
	 private Termin nextTermin = null;
	 
	 
	 //Methoden
	 //compareto
	 int compareTo( Termin x){  //return -1 wenn kleiner ,0 wenn gleich und 1 wenn größer
		 if (this.jahr < x.jahr){
			 return -1;
		 }
		 if (this.jahr > x.jahr){
			 return 1;
		 }
		 //spezial
		 if (this.jahr == x.jahr){
			 
			 if (this.monat < x.monat){
				 return -1;
			 }
			 if (this.monat > x.monat){
				 return 1;
			 }
			 if (this.monat == x.monat){
				 
				 if (this.tag < x.tag){
					 return -1;
				 }
				 if (this.tag > x.tag){
					 return 1;
				 }
				 if (this.tag == x.tag){
					 
				 }
			 }	 	 
			 
		 }
		 
		return 1; 
	 }
	//toString 
	public String toString(){
		
		String a =("Testausgabe jahr:"+ this.jahr  +"monat:" + this.monat + this.ort+this.tag+this.uhrzeit + this.beschreibung);
		
		return a;
	}

	public Termin getNextTermin() {
		// TODO Auto-generated method stub
		return this.nextTermin;
	}

	public void setNextTermin(Termin x) {
		// TODO Auto-generated method stub
		this.nextTermin = x;
	}

}
