public class BubbleSort implements SortStrategy{
	public void getSortTime(long[] population) {
		long startTime = System.currentTimeMillis();
		for (int i = (population.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
			if (population[j-1] > population[j]) {
			long temp = population[j-1]; population[j-1] = population[j]; population[j] = temp;
			} }
			}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time taken by Bubblesort "+totalTime+" Milliseconds");
	}
} 