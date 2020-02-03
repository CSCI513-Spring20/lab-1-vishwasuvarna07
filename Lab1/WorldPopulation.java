import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class WorldPopulation{

	static SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new SelectionSort(); // Set the default strategy here.
	}
	
	public void readInputFile(){
		population = readPopulationFile("Lab1//WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		int counter = 0;
	  try {
		  FileReader inputFile = new FileReader(fileName);
		  BufferedReader reader = new BufferedReader(inputFile);
		  while((reader.readLine()) != null) {
		  String line = reader.readLine();
			  StringTokenizer tokenizer = new StringTokenizer(line,",");
			  tokenizer.nextToken();
			  tokenizer.nextToken();
			  String pop = tokenizer.nextToken();
			  long popcount = Long.parseLong(pop);	
			  population[counter++] = popcount;
		  }
		 
		  reader.close();
	  }
	  catch(Exception e) {
		  System.out.println("Exception occured "+e);
	  }
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(){	
		sortStrategy.getSortTime(population);
		
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new InsertionSort()); 
		worldPopulation.sortPopulation();
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new SelectionSort());
		worldPopulation.sortPopulation();
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new BubbleSort());
		worldPopulation.sortPopulation();
	}

}
