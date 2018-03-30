package hello;

public class UtilNoteMain {

	public static void main(String[] args) {

		
		UtilNote utilNote = new UtilNote();
		int[] notes = {18,20,2,14,7,10};
		//int[] notes = {18,18,18,18,18,18}; 
		
		double moyenne = utilNote.calcMoyenne(notes);
		
		double min = utilNote.findMin(notes);
		double max = utilNote.findMax(notes);
		
		System.out.println("\t avg= "+moyenne+"\n min="+min+"\t\t\t max="+max);
		
		
		
	}

}
