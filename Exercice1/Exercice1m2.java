package Exercice1;

public class Exercice1m2 extends Thread{

	int valeur;
	int incre;
	public Exercice1m2(int valeur, int incre) {
		this.valeur = valeur;
		this.incre = incre;
	}
	public void run() {
		for(int i=0;i<1000;i++)
		{
			if(incre==1)
				System.out.println("TA: "+valeur);
				else
				System.out.println("                 TB      "+valeur);
				valeur += incre;
		}
	}
	public static void main(String[] args) {
		new Exercice1m2(1000,-1).start();
		new Exercice1m2(1,1).start();

	}

}
