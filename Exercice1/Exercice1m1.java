package Exercice1;
public class Exercice1m1 implements Runnable{
	int valeur;
	int incre;
	public Exercice1m1(int valeur, int incre) {
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
		Runnable TA = new Exercice1m1(1000, -1);
		Runnable TB = new Exercice1m1(1, 1);
		new Thread(TA).start();
		new Thread(TB).start();

	}

}