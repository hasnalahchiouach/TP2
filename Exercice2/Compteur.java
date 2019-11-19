package Exercice2;

public class Compteur extends Thread{
	String nom;
	int maxValue;
	public Compteur(String nom, int maxValue) {
		this.nom = nom;
		this.maxValue = maxValue;
	}
	public void run() {
		for(int i=1;i<=maxValue;i++)
		{
			System.out.println(nom+" "+i);
			try {
				sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
