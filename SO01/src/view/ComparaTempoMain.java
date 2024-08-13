package view;

import controller.ComparaTempoController;

public class ComparaTempoMain
{
 public static void main(String Args[])
 {
  ComparaTempoController CompT = new ComparaTempoController();

  int[] vetM = new int[1000];
  int[] vetD = new int[10000];
  int[] vetC = new int[100000];
 
 CompT.VerTempo(vetM, vetD, vetC);
 }
}
