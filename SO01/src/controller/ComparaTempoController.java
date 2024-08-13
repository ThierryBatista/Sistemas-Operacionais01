package controller;

public class ComparaTempoController 
{
	public ComparaTempoController()
	 {
	 super();
	 }
	 
	public void VerTempo(int[]vetM, int[]vetD, int[]vatC)
	 {
	 int i = 0;
	 
	 long inicio = System.nanoTime();

	 for (i = 0; i < 1000; i++)
	  {
	  vetM[i] = 0;
	  }
	 long fim = System.nanoTime();

	 System.out.println(" A duração da operação com 1000 posições é de " + (fim - inicio) / Math.pow(10,9) + " segundos");

	 long beginning = System.nanoTime();

	 for (i = 0; i < 10000; i++)
	  {
	  vetD[i] = 0;
	  }
	 long end = System.nanoTime();

	 System.out.println(" A duração da operação com 10000 posições é de " + (end - beginning) / Math.pow(10,9) + " segundos");

	 long radoken = System.nanoTime();

	 for (i = 0; i < 10000; i++)
	  {
	  vetD[i] = 0;
	  }
	 long soryuken = System.nanoTime();

	 System.out.println(" A duração da operação com 100000 posições é de " + (soryuken - radoken)/ Math.pow(10,9) + " segundos");

	 }

}
