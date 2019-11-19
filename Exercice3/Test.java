package Exercice3;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Valeur myVal = new Valeur(5);
		Runnable job1 = new Ajob(myVal,1);
		Runnable job2 = new Ajob(myVal,-1);
		new Thread(job1).start();
		new Thread(job2).start();
		System.out.println(myVal.getValeur());
		

	}

}


/*

 Q4// la valeur stockée par myVal à la fin du calcul est 5
 Q5// Les 2 threads job1 et job2 incrementent ou decrementent à la fois la valeur de l'objet MyVal, La concurrence
  	  se trouve dans le fait d'executer le maximum nombre d'incrementation( ou decrementation) successivement
 

*/