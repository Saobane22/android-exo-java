package esgistp;

import java.nio.file.Paths;

public class Base {
	
	 Assistant[][] tab;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Les employés");
		Assistant Emp1=new Assistant(1001,"Jo","Ben","masculin","04/07/1999","Exterieur",255000,25480,55875,25874110,147852);
		Assistant Emp2=new Assistant(1001,"Jo","Ben","masculin","04/07/1999","Captif",255000,25480,55875,25874110,147852);
		Assistant Emp3=new Assistant(1001,"Jo","Ben","masculin","04/07/1999","Captif",255000,25480,55875,25874110,147852);
		Assistant Emp4=new Assistant(1001,"Jo","Ben","masculin","04/07/1999","Externe",255000,25480,55875,25874110,147852);
		
		
		//Tester les methodes
		Captif interne=null;
		double salaireInterne=interne.calculSalaire(2000, 254789);
		Exterieur externe=null;
		double salaireExterne=externe.calculSalaire(257895, 987452);
		Assistant emp=null;
		double Monsalaire=emp.calculSalaire(salaireInterne, salaireExterne)	;
		//mon fichier
		//Path fichier=Paths.get(chemin de depot);
		//Files.write(bill.txt,1001,"Bill","Jo","masculin","04/06/1999","Externe",255000,25480,55875,25874110,147852,StandardOpenOption.APPEND);
		
	}

}
