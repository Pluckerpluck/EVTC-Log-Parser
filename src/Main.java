import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

    	// Make directories if they don't exist
        String cwd = System.getProperty("user.dir");    	
    	new File(cwd + "/logs").mkdirs();
    	new File(cwd + "/graphs").mkdirs();
    	new File(cwd + "/tables").mkdirs();	
    	
	    // File loop
    	File dir = new File(cwd + "/logs");
    	File[] logs = dir.listFiles();
    	if (logs != null) {
    		for (File log : logs) {	
        		// Menu loop
    	    	try(Scanner scanner = new Scanner(System.in)) {
//    	    		System.out.println("EVTC Log Visualizer\n"
//    	    				+ "-------------------\n"
//    	    				+ "1. Final DPS\n"
//    	    				+ "2. Phase DPS\n"
//    	    				+ "3. Graph Total Damage (not implemented)\n"
//    	    				+ "4. Misc. Combat Stats\n"
//    	    				+ "5. Final Boons/Buffs\n"
//    	    				+ "6. Phase Boons/Buffs (not implemented)\n"
//    	    				+ "7. Text Dump Tables\n"
//    	    				+ "8. Quit\n");
//    	    		System.out.println("Choose an option (Enter to confirm): ");
    	    		int choice = 1;
//    	    		int choice = scanner.nextInt();
    		        switch (choice) {
		            	case 8:
		            		// Quit.
		            		System.exit(0);
		            		break;
    		            case 1:
    		            case 2:
    		            case 3:
    		            case 4:
    		                // Damage Statistics
		            		Parse parser = new Parse(log);
		            		bossData b_data = parser.get_boss_data();
		            		List<playerData> p_data = parser.get_player_data();
		            		List<skillData> s_data = parser.get_skill_data();
//		            		System.out.println(b_data.getAgent());
//		            		System.out.println(b_data.getCID());
//		            		System.out.println(b_data.getDate());
//		            		System.out.println(b_data.getFightDuration());
//		            		System.out.println(b_data.getHP());
//		            		System.out.println(b_data.getName());
//		            		
//		            		for (playerData p : p_data){
//		            			System.out.println(p.getAgent());
//		            			System.out.println(p.getCID());
//		            			System.out.println(p.getName());
//		            			System.out.println(Arrays.toString(p.getName().getBytes()));
//		            			System.out.println(p.getProf());
//		            			System.out.println(p.getToughness());
//		            			System.out.println(p.getHealing());
//		            			System.out.println(p.getCondition());
//		            		}
//		            		
//		            		for (skillData s : s_data){
//	            				System.out.println(s.getID());
//	            				System.out.println(s.getName());
//		            		}
		            		
    		            	if(choice == 1){

    		            		
    		            	}
    		            	else if(choice == 2){
    		            		
    		            	}
    		            	else if(choice == 3){
    		            		
    		            	}
    		            	else if(choice == 4){
    		            		
    		            	}
    		                break;         
    		            case 5:
    		            case 6:
    		            	// Boon Statistics
    		            	if(choice == 5){
    		            		
    		            	}
    		            	else if(choice == 6){
    		            		
    		            	}
    		            	break;
    		            case 7:
    		                // Text Dump All Statistics
    		                break;
    		            default:
    		                System.out.println("Nope. Try again.\n");
    		        }	
    	      	}			
    		}
    	} else {
    		System.exit(0);
		}

	}

}
    
