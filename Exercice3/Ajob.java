package Exercice3;

public class Ajob implements Runnable{
	
	Valeur myVal;
	int i;
	public Ajob(Valeur myVal, int i) {
		this.myVal = myVal;
		this.i = i;
	}
	public void run()
	{
		for(int p=0;i<Math.pow(10, 2);p++) {
			myVal.add(i);
			System.out.println(myVal.valeur);
		}
		
	}
}
