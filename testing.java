import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class testing {
	int counter;
	int number=0;
	int selection;
	int masuk = 0;
	
	private Queue<String> GeneralQueue = new LinkedList<String>();
	private Queue<String> TechnicalQueue = new LinkedList<String>();
	private Queue<String> BillPayQueue = new LinkedList<String>();
	
	public int gererateNumber(int selection)
    {
       
       if(selection==1){
        number = 100+this.GeneralQueue.size()+1;
        this.GeneralQueue.add(Integer.toString(number));
        System.out.println(this.GeneralQueue);
            try {
                PrintWriter a =  new PrintWriter(new FileOutputStream("General.txt",true));
                a.println(number);
                a.close();
                
            } catch (Exception e) {}
        //currentGeneral++;
            }
	return number;
       }
	
	 public String selectOption(){
		 
		    Scanner input =  new Scanner(System.in);
		        System.out.println("Please select an option from the list\n1. General list\n2. Technical "
		        		+ "\n3. Biling and payment\n4. Back");
		        int selection = input.nextInt();
		        switch(selection){
		        case 1:
//		        	this.selection = 1;
//		            break;
		            return "General list";
		        case 2:
//		        	this.selection = 2;
//		            break;
		        	return "Technical";
		        case 3:
//		        	this.selection = 3;
//		            break;
		        	return "Biling and payment";
		        case 4:
		            selectOption();
//		            break();
		        default:
//		        	selectOption();
//		            break;
		        	return "default";
		        }
		    }
	 
	 public int gererateNumber2(int selection)
	    {
	       
		 if(selection==2){
		        number = 200+this.TechnicalQueue.size()+1;
		        this.TechnicalQueue.add(Integer.toString(number));
		        try {
		                PrintWriter a =  new PrintWriter(new FileOutputStream("Technical.txt",true));
		                a.println(number);
		                a.close();
		            } catch (Exception e) {
		            }
	            }
		return number;
	       }
	 
	 public int gererateNumber3(int selection)
	    {
	       
		 if(selection==3){
			    
		        number = 300+this.BillPayQueue.size()+1;
		        this.BillPayQueue.add(Integer.toString(number));
		         try {
		                PrintWriter a =  new PrintWriter(new FileOutputStream("Biling.txt",true));
		                a.println(number);
		                a.close();
		            } catch (Exception e) {
		            }
	            }
		return number;
	       }
	}


