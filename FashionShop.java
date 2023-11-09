import java.util.*;
class FashionShop{
	
	public static Scanner input = new Scanner(System.in);
	
//=============Arrays===========//
	public static String[] orderIdAr = new String[0];
	public static int[] qtyAr = new int[0];
	public static String[] pNumberAr = new String[0];
	public static String[] sizeAr = new String[0];
	public static double[] amountAr = new double[0];
	public static double[] priceOfSizeAr = new double[0];
	public static String[] statusAr = new String[0];
	
//============ Extend Arrays =======================//
	public static void extendArrays(){
		
		String[] orderIdTempAr = new String[orderIdAr.length+1];
		String[] pNumberTempAr  = new String[pNumberAr.length+1];
		int[] qtyTempAr = new int [qtyAr.length+1];
		String[] sizeTempAr = new String[sizeAr.length+1];
		double[] amountTempAr = new double[amountAr.length+1];
		double[] priceOfSizeTempAr = new double [priceOfSizeAr.length+1];
		String[] statusTempAr = new String[statusAr.length+1];
		
		for (int i = 0; i < orderIdAr.length; i++){
			
			orderIdTempAr[i] = orderIdAr[i];
			pNumberTempAr[i] = pNumberAr[i];
			qtyTempAr[i] = qtyAr[i];
			sizeTempAr[i] = sizeAr[i];
			amountTempAr[i] = amountAr[i];
			priceOfSizeTempAr[i] = priceOfSizeAr[i];
			statusTempAr[i] = statusAr[i];
			
		}
		
		orderIdAr = orderIdTempAr;
		pNumberAr = pNumberTempAr;
		qtyAr = qtyTempAr;
		sizeAr = sizeTempAr;
		amountAr = amountTempAr;
		priceOfSizeAr = priceOfSizeTempAr;
		statusAr = statusTempAr;
	}
	
	
	public static void main(String args[]){
		mainMenu();
	}
	
//======== Main Menu ======================//
	public static void mainMenu(){
		
		System.out.println("                                                                                                                         ");
 		System.out.println("\t\t\t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                                   ");
		System.out.println("\t\t\t| $$_____/                | $$      |__/                           /$$__  $$| $$                                   ");
		System.out.println("\t\t\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$         ");
		System.out.println("\t\t\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$         ");
		System.out.println("\t\t\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$  ");
		System.out.println("\t\t\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$       ");
		System.out.println("\t\t\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/         ");
		System.out.println("\t\t\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/      ");
        System.out.println("\t\t\t                                                                                                | $$               ");
		System.out.println("\t\t\t                                                                                                | $$               ");
		System.out.println("\t\t\t                                                                                                |__/               ");
		System.out.println("                                                                                                                         ");
		System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------        ");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.print("\t\t\t\t\t [1] Place Order ");
		System.out.println("\t\t\t\t [2] Search Customer ");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t [3] Search Order ");
		System.out.println("\t\t\t\t [4] View Reports  ");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t [5] Change Order Status ");
		System.out.println("\t\t\t [6] Delete Order "); 
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.print("\t\t\t  Input option :  ");
		int num=input.nextInt();
		
		switch(num){
					case 1: clearConsole();placeOrder();break;
					case 2: clearConsole();searchCustomer();break;
					case 3: clearConsole();searchOrder();break;
					case 4: clearConsole();viewReports();break;
					case 5: clearConsole();changeOrderStatus();break;
					case 6: clearConsole();deleteOrder();break;
					default : 
							clearConsole();
							mainMenu();
				}
	}
//============== validpNumber =============//
	public static boolean validpNumber(String pNumber){
		return (pNumber.length()==10 && pNumber.charAt(0)=='0');
	}
	
// ============== validSize ===============//
	public static boolean validSize(String size){
		return (size.equals("xs") || size.equals("s") || size.equals("m") || size.equals("l") || size.equals("xl") || size.equals("xxl"));
	}
	
			
//========== placeOrder ==========//

	public static void placeOrder(){
			
		L1:do{
				System.out.println("                                                                 ");
				System.out.println("\t\t   _____  _                   ____          _                ");
				System.out.println("\t\t  |  __ \\| |                 / __ \\        | |             ");  
				System.out.println("\t\t  | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __      ");
				System.out.println("\t\t  |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|   ");
				System.out.println("\t\t  | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |        ");
				System.out.println("\t\t  |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|  ");
				   
				System.out.println("\n");
				System.out.println("\n");
				
				System.out.println("\t\t_________________________________________________________    "); 
				
				System.out.println("\n");
				System.out.println("\n");
				
				String id = generateId();
				System.out.println("\t\t Enter Order ID : "+id);
				System.out.println("\n");
				
			L2:do{
					System.out.print("\t\t Enter Customer Phone Number : ");
					String pNumber = input.next();
					
					
					
					if (!validpNumber(pNumber)){
						System.out.println("\n");
						System.out.println("\t\t\tInvalid Phone Number...Try again");
						System.out.println("\n");
						System.out.print("\t\t Do you want to enter phone number again ? (y/n) : ");
						String yn = input.next().toLowerCase();
						
						if (yn.equals("y")){
							// Move the cursor up seven lines
							System.out.print("\033[7A");
							// Clear the lines
							System.out.print("\033[0J");
							continue L2;
						}else{
							clearConsole();
							mainMenu();
						}
					
					}
				
				L3:do{
					System.out.println("\n");
					System.out.print("\t\t Enter T-shirt Size (XS/S/M/L/XL/XXL) : ");
					String size = input.next().toLowerCase();
					
					double sizePrice=0;
					if (size.equals("xs")){
						sizePrice = 600.00;
					}else if (size.equals("s")){
						sizePrice = 800.00;
					}else if (size.equals("m")){
						sizePrice = 900.00;
					}else if (size.equals("l")){
						sizePrice = 1000.00;
					}else if (size.equals("xl")){
						sizePrice = 1100.00;
					}else if (size.equals("xxl")){
						sizePrice=1200.00;
					}
					
					if(!validSize(size)){
							// Move the cursor up three lines
							System.out.print("\033[3A");
							// Clear the lines
							System.out.print("\033[0J");
							continue L3;
					
					}
					
					System.out.println("\n");
					System.out.print("\t\t Enter QTY : ");
					int qty=input.nextInt();
					
					System.out.println("\n");
					System.out.println("\t\t Amount : "+(qty*sizePrice));
					System.out.println("\n");
					
					
					System.out.print("\t\t Do you want to placed this order ? (Y/N) : ");
					String option1=input.next().toLowerCase();
					
					if(!option1.equals("y")){
						System.out.println("\n");
						System.out.print("\t\t Do you want to placed another order ? (Y/N) : ");
						String option2=input.next().toLowerCase();
						if (option2.equals("y")){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							mainMenu();
						}
					}
					
					extendArrays();
					
					priceOfSizeAr[priceOfSizeAr.length-1]=sizePrice;
					orderIdAr[orderIdAr.length-1]=id;
					statusAr[statusAr.length-1]="PROCESSING";
					pNumberAr[pNumberAr.length-1]=pNumber;
					qtyAr[qtyAr.length-1]=qty;
					sizeAr[sizeAr.length-1]=size.toLowerCase();
					amountAr[amountAr.length-1]=sizePrice*qty;
						
					System.out.println("\n");
					System.out.println("\t\t\t Order Placed...!");
					System.out.println("\n");
					System.out.print("\t\t Do you want to place another order (Y/N) : ");
					String yn = input.next().toLowerCase();
					
					if (yn.equals("y")){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						mainMenu();
					}
					
				}while(true);
				
			}while(true);
			
		}while(true);
	}
	
//-------------------------------------------------------------------
	
	public static void getCustomerDetails(String pNumber2){
		int[] qtyTemp2Ar=new int[6];
		double[] amountTemp2Ar=new double[6];
	
		
		for (int i = 0; i <orderIdAr.length; i++){
			if (pNumberAr[i].equals(pNumber2)){
				if(sizeAr[i].equals("xs")){
					qtyTemp2Ar[0]+=qtyAr[i];
					amountTemp2Ar[0]+=amountAr[i];
				}else if(sizeAr[i].equals("s")){
					qtyTemp2Ar[1]+=qtyAr[i];
					amountTemp2Ar[1]+=amountAr[i];
				}else if(sizeAr[i].equals("m")){
					qtyTemp2Ar[2]+=qtyAr[i];
					amountTemp2Ar[2]+=amountAr[i];
				}else if(sizeAr[i].equals("l")){
					qtyTemp2Ar[3]+=qtyAr[i];
					amountTemp2Ar[3]+=amountAr[i];
				}else if(sizeAr[i].equals("xl")){
					qtyTemp2Ar[4]+=qtyAr[i];
					amountTemp2Ar[4]+=amountAr[i];
				}else if(sizeAr[i].equals("xxl")){
					qtyTemp2Ar[5]+=qtyAr[i];
					amountTemp2Ar[5]+=amountAr[i];
				}
			}else{
				 continue;
			}
		}
			 int total=0;
			for(int i=0;i<6;i++){
				total+=amountTemp2Ar[i];
			}
			
			
			System.out.println("\t\t\t+--------------------------------------------------------------+");
			
			System.out.printf("\t\t\t|%-20s|%-20s|%-20s|","  Size","  Qty","  Amount");
			
			System.out.println("\n\t\t\t+--------------------------------------------------------------+");
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  XS",qtyTemp2Ar[0],amountTemp2Ar[0]);
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  S",qtyTemp2Ar[1],amountTemp2Ar[1]);
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  M",qtyTemp2Ar[2],amountTemp2Ar[2]);
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  L",qtyTemp2Ar[3],amountTemp2Ar[3]);
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  XL",qtyTemp2Ar[4],amountTemp2Ar[4]);
			
			System.out.printf("\t\t\t|%-20s|  %-18d|  %-18.2f|\n","  XXL",qtyTemp2Ar[5],amountTemp2Ar[5]);
			
			System.out.println("\t\t\t+--------------------------------------------------------------+");
			System.out.printf("\t\t\t| %-40s|  %-18d|","  Total Amount",total);
			System.out.println("\n\t\t\t+--------------------------------------------------------------+");
		
	}
	
		
//============ searchCustomer ============//

	public static void searchCustomer(){
		
			L4:do{
			
			System.out.println("\t\t   _____                     _        _____          _                                       ");
			System.out.println("\t\t  / ____|                   | |      / ____|        | |                                      ");
			System.out.println("\t\t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __            ");
			System.out.println("\t\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|    ");
			System.out.println("\t\t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |            ");
			System.out.println("\t\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|      ");
			System.out.println("\n");
			System.out.println("\t\t___________________________________________________________________________________          ");
			
			System.out.println("\n");
			System.out.println("\n");
			
			System.out.println("");
			System.out.print("\t\t\t Enter Customer Phone Number : ");
			String pNumber2=input.next();
			
			if (!validpNumber(pNumber2)){
				
					System.out.println("\t\t\t\tInvalid Number....Try Again..");
					System.out.println("");
					System.out.print("\t\t\tDo you want to search another customer report ? (Y/N) : ");
					String yn=input.next().toLowerCase();
					
					if (yn.equals("y")){
						//Move the cursor up four lines 
						System.out.print("\033[4A");
						//Clear lines
						System.out.print("\033[0J");
						continue L4;
					}else{
						clearConsole();
						mainMenu();
					}
				}
				
					getCustomerDetails(pNumber2);
					
					System.out.println("\n");
					System.out.println("\n");
					
					System.out.print("\t\t\tDo you want to search another customer report ? (Y/N) : ");
					String yn=input.next().toLowerCase();
						
						if (yn.equals("y")){
							//Move the cursor up four lines 
							System.out.print("\033[29A");
							//Clear lines
							System.out.print("\033[0J");
							continue L4;
						}else{
							clearConsole();
							mainMenu();
						}
		} while (true);
		
	}
		
//========= validOrderIdCheck =========//
	public static boolean validOrderIdCheck(String orderId){
		return(orderId.length()==9 && orderId.charAt(0)=='O' && orderId.charAt(1)=='D' && orderId.charAt(2)=='R' && orderId.charAt(3)=='#' );
	}
	
//========= validOrderIdCheck1 =========//
	public static boolean validOrderIdCheck1(String orderId2){
		return(orderId2.length()==9 && orderId2.charAt(0)=='O' && orderId2.charAt(1)=='D' && orderId2.charAt(2)=='R' && orderId2.charAt(3)=='#' );
	}
	
	
//============ Search order ===========//		
	public static void searchOrder(){
			
		//Display search order
			System.out.println("\t\t   _____                     _        ____          _                   ");
			System.out.println("\t\t  / ____|                   | |      / __ \\        | |                 ");
			System.out.println("\t\t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __         ");
			System.out.println("\t\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|   ");
			System.out.println("\t\t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |           ");
			System.out.println("\t\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|     ");
			System.out.println("\n");
			
			System.out.println("\t\t__________________________________________________________________     "); 
        
       L5:do{
		   
			System.out.println("\n");
			System.out.println("\n");
			
			System.out.print("\t\t\tEnter Order ID : ");
			String orderId1=input.next();
			
			System.out.println("\n");
			                                                        
			int index=0;
			if (validOrderIdCheck(orderId1)){
				
				for (int i = 0; i < orderIdAr.length; i++){
					if (orderIdAr[i].equals(orderId1)){
						index=i;
					}
				}
				
				System.out.println("\t\t\tPhone Number : "+pNumberAr[index]);
				System.out.println("\t\t\tSize         : "+sizeAr[index]);
				System.out.println("\t\t\tQTY          : "+qtyAr[index]);
				System.out.println("\t\t\tAmount       : "+amountAr[index]);
				System.out.println("\t\t\tStatus       : "+statusAr[0]);
				
				System.out.println("\n"); 
				
				System.out.print("\t\t\tDo you want to search another  order ? (Y/N) : ");
				String option5=input.next().toLowerCase();
				
				if (option5.equals("y")){
							//Move the cursor up four lines 
							System.out.print("\033[15A");
							//Clear lines
							System.out.print("\033[0J");
							continue L5;
						}else{
							clearConsole();
							mainMenu();
						}
			}else{
				System.out.println("\t\t\t\tInvalid ID ......");
				System.out.println("");  
				System.out.print("\t\t\tDo you want to search another order ? (Y/N) : ");
				String option6=input.next().toLowerCase();
				if (option6.equals("y")){
							//Move the cursor up four lines 
							System.out.print("\033[10A");
							//Clear lines
							System.out.print("\033[0J");
							continue L5;
						}else{
							clearConsole();
							mainMenu();
						}
			}
			
		}while(true);
		
	}
	
// ========= viewReports ================//

	public static void viewReports(){
			
		System.out.println("\t\t\t  _____                       _                 ");
		System.out.println("\t\t\t |  __ \\                     | |               ");
		System.out.println("\t\t\t | |__) |___ _ __   ___  _ __| |_ ___           ");
		System.out.println("\t\t\t |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|       ");
		System.out.println("\t\t\t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\      ");
		System.out.println("\t\t\t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/      ");
		System.out.println("\t\t\t            | |                                 ");
		System.out.println("\t\t\t            |_|                                 ");
		  
		System.out.println("\n");
		
		System.out.println("\t\t_______________________________________________    "); 
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("\t\t\t\t[1] Customer Reports");
		System.out.println("\n");
		System.out.println("\t\t\t\t[2] Item Reports");
		System.out.println("\n");
		System.out.println("\t\t\t\t[3] Orders Reports");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.print("\t\t\tEnter Option  : ");
		int num1 = input.nextInt();
		
		switch(num1){
					case 1: clearConsole();customerReports();break;
					case 2: clearConsole();itemReports();break;
					case 3: clearConsole();ordersReports();break;
					default : 
							clearConsole();
							mainMenu();
				}
				
	}
	
//=========== Customer Reports =============//
	
	public static void customerReports(){
		
		System.out.println("\t\t   _____          _                              _____                       _                    ");
		System.out.println("\t\t  / ____|        | |                            |  __ \\                     | |                  ");
		System.out.println("\t\t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___              ");
		System.out.println("\t\t | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|       ");
		System.out.println("\t\t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\       ");
		System.out.println("\t\t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/    ");
		System.out.println("\t\t                                                           | |                                    ");
		System.out.println("\t\t                                                           |_|                                    ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________________  ");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("\t\t\t\t[1] Best in Customers");
		System.out.println("\n");
		System.out.println("\t\t\t\t[2] View Customer");
		System.out.println("\n");
		System.out.println("\t\t\t\t[3] All Customer Report");
		System.out.println("\n");
		
		System.out.print("\t\t\tEnter Option  : ");
		int num2 = input.nextInt();
		
		switch(num2){
					case 1: clearConsole(); bestInCustomers();break;
					case 2: clearConsole(); viewCustomer();break;
					case 3: clearConsole(); allCustomerReport();break;
					default : 
							clearConsole();
							viewReports();
					}
					
	}
	
//========= Best in Customers ===========//
	
	public static void bestInCustomers(){
		
		System.out.println("\t\t  ____            _     _____          _____          _                                          ");
		System.out.println("\t\t |  _ \\          | |   |_   _|        / ____|        | |                                        ");  
		System.out.println("\t\t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___           ");
		System.out.println("\t\t |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|     ");
		System.out.println("\t\t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\    ");
		System.out.println("\t\t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/   ");
		   
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________________  ");
		
		String[] pNumberArTemp1  = new String[0];
		int[] qtyArTemp1 = new int [0];
		double[] amountArTemp1 = new double[0];
		
		L1:for(int i=0; i<pNumberAr.length; i++){
			for(int j=0; j<pNumberArTemp1.length; j++){
				if(pNumberAr[i].equals(pNumberArTemp1[j])){
					qtyArTemp1[j]+=qtyAr[i];
					amountArTemp1[j]+=amountAr[i];
					continue L1;
				}
			}
			
			pNumberArTemp1 = extendArraysString(pNumberArTemp1);
			pNumberArTemp1[pNumberArTemp1.length-1] = pNumberAr[i];
			qtyArTemp1 = extendArraysInt(qtyArTemp1);
			qtyArTemp1[qtyArTemp1.length-1] = qtyAr[i];
			amountArTemp1 = extendArraysDouble(amountArTemp1);
			amountArTemp1[amountArTemp1.length-1]=amountAr[i];
			
		}
		
		for(int i=0; i<pNumberArTemp1.length-1; i++){
			for(int j=i+1; j<pNumberArTemp1.length; j++){
				if(qtyArTemp1[i]<qtyArTemp1[j]){
					int t1=qtyArTemp1[i];
					qtyArTemp1[i]=qtyArTemp1[j];
					qtyArTemp1[j]=t1;
					
					String t2=pNumberArTemp1[i];
					pNumberArTemp1[i]=pNumberArTemp1[j];
					pNumberArTemp1[j]=t2;
					
					
					double t3=amountArTemp1[i];
					amountArTemp1[i]=amountArTemp1[j];
					amountArTemp1[j]=t3;
				}
			}
		}
		
		System.out.println("\n\t\t\t+-----------------+----------+--------------+");
		System.out.println("\t\t\t|   Customer Id   |  All QTY |  Total Amount|");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		for (int i = 0; i < qtyArTemp1.length; i++){
			System.out.println("\t\t\t|                 |          |              |");
			System.out.printf("\t\t\t|  %-15s|%7d   |%-13.2f |",pNumberArTemp1[i],qtyArTemp1[i],amountArTemp1[i]);
			System.out.println();
		}
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		System.out.println("\n");
		System.out.println("\n");
		
		L2:do{
		
				System.out.print("\t\t\tTo access Main Menu,Please enter 0 :");
				String ac=input.next();
				
				if(ac.equals("0")){
					clearConsole();
					mainMenu();
				}else{
					// Move the cursor up five lines
					System.out.print("\033[1A");
					// Clear the lines
					System.out.print("\033[0J");
					continue L2;
				}
			
			}while(true);
	
	}
	
//=========== viewCustomer ==================//

	public static void viewCustomer(){
		
		System.out.println("\t\t __      ___                  _____          _                                                   ");
		System.out.println("\t\t \\ \\    / (_)                / ____|        | |                                                ");
		System.out.println("\t\t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___                  ");
		System.out.println("\t\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|           ");
		System.out.println("\t\t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\             ");
		System.out.println("\t\t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/          ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________________  ");
		
		
		String[] pNumberArTemp1  = new String[0];
		int[] qtyArTemp1 = new int [0];
		double[] amountArTemp1 = new double[0];
		
		L1:for(int i=0; i<pNumberAr.length; i++){
			for(int j=0; j<pNumberArTemp1.length; j++){
				if(pNumberAr[i].equals(pNumberArTemp1[j])){
					qtyArTemp1[j]+=qtyAr[i];
					amountArTemp1[j]+=amountAr[i];
					continue L1;
				}
			}
			
			pNumberArTemp1 = extendArraysString(pNumberArTemp1);
			pNumberArTemp1[pNumberArTemp1.length-1] = pNumberAr[i];
			qtyArTemp1 = extendArraysInt(qtyArTemp1);
			qtyArTemp1[qtyArTemp1.length-1] = qtyAr[i];
			amountArTemp1 = extendArraysDouble(amountArTemp1);
			amountArTemp1[amountArTemp1.length-1]=amountAr[i];
			
		}
		
		System.out.println("\n\t\t\t+-----------------+----------+--------------+");
		System.out.println("\t\t\t|   Customer Id   |  All QTY |  Total Amount|");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		
		for (int i = 0; i < qtyArTemp1.length; i++){
			System.out.println("\t\t\t|                 |          |              |");
			System.out.printf("\t\t\t|  %-15s|%7d   |%-13.2f |",pNumberArTemp1[i],qtyArTemp1[i],amountArTemp1[i]);
			System.out.println();
		}
		System.out.println("\t\t\t+-----------------+----------+--------------+\n\n");
		
		
		
		
		L2:do{
		
				System.out.print("\t\t\tTo access Main Menu,Please enter 0 :");
				String ac=input.next();
				
				if(ac.equals("0")){
					clearConsole();
					mainMenu();
				}else{
					// Move the cursor up five lines
					System.out.print("\033[1A");
					// Clear the lines
					System.out.print("\033[0J");
					continue L2;
				}
			
			}while(true);
		
		
	
	}
	
	
	public static final double xs = 600.00;
	public static final double s = 800.00;
	public static final double m = 900.00;
	public static final double l = 1000.00;
	public static final double xl = 1100.00;
	public static final double xxl = 1200.00;
	
	
	public static void allCustomerReport(){
		
		System.out.println("\n");
		System.out.println("\t\t           _ _    _____          _                              _____                       _                 ");
		System.out.println("\t\t     /\\   | | |  / ____|        | |                            |  __ \\                     | |              ");
		System.out.println("\t\t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_              ");
		System.out.println("\t\t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|      ");
		System.out.println("\t\t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_          ");
		System.out.println("\t\t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|   ");
		System.out.println("\t\t                                                                          | |                                 ");
		System.out.println("\t\t                                                                          |_|                                 ");
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________________  ");
		System.out.println("\n");
		System.out.println("\n");
		
		String[] phoneNumberAr = new String[0];
		
		if (pNumberAr.length>0){
			L1:for (int i = 0; i < pNumberAr.length; i++){
				
				for (int j = 0; j < phoneNumberAr.length; j++){
					if (pNumberAr[i].equals(phoneNumberAr[j])){
						
						continue L1;
					}
				}
				
				phoneNumberAr = extendArraysString(phoneNumberAr); 
				phoneNumberAr[phoneNumberAr.length-1] = pNumberAr[i];
			}
			
		}
		
		System.out.println("\t\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		System.out.printf("\t\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%-15s|%n"," Phone Number","  XS","   S","   M","   L","  XL","  XXL"," Total Amount");
		System.out.println("\t\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		
		
		for (int i = 0; i < phoneNumberAr.length; i++){
			 int[] tempSizes = new int[6];
			 String[] size = {"xs","s","m","l","xl","xxl"};
			 
			 for (int j = 0; j < pNumberAr.length; j++){
				 if (phoneNumberAr[i].equals(pNumberAr[j])){
					 switch (sizeAr[j]){
						 case "xs": tempSizes[0] += qtyAr[j];break; 
						 case "s": tempSizes[1] += qtyAr[j];break; 
						 case "m": tempSizes[2] += qtyAr[j];break; 
						 case "l": tempSizes[3] += qtyAr[j];break; 
						 case "xl": tempSizes[4] += qtyAr[j];break; 
						 case "xxl": tempSizes[5] += qtyAr[j];break; 
					 }
					 
				 }
			 }
			  
			double total = 0;
			 
			for (int j = 0; j < tempSizes.length; j++){
				 total += (double)tempSizes[j]*(size[j].equals("xs")? xs:size[j].equals("s")? s:size[j].equals("m")? m:size[j].equals("l")? l:size[j].equals("xl")? xl:xxl); 
			}
			  
			System.out.printf("\t\t\t|%15s|%7s|%7s|%7s|%7s|%7s|%7s|%15s|%n","","","","","","","","");
			System.out.printf("\t\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%13.2f  |%n",phoneNumberAr[i],"  "+tempSizes[0],"  "+tempSizes[1],"  "+tempSizes[2],"  "+tempSizes[3],"  "+tempSizes[4],"  "+tempSizes[5],total);
			 
		}
		
		System.out.println("\t\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		System.out.println();
		
		L11:do{
				System.out.print("\t\t\tTO access the Main Menu, please enter 0 : ");
				int num=input.nextInt();
				
				if (num==0){
					clearConsole();
					mainMenu();
				}else{
					//Move the cursor up five lines 
					System.out.print("\033[1A");
					//Clear lines
					System.out.print("\033[0J");
					continue L11;
				}
				
			} while (true);
		
	}
	
//=========== itemReports =================//

	public static void itemReports(){
		
		System.out.println("\t\t  _____ _                   _____                       _               ");
		System.out.println("\t\t |_   _| |                 |  __ \\                     | |             ");
		System.out.println("\t\t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___         ");
		System.out.println("\t\t   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|   ");
		System.out.println("\t\t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\    ");
		System.out.println("\t\t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/  ");
		System.out.println("\t\t                                      | |                               ");
		System.out.println("\t\t                                      |_|                               ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________________  ");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("\t\t\t\t[1] Best Selling Categories Sorted by QTY");
		System.out.println("\n");
		System.out.println("\t\t\t\t[2] Best Selling Categories Sorted by Amount");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.print("\t\t\tEnter Option  : ");
		int num4=input.nextInt();
		
		switch(num4){
					
					case 1: clearConsole();sortedByQTY();break;
					case 2: clearConsole();sortedByAmount();break;
					default : 
							clearConsole();
							viewReports();
							
					}
		
	}
	
//============ sortedByQTY ===============//

	public static void sortedByQTY(){
		
		System.out.println("\t\t   _____            _           _   ____           ____ _________     __          ");
		System.out.println("\t\t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /      ");
		System.out.println("\t\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ /         ");
		System.out.println("\t\t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /       ");
		System.out.println("\t\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |             ");
		System.out.println("\t\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|     ");
		System.out.println("\t\t                                           __/ |                                  ");
		System.out.println("\t\t                                          |___/                                   ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________  ");
		
		String[] sizeArTemp1  = new String[0];
		int[] qtyArTemp1 = new int [0];
		double[] amountArTemp1 = new double[0];
		
		L1:for(int i=0; i<sizeAr.length; i++){
			for(int j=0; j<sizeArTemp1.length; j++){
				if(sizeAr[i].equals(sizeArTemp1[j])){
					qtyArTemp1[j]+=qtyAr[i];
					amountArTemp1[j]+=amountAr[i];
					continue L1;
				}
			}
			
			sizeArTemp1 = extendArraysString(sizeArTemp1);
			sizeArTemp1[sizeArTemp1.length-1] = sizeAr[i];
			
			qtyArTemp1 = extendArraysInt(qtyArTemp1);
			qtyArTemp1[qtyArTemp1.length-1] = qtyAr[i];
			
			amountArTemp1 = extendArraysDouble(amountArTemp1);
			amountArTemp1[amountArTemp1.length-1]=amountAr[i];
			
		}
		
		for(int i=0; i<sizeArTemp1.length-1; i++){
			for(int j=i+1; j<sizeArTemp1.length; j++){
				if(qtyArTemp1[i]<qtyArTemp1[j]){
					
					int t1=qtyArTemp1[i];
					qtyArTemp1[i]=qtyArTemp1[j];
					qtyArTemp1[j]=t1;
					
					String t2=sizeArTemp1[i];
					sizeArTemp1[i]=sizeArTemp1[j];
					sizeArTemp1[j]=t2;
					
					
					double t3=amountArTemp1[i];
					amountArTemp1[i]=amountArTemp1[j];
					amountArTemp1[j]=t3;
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		System.out.println("\t\t\t|       Size      |  All QTY |  Total Amount|");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		
		for (int i = 0; i < qtyArTemp1.length; i++){
			System.out.println("\t\t\t|                 |          |              |");
			System.out.printf("\t\t\t|  %-15s| %6d   | %-12.2f |",sizeArTemp1[i].toUpperCase(),qtyArTemp1[i],amountArTemp1[i]);
			System.out.println();
		}
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		System.out.println("\n");
		System.out.println("\n");
		
		
		L2:do{
		
				System.out.print("\t\t\tTo access Main Menu,Please enter 0 :");
				String ac=input.next();
				
				if(ac.equals("0")){
					clearConsole();
					mainMenu();
				}else{
					// Move the cursor up five lines
					System.out.print("\033[1A");
					// Clear the lines
					System.out.print("\033[0J");
					continue L2;
				}
			
			}while(true);
		
	}
	
//=============== sortedByAmount ================//

	public static void sortedByAmount(){
		
		System.out.println("\t\t    _____            _           _   ____                                               _               ");
		System.out.println("\t\t   / ____|          | |         | | |  _ \\            /\\                               | |            ");
		System.out.println("\t\t  | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_            ");
		System.out.println("\t\t   \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|   ");
		System.out.println("\t\t   ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_            ");
		System.out.println("\t\t  |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|  ");
		System.out.println("\t\t                                            __/ |                                                       ");
		System.out.println("\t\t                                           |___/                                                        ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________  ");
		
		String[] sizeArTemp1  = new String[0];
		int[] qtyArTemp1 = new int [0];
		double[] amountArTemp1 = new double[0];
		
		L1:for(int i=0; i<sizeAr.length; i++){
			for(int j=0; j<sizeArTemp1.length; j++){
				if(sizeAr[i].equals(sizeArTemp1[j])){
					qtyArTemp1[j]+=qtyAr[i];
					amountArTemp1[j]+=amountAr[i];
					continue L1;
				}
			}
			
			sizeArTemp1 = extendArraysString(sizeArTemp1);
			sizeArTemp1[sizeArTemp1.length-1] = sizeAr[i];
			
			qtyArTemp1 = extendArraysInt(qtyArTemp1);
			qtyArTemp1[qtyArTemp1.length-1] = qtyAr[i];
			
			amountArTemp1 = extendArraysDouble(amountArTemp1);
			amountArTemp1[amountArTemp1.length-1]=amountAr[i];
			
		}
		
		for(int i=0; i<sizeArTemp1.length-1; i++){
			for(int j=i+1; j<sizeArTemp1.length; j++){
				if(amountArTemp1[i]<amountArTemp1[j]){
					
					int t1=qtyArTemp1[i];
					qtyArTemp1[i]=qtyArTemp1[j];
					qtyArTemp1[j]=t1;
					
					String t2=sizeArTemp1[i];
					sizeArTemp1[i]=sizeArTemp1[j];
					sizeArTemp1[j]=t2;
					
					
					double t3=amountArTemp1[i];
					amountArTemp1[i]=amountArTemp1[j];
					amountArTemp1[j]=t3;
				}
			}
		}
		
		System.out.println("\n");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		System.out.println("\t\t\t|       Size      |  All QTY |  Total Amount|");
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		
		
		for (int i = 0; i < qtyArTemp1.length; i++){
			System.out.println("\t\t\t|                 |          |              |");
			System.out.printf("\t\t\t|  %-15s| %6d   | %-12.2f |",sizeArTemp1[i].toUpperCase(),qtyArTemp1[i],amountArTemp1[i]);
			System.out.println();
		}
		System.out.println("\t\t\t+-----------------+----------+--------------+");
		
		System.out.println("\n");
		System.out.println("\n");
		
		
		L2:do{
		
				System.out.print("\t\t\tTo access Main Menu,Please enter 0 :");
				String ac=input.next();
				
				if(ac.equals("0")){
					clearConsole();
					mainMenu();
				}else{
					// Move the cursor up five lines
					System.out.print("\033[1A");
					// Clear the lines
					System.out.print("\033[0J");
					continue L2;
				}
			
			}while(true);
		
	}
	
//================ ordersReports ==================//

	public static void ordersReports(){
		
		System.out.println("\t\t   ____          _             _____                       _                      ");
		System.out.println("\t\t  / __ \\        | |           |  __ \\                     | |                   "); 
		System.out.println("\t\t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___                ");
		System.out.println("\t\t | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|           ");
		System.out.println("\t\t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\           ");
		System.out.println("\t\t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/        ");
		System.out.println("\t\t                                         | |                                      ");
		System.out.println("\t\t                                         |_|                                      ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________  ");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("\t\t\t\t[1] All Orders");
		System.out.println("\n");
		System.out.println("\t\t\t\t[2] Orders By Amount");
		
		System.out.println("\n");;
		System.out.println("\n");
		
		System.out.print("\t\t\tEnter Option  : ");
		int num4=input.nextInt();
		
		switch(num4){
					case 1: clearConsole(); allOrders();break;
					case 2: clearConsole(); ordersByAmount();break;
					default : 
							clearConsole();
							viewReports();
					}
		
	}
	
//=============== allOrders ================//

	public static void allOrders(){
			
		System.out.println("\t\t __      ___                  ____          _                        ");
		System.out.println("\t\t \\ \\    / (_)                / __ \\        | |                    ");      
		System.out.println("\t\t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___        ");
		System.out.println("\t\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|   ");
		System.out.println("\t\t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\     ");
		System.out.println("\t\t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/  ");
		
		System.out.println("\n");
		
		System.out.println("\t\t________________________________________________________________________________  ");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("\t\t\t+--------------------+--------------------+---------+-------+--------------------+------------------+");
		System.out.println("\t\t\t|       Order ID     |    Customer ID     |  Size   |  QTY  |      Amount        |       Status     |");
		System.out.println("\t\t\t+--------------------+--------------------+---------+-------+--------------------+------------------+"); 
			
			for (int i = orderIdAr.length-1; i >=0; i--){
				System.out.printf("\t\t\t| %-18s | %-18s |   %-5s | %-4d  | %17.2f  | %-16s |\n",orderIdAr[i],pNumberAr[i],sizeAr[i].toUpperCase(),qtyAr[i],amountAr[i],statusAr[i]);
			}
		System.out.println("\t\t\t+---------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		System.out.println("\n");
		
		L9:do{
			System.out.print("\t\t\tTO access the Main Menu, please enter 0 : ");
			int num = input.nextInt();
			
			if (num==0){
				clearConsole();
				mainMenu();
				
			}else{
				//Move the cursor up five lines 
				System.out.print("\033[1A");
				//Clear lines
				System.out.print("\033[0J");
				continue L9;
			}
		} while (true);
		
	}
	
	public static void ordersByAmount(){
			
		System.out.println("\t\t    ____          _                 ____                                               _                  ");
		System.out.println("\t\t   / __ \\        | |               |  _ \\            /\\                               | |              ");
		System.out.println("\t\t  | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_               ");
		System.out.println("\t\t  | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|         ");
		System.out.println("\t\t  | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_             ");
		System.out.println("\t\t   \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|      ");
		System.out.println("\t\t                                           __/ |                                                          ");
		System.out.println("\t\t                                          |___/                                                           ");
			
		System.out.println("\n");
		
		System.out.println("\t\t____________________________________________________________________________________________________  ");
		
		String[] orderIdArTemp = new String[orderIdAr.length];
		String[] pNumberArTemp = new String[pNumberAr.length];
		String[] sizeArTemp = new String[sizeAr.length];
		String[] statusArTemp = new String[statusAr.length];
		double[] amountArTemp = new double[amountAr.length];
		int[] qtyArTemp = new int[qtyAr.length];
		
		for (int i = 0; i < orderIdAr.length; i++){
			orderIdArTemp[i] = orderIdAr[i];
			pNumberArTemp[i] = pNumberAr[i];
			sizeArTemp[i] = sizeAr[i];
			statusArTemp[i] = statusAr[i];
			qtyArTemp[i] = qtyAr[i];
			amountArTemp[i] = amountAr[i];
		}
		
		for (int i = 0; i < orderIdAr.length-1; i++){
			for (int j = i+1; j < orderIdAr.length; j++){
				if (amountArTemp[i]<amountArTemp[j]){
					double t1 = amountArTemp[i];
					amountArTemp[i] = amountArTemp[j];
					amountArTemp[j] = t1;
					
					String t2 = orderIdArTemp[i];
					orderIdArTemp[i] = orderIdArTemp[j];
					orderIdArTemp[j] = t2;
					
					String t3 = pNumberArTemp[i];
					pNumberArTemp[i] = pNumberArTemp[j];
					pNumberArTemp[j]= t3;
					
					String t4 = sizeArTemp[i];
					sizeArTemp[i] = sizeArTemp[j];
					sizeArTemp[j] = t4;
					
					String t5 = statusArTemp[i];
					statusArTemp[i] = statusArTemp[j];
					statusArTemp[j] = t5;
					
					int t6 = qtyArTemp[i];
					qtyArTemp[i] = qtyArTemp[j];
					qtyArTemp[j] = t6;
				}
			}
		}
		
		System.out.println("\t\t\t+--------------------+--------------------+---------+-------+--------------------+------------------+");
		System.out.println("\t\t\t|       Order ID     |    Customer ID     |  Size   |  QTY  |      Amount        |       Status     |");
		System.out.println("\t\t\t+--------------------+--------------------+---------+-------+--------------------+------------------+"); 
			
			for (int i = 0; i <orderIdArTemp.length; i++){
				System.out.printf("\t\t\t| %-18s | %-18s |   %-5s |  %-3d  |  %17.2f |  %-15s |\n",orderIdArTemp[i],pNumberArTemp[i],sizeArTemp[i],qtyArTemp[i],amountArTemp[i],statusArTemp[i]);
			}
		System.out.println("\t\t\t+--------------------+--------------------+---------+-------+--------------------+------------------+");
		System.out.println("");
		
		L9:do{
			System.out.print("\t\t\tTO access the Main Menu, please enter 0 : ");
			int num = input.nextInt();
			if (num==0){
				clearConsole();
				mainMenu();
			}else{
				//Move the cursor up one lines 
				System.out.print("\033[1A");
				//Clear lines
				System.out.print("\033[0J");
				continue L9;
			}
		} while (true);
		
	}
	
		
//============== changeOrderStatus ===================//

	public static void changeOrderStatus(){
			
		System.out.println("\t\t\t   ____          _              _____ _        _                        ");
		System.out.println("\t\t\t  / __ \\        | |            / ____| |      | |                      ");
		System.out.println("\t\t\t | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___            ");
		System.out.println("\t\t\t | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|        ");
		System.out.println("\t\t\t | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\         ");
		System.out.println("\t\t\t  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/    ");
		System.out.println("\t\t\t________________________________________________                        ");     
		System.out.println("\n");
		
		L5:do{
			       
			System.out.print("\t\t\tEnter Order ID : ");
			String orderId1 = input.next();
			System.out.println("\n"); 
			
			int index = 0;
			if (validOrderIdCheck(orderId1)){
				for (int i = 0; i < orderIdAr.length; i++){
					if (orderIdAr[i].equals(orderId1)){
						index = i;
					}
				}
				
				System.out.println("\t\t\tPhone Number : "+pNumberAr[index]);
				System.out.println("\t\t\tSize         : "+sizeAr[index].toUpperCase());
				System.out.println("\t\t\tQTY          : "+qtyAr[index]);
				System.out.println("\t\t\tAmount       : "+amountAr[index]);
				System.out.println("\t\t\tStatus       : "+statusAr[0]);
				System.out.println("\n");

				L9:do{
					
				if (statusAr[index].equals("PROCESSING")){
					System.out.print("\t\t\tDo you want to change this order status? (y/n) : ");
					String yn=input.next().toLowerCase();
					System.out.println("\n");
					
					if(yn.equals("y")){
						System.out.println("\t\t\t\t[1] Order Delivering");
						System.out.println();
						System.out.println("\t\t\t\t[2] Order Delivered");
						System.out.println();
						
					L10:do{
							
							System.out.print("\t\t\tEnter Option : ");
							int status = input.nextInt();
							if (status==1){
								statusAr[index]="Delivering";
								System.out.print("\033[19A");
								System.out.print("\033[0J");
								continue L5;
							}else if(status==2){
								statusAr[index]="Delivered";
								System.out.print("\033[18A");
								System.out.print("\033[0J");
								continue L5;
							}else{
								System.out.print("\033[1A");
								System.out.print("\033[0J");
								continue L10;
								
							}
					}while(true);
						}else if(yn.equals("n")){
								clearConsole();
								mainMenu();
						}else{
							System.out.print("\033[1A");
							System.out.print("\033[0J");
							continue L9;
						}
						
				}else if(statusAr[index].equals("Delivering")){
					
					L8:do{
						
						System.out.print("\t\t\tDo you want to change this order status? (y/n) :");
						String yn = input.next().toLowerCase();
						System.out.println("\n");
						
						if(yn.equals("y")){
							System.out.println("\t\t\t\t[1] Order Delivered");
							System.out.println("\n");
							
							System.out.print("\t\t\tEnter Option : ");
							int status = input.nextInt();
							
							if(status==1){
								statusAr[index]="Delivered";
								System.out.print("\033[17A");
								System.out.print("\033[0J");
								continue L5;
							}
						
						}else if (yn.equals("n")){
							clearConsole();
							mainMenu();
							}else{
								System.out.print("\033[1A");
								System.out.print("\033[0J");
								continue L8;
								}
					}while(true);
					
					}else if(statusAr[index].equals("Delivered")){
						System.out.println("\t\t\tCan't change this order status , order already deliverd ...!");
						System.out.println("\n");

						System.out.print("\t\t\tDo you want to change anohter order status ? (y/n) : ");
						String yn = input.next().toLowerCase();
		
						if(yn.equals("y")){
							clearConsole();
							changeOrderStatus();
						}else{
							clearConsole();
							mainMenu();
							}
					}
				}while(true);
			}
		}while(true);
		
	}
	
//================ deleteOrder ===================//

	public static void deleteOrder(){
		
		L6:do{
			
			System.out.println("\t\t  _____       _      _          ____          _                    ");
			System.out.println("\t\t |  __ \\     | |    | |        / __ \\        | |                 ");
			System.out.println("\t\t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __          ");
			System.out.println("\t\t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|     ");
			System.out.println("\t\t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |            ");
			System.out.println("\t\t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|     ");
			
			System.out.println("\n");
			
			System.out.println("\t\t__________________________________________________________         "); 
			
			System.out.println("\n");
			System.out.println("\n"); 
			
			String[] newOrderIdAr = new String[orderIdAr.length-1];
			String[] newPnumberAr = new String[orderIdAr.length-1];
			String[] newSizeAr = new String[orderIdAr.length-1];
			String[] newStatusAr = new String[orderIdAr.length-1];
			int[] newQtyAr = new int[orderIdAr.length-1];
			double[] newAmountAr = new double[orderIdAr.length-1];
			double[] newPriceOfSizeAr = new double[orderIdAr.length-1];
		
			 
			L7:do{
				
				System.out.println("\n");
				
				System.out.print("\t\t\tEnter  Order ID : ");
				String orderId2 = input.next();
				
				System.out.println("\n"); 
				
				int index = 0;
				if (validOrderIdCheck1(orderId2)){
					
					for (int i = 0; i < orderIdAr.length; i++){
						if (orderIdAr[i].equals(orderId2)){
							index = i;
							
						}
					}
							System.out.println("\t\t\tPhone Number : "+pNumberAr[index]);
							System.out.println("\t\t\tSize         : "+sizeAr[index]);
							System.out.println("\t\t\tQTY          : "+qtyAr[index]);
							System.out.println("\t\t\tAmount       : "+amountAr[index]);
							System.out.println("\t\t\tStatus       : "+statusAr[0]);
							
							System.out.println("\n"); 
							
							System.out.print("\t\t\tDo you want to delete this order ? (Y/N) : ");
							String option5 = input.next().toLowerCase();
							
							if (option5.equals("y")){
								
								int index1 = 0;
								for (int i = 0; i < orderIdAr.length; i++){
									if (orderIdAr[i].equals(orderId2)){
										index1 = i;
									
								for(int s=index; s<orderIdAr.length-1; s++){
									orderIdAr[s] = orderIdAr[s+1];
									pNumberAr[s] = pNumberAr[s+1];
									sizeAr[s] = sizeAr[s+1];
									statusAr[s] = statusAr[s+1];
									qtyAr[s] = qtyAr[s+1];
									amountAr[s] = amountAr[s+1];
									priceOfSizeAr[s] = priceOfSizeAr[s+1];
								}
												
								for(int t=0; t<newOrderIdAr.length; t++){
									
									newOrderIdAr[t] = orderIdAr[t];
									newPnumberAr[t] = pNumberAr[t];
									newSizeAr[t] = sizeAr[t];
									newStatusAr[t] = statusAr[t];
									newQtyAr[t] = qtyAr[t];
									newAmountAr[t] = amountAr[t];
									newPriceOfSizeAr[t] = priceOfSizeAr[t];
									
								}
									
									break;
								}else{
									continue;
								}
				
							}
							
							orderIdAr = newOrderIdAr;
							pNumberAr = newPnumberAr;
							sizeAr = newSizeAr;
							statusAr = newStatusAr;
							priceOfSizeAr = newPriceOfSizeAr;
							qtyAr = newQtyAr;
							amountAr = newAmountAr;
							
							System.out.println("\n");
							
							System.out.println("\t\t\t\tOrder Deleted...");
							
							System.out.println("\n");
							
							System.out.print("\t\t\tDo you want to delete another order ? (Y/N) : ");
							String option7 = input.next().toLowerCase();
							
							if (option7.equals("y")){
								
								newOrderIdAr = new String[orderIdAr.length-1];
								newPnumberAr = new String[pNumberAr.length-1];
								newSizeAr = new String[sizeAr.length-1];
								newPriceOfSizeAr = new double[priceOfSizeAr.length-1];
								newQtyAr = new int[qtyAr.length-1];
								newStatusAr = new String[statusAr.length-1];
								newAmountAr = new double[amountAr.length-1];
								
								//Move the cursor up five lines 
								System.out.print("\033[13A");
								//Clear lines
								System.out.print("\033[0J");
								continue L7;
								
							}else{
									clearConsole();
									mainMenu();
							}
							
					}else{
						System.out.print("\t\t\tDo you want to delete another order ? (Y/N) : ");
						String option7=input.next().toLowerCase();
						if (option7.equals("y")){
							//Move the cursor up five lines 
							System.out.print("\033[9A");
							//Clear lines
							System.out.print("\033[0J");
							continue L7;
							
						}else{
								clearConsole();
								mainMenu();
						}
					}
					
				}else{
					
					System.out.println("\t\t\tInvalid ID.......");
					System.out.println("\n");
					
					System.out.print("\t\t\tDo you want to delete another order ? (Y/N) : ");
					String option7 = input.next().toLowerCase();
					
					if (option7.equals("y")){
						//Move the cursor up five lines 
						System.out.print("\033[5A");
						//Clear lines
						System.out.print("\033[0J");
						continue L7;
						
					}else{
						clearConsole();
						mainMenu();
					}
				}
				
			}while(true);
			
		}while(true);
		
	}
	
//============ extendArraysInt =============//
	
	public static int[] extendArraysInt(int[] ar){
		int[]arTemp2 = new int[ar.length+1];
		for(int k=0;k<ar.length;k++){
			arTemp2[k]=ar[k];
		}
		return arTemp2;
		
	}
	
//============== extendArraysString ============//

	public static String[] extendArraysString(String[] ar){
		String[] arTemp2 = new String[ar.length+1];
		
		for(int k=0; k<ar.length; k++){
			arTemp2[k] = ar[k];
		}
		return arTemp2;
		
	}
	
//============== extendArraysDouble ===============//

	public static double[] extendArraysDouble(double[] ar){
		double[] arTemp2 = new double[ar.length+1];
		for(int k=0; k<ar.length; k++){
			arTemp2[k] = ar[k];
		}
		return arTemp2;
		
	}
	
	
//=========Create a method to generate id================//
		
	public static String generateId(){
		int id1;
		if (orderIdAr.length>0){
			id1 = Integer.parseInt(orderIdAr[orderIdAr.length-1].split("[#]")[1]);
			id1++;
		}else{
			return "ODR#00001";
		}
		return String.format("ODR#%05d",id1);
	}
	
	
//=========== clearConsole ==============//

	public final static void clearConsole() { 
		try{
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}
}
