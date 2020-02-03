public class InsertionSort implements SortStrategy{
	public void getSortTime(long[] population) {
		long startTime = System.currentTimeMillis();
		for (int i=1; i < population.length; i++)
		   {
		      long index = population[i];
		      int j = i;
		      while (j > 0 && population[j-1] > index)
		      {
		           population[j] = population[j-1];
		           j--;
		      }
		      population[j] = index;
		   } 
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time taken by Insertionsort "+totalTime+" Milliseconds");
	}
} 