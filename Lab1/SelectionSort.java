public class SelectionSort implements SortStrategy{
	public void getSortTime(long[] population) {
		long startTime = System.currentTimeMillis();
		System.out.println("Length is "+population.length);
		for (int i = 0; i < population.length-1; i++) {
			int min = i;
			for (int j = i+1; j < population.length; j++)
			if (population[j] < population[min]) min = j;
			long temp = population[i];
			population[i] = population[min];
			population[min] = temp;
			}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time taken by Selectionsort "+totalTime+" Milliseconds");
	}
} 


