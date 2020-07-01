package snake_ladder;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class snake_ladder{
	
static String players []  , bord = "" ; static  String k [] = new String [101];  static int master = 99  , round = 0 , friends= 99 , counter = 0;   static int snow[][] = new int [2][4];
static int a1=0 , a2=0 ,a3=0 ,a4=0 ,a5=0 ,a6=0 ,a7=0 ,a8=0 ,a9=0, a10=0 ,a11=0 , a12=0 , a13=0 , a14 =0;
	
	public static void main(String[] args) {
		
	ImageIcon race = new ImageIcon ("race.png");	               // stuf
	ImageIcon snake = new ImageIcon ("snake.png");
	ImageIcon replay99 = new ImageIcon ("replay99.png");
	ImageIcon bye99 = new ImageIcon ("bye99.png");
	ImageIcon roll = new ImageIcon ("roll.png");
	
	int replay = 1;
	
	
	while(replay ==1) {		
	replay++;           // counter for replaying the game ifin end want to replay just make replay--
	
	
	boolean game_boot = false , gaming = true ,repet = true ;
	int boot = 99 , hey = 99 , prince = 99 , never_die = 0 , im_who = 99;
		
	int conditional = startup();      // first choices  start / rules / end_game
	if (conditional == 1 ) { game_boot = true; boot=1;}    // 1 = normal game starting
	else if (conditional == 2) {gaming = false ; repet = false ;	replay++;}   // game ending
	//=========================================================================================================
	while (game_boot) {                      // game start up loop taking n_players , names , positions
	int players_number = pnumber();          // how many player will play
	if (players_number == 99) {              // cancle 
	game_boot = false; gaming = false ; repet = false ; replay++; boot = 99;
	JOptionPane.showMessageDialog(null, "snake have win after all \ngood luck for next time \ngame clossing", "bye bye ", JOptionPane.INFORMATION_MESSAGE , snake);
	break;} // if press cancle
	
	players = new String [players_number];  // danani size bo naw
	for(master = 0 ; master < players.length ; master++) { 
	players[master]=naming();  // naming all players (master will transpot number of players)
	if (players[master] == "stoppp") {
	JOptionPane.showMessageDialog(null, "snake have win after all \ngood luck for next time \ngame clossing", "bye bye ", JOptionPane.INFORMATION_MESSAGE , snake);
	game_boot = false;
	gaming = false;
	repet = false ; 
	boot = 99;                // in case wont entering name whole game will shut down
	break;} }
 	
	if(boot==1) {             // player one will start first for starting numbering
	JOptionPane.showMessageDialog(null , players[0] + " will role the dice first who get bigger number will start first" , "attention",JOptionPane.INFORMATION_MESSAGE, race);}
	
	while(repet) {
	for(int k = 0 ; k < players.length ; k++) {
	hey = JOptionPane.showConfirmDialog(null,players[k]+" press yes to role the dice or no to quite the game","rolling the dice" , 0 , JOptionPane.INFORMATION_MESSAGE , roll);
	if(hey == 0 ) {snow[0][k] = random(k);}                                      // if yes will get a random m=number in their basket
	else if (hey == 1) {                                                         // if player press cancle game will close
	JOptionPane.showMessageDialog(null, "snake have win after all \ngood luck for next time \ngame clossing", "bye bye ", 0 , snake);
	game_boot = false; 
	gaming = false;  
	repet = false ; 
	boot = 99;  break;}   }
	//==============================================================================================================
	if(boot!=99) {   
	repet = bug();}
	
	if(repet==true) {
	JOptionPane.showMessageDialog(null ,  "there is an tie in the computition we need to repet the all race " , "attention",JOptionPane.INFORMATION_MESSAGE, race);}   } // repet 
	new_expressing();   
	game_boot = false; }      // closing wile loop of boot up
	
	if (boot == 1) {                 
	for(int zero = 0 ; zero<players.length ; zero++) { snow[0][zero] = 0; snow[1][zero] = 0;}  // zar w maraka 0 akretawa
	if(players.length ==2) {JOptionPane.showMessageDialog(null , players[0] + " will start first then " + players[1], "attention",JOptionPane.INFORMATION_MESSAGE, race);}
	else if(players.length==3) {JOptionPane.showMessageDialog(null ,  players[0] + " will start first then " + players[1] + " then " + players[2], "attention",JOptionPane.INFORMATION_MESSAGE, race);}
	else if (players.length==4) {JOptionPane.showMessageDialog(null ,  players[0] + " will start first then " + players[1] + " then " + players[2] + " then " + players[3] , "attention",JOptionPane.INFORMATION_MESSAGE, race);}	
	creator();}  // message about the series sequence
	
	for(int koko = 0 ; gaming ; koko++) {  // the game preses
	master = JOptionPane.showConfirmDialog(null,players[koko]+" press yes to role the dice or no to quite the game","rolling the dice" , 0 ,0 , roll);
	if(master==0) {
	snow[0][koko] = random(koko);
	snow[1][koko] = snow[1][koko] + snow[0][koko];}else if (master == 1) {
		
		
	if       (players.length == 2)       {		 // chwna daraway yarizanak
	im_who = 1;			
	game_ended(koko , im_who);		    
	gaming = false; break;
	}else if (players.length == 3){
	if       (prince == 99)              {		
	im_out(koko);		//     making all zero
	prince++;		    //     counting how many will go out
	never_die++;        //
	}else if ( prince == 100)            {	    
	im_who = 2 ;	    
	game_ended(koko,im_who);	        
	gaming = false; break; }
	}else if (players.length == 4){
	if       (prince == 99)              {		
	im_out(koko);		
	prince++;		
	never_die++;}
	else if  (prince == 100 )            {		
	im_out(koko);		
	prince++;		
	never_die++;}
	else if  (prince == 101)             {      
	im_who = 3 ;        
	game_ended(koko,im_who);            
	gaming = false; break;} }    
	
	
	
	}
	counter++;	
	master = 99;	if (snow[1][koko]>93) {test0(koko);}	
	test(koko);	
	if (snow[1][koko] == 100 ) {master = 100 ; gaming = false;}		
	bording(); 		
	reaction(koko);		
	thanos(koko); 	
	best_friends();
		
	if (never_die==0) {
	if(koko == players.length-1) {koko = -1; }
	round++;}else if (never_die ==1) {
	if(koko == players.length-1) {koko = 0; }
	round++;}else if(never_die==2) {
	if(koko == players.length-1) {koko = 1; }}}
	
	if(replay==2) {hey = 99;		hey = JOptionPane.showConfirmDialog(null," press yes to replay the game or no to quite the game","replaying the game" , 0 , JOptionPane.INFORMATION_MESSAGE , replay99);
	if(hey == 0) {replay--;	JOptionPane.showMessageDialog(null, "i knew it , lets play again", "replay ", JOptionPane.INFORMATION_MESSAGE , replay99);}
	else if ( hey == 1) {JOptionPane.showMessageDialog(null, "i had a good time hope that u come back soon.","bye bye", JOptionPane.INFORMATION_MESSAGE , bye99);} } } }
	//============================================================================================================
	public static int startup(){                                                            // game starting up options

		String like = "welcom to snake and ladder game." ;
		String options [] = {"start the game" , "rules of the game" , "close the game"};
		ImageIcon icon = new ImageIcon ("game_icon.png");
		ImageIcon snake = new ImageIcon ("snake.png");
		ImageIcon rule = new ImageIcon ("rule.png");
		int conditional = 0 ;
		
		while (true) {
		String kodo = (String)JOptionPane.showInputDialog(null , "choose one of the options please" , like , 1 ,icon , options , options[0] );
		if(kodo == null) { kodo = options[2];}
		if (kodo.equals(options[0]) || kodo == null || kodo.length() < 1 ) { conditional = 1; 	JOptionPane.showMessageDialog(null, "there is three un breakable ruls. \n \n1. any time during the confirm messages or inputs you press cancle the game will be closed  \n    if you are not entried the "+
		"game but doring the game will be consider you leaved the game \n    and game wont be closed."+" \n2. the last player who remain or fastest to get 100 wins."+
		"\n3. if any two player or more been on same cell their sumble will be a black heart."		
		+" \n \n                                     with game creators best wishes #koko", "attention!!!", JOptionPane.INFORMATION_MESSAGE , rule);break;}
		if (kodo.equals(options[1])) {
		JOptionPane.showMessageDialog(null,"the game is being playing on a bord  that contain 100 cells \n2-4 players can play in this version \n"
		+ "the bord contain 8 hidden snake traps that they eat you and you lose points \nbord also contain 8 hidden ladders that you climb them to get tp higher cells \n"
		+ "your movement is depending on a dice so game is deponds on your luck \nwho get to cell 100 first win the game \ngood luck dear players" , "RULES",
		JOptionPane.INFORMATION_MESSAGE,rule);}
		if(kodo.equals(options[2])) {      JOptionPane.showMessageDialog(null, "snake have win after all \ngood luck for next time \ngame clossing", "bye bye ", 0 , snake);	 conditional = 2 ; break;	}	} return conditional ;	}
	//----------------------------------------------------------------------------------------------------------
	public static int pnumber() {                                   // choosing number of players
		String up = "numbers of players";
		String numbers[] = {"two   players   ==>    (2)" , "three players  ==>    (3)" , "four  players   ==>    (4)"};
		ImageIcon playersnum = new ImageIcon ("playersnum.png");
		int realy = 999 ; String stop = "stoppppp";
		String numberskk = (String)JOptionPane.showInputDialog(null , "choose how many players will play " , up , 1 ,playersnum , numbers , numbers[0] );
		if(numberskk == null) {numberskk = "stoppppp";}
		if (numberskk.equals(numbers[0])) { realy = 2;}
		else if (numberskk.equals(numbers[1])) { realy = 3;} 
		else if (numberskk.equals(numbers[2])) { realy = 4;} 
		else if(numberskk == stop) { realy  = 99;}
		  	return realy;}
	//----------------------------------------------------------------------------------------------------------
	public static String naming() { 											// naming players
		ImageIcon white = new ImageIcon ("white.png");
		ImageIcon black = new ImageIcon ("black.png");
		ImageIcon red = new ImageIcon ("red.png");
		ImageIcon blue = new ImageIcon ("blue.png");
		String x = "";
		if (master == 0 ) {x =  (String) JOptionPane.showInputDialog(null ,"enter your name","first player name" , JOptionPane.INFORMATION_MESSAGE, white , null ,"player one");
		if (x == null || x.length() < 1 ) {x = "stoppp";} }
		else if (master == 1) {x =  (String) JOptionPane.showInputDialog(null ,"enter your name","second player name" , JOptionPane.INFORMATION_MESSAGE, black , null ,"player two");
		if (x == null || x.length() < 1 ) {x = "stoppp";} }
		else if ( master == 2) {x =  (String) JOptionPane.showInputDialog(null ,"enter your name","third player name" , JOptionPane.INFORMATION_MESSAGE, red , null ,"player three");
		if (x == null || x.length() < 1 ) {x = "stoppp";}}
		else if (master== 3) {x =  (String) JOptionPane.showInputDialog(null ,"enter your name","fourth player name" , JOptionPane.INFORMATION_MESSAGE, blue , null ,"player four");
		if (x == null || x.length() < 1 ) {x = "stoppp";}}
		return x;}
	//------------------------------------------------------------------------------------------------------------
	public static int random (int y ) {                                                 // giving a random dice
		ImageIcon dice1 = new ImageIcon ("dice1.png");
		ImageIcon dice2 = new ImageIcon ("dice2.png");
		ImageIcon dice3 = new ImageIcon ("dice3.png");
		ImageIcon dice4 = new ImageIcon ("dice4.png");
		ImageIcon dice5 = new ImageIcon ("dice5.png");
		ImageIcon dice6 = new ImageIcon ("dice6.png");
		int x = 0 ;		while (x==0) { 		x = (int)(Math.random()*7);}
		if(x == 1) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice1 );}
		if(x == 2) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice2 );}
		if(x == 3) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice3 );}
		if(x == 4) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice4 );}
		if(x == 5) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice5 );}
		if(x == 6) {	JOptionPane.showMessageDialog(null ,players[y] +" get: " + x , "dice for role " + players[y] , JOptionPane.INFORMATION_MESSAGE , dice6 );}		return x;  }
	//------------------------------------------------------------------------------------------------------------
	public static boolean bug () {																			// find if any dices is equals
		boolean best = false;
		for(int x  = 0 ; x<players.length ; x++) {
			for(int y = 0 ; y<players.length ; y++) {
				if(snow[0][x] == snow[0][y] && x !=y) {   best = true;}}}		return best; }
	//------------------------------------------------------------------------------------------------------------
	public static void new_expressing () { 																	// all new data
		for(int x = 0 ; x <players.length ; x++) {
			for(int y = 0 ; y< players.length ; y++) {
				if (snow[0][x] > snow[0][y]) {	int black = snow[0][x] + snow[0][y];		snow[0][x] = black - snow[0][x];		snow[0][y] = black - snow[0][y]; // dice
				String k1 = players[x] , k2 = players[y];  players[x] = k2 ;    players[y] = k1;    // name
				black = snow[1][x] + snow[1][y];		snow[1][x] = black - snow[1][x];		snow[1][y] = black - snow[1][y];       }}}} // basket
	//--------------------------------------------------------------------------------------------------------------
	public static void creator () {                                       // creating a bord
		String lu = Character.toString((char)0x2554);
		String ru = Character.toString((char)0x2557);
		String ld = Character.toString((char)0x255A);
		String rd = Character.toString((char)0x255D);
		String upt = Character.toString((char)0x2569);
		String downt = Character.toString((char)0x2566);
		String leftt = Character.toString((char)0x2563);
		String rightt = Character.toString((char)0x2560);
		String piph = Character.toString((char)0x2550);
		String pipv = Character.toString((char)0x2551);
		String middle = Character.toString((char)0x256C);
		
		int x = 0 ;						   // creating 101 cells thats just 100 will be used		
		while(x!=101){	if(x<10) {		k[x] = " " +Integer.toString(x) + " ";		}else if(x<100) { 	k[x] = Integer.toString(x) + " ";	}else if (x == 100) { 	k[x] = Integer.toString(x) ;}	x++;}
		int xbord = 1 , celln = 100 ;                                          // create other 100 cell
		String insider[] = new String [22]; 								   // creating 22 rows that 21 will use
		while(xbord != 22) { 
		if(xbord == 1 ) {
		insider[xbord] = lu + piph +piph + piph +downt + piph +piph + piph +downt + piph +piph + piph +downt + piph +piph + piph +downt+ piph +piph + piph +downt + piph +piph + piph +downt + piph +piph + piph +downt + piph +piph + piph +downt +piph +piph + piph +downt +piph +piph + piph +ru + "\n";	
		xbord++;   // top
		}else if(xbord ==2 || xbord == 6 || xbord == 10 || xbord == 14 || xbord == 18) {
		insider[xbord] =	pipv + k[celln--] + pipv + k[celln--] + pipv + k[celln--] + pipv + k[celln--]+ pipv + k[celln--] + pipv + k[celln--] + pipv + k[celln--] + pipv + k[celln--] + pipv +k[celln--] +pipv +k[celln--] + pipv + "\n";
		xbord++;   // insiders
		}else if (xbord  == 4 || xbord == 8 || xbord == 12 || xbord == 16 || xbord == 20 ) {
		insider[xbord]=pipv + k[celln-9] + pipv + k[celln-8] + pipv + k[celln-7] + pipv + k[celln-6]+ pipv + k[celln-5] + pipv + k[celln-4] + pipv + k[celln-3] + pipv + k[celln-2] + pipv +k[celln-1] +pipv +k[celln] + pipv + "\n";
		xbord ++;	celln = celln - 10;  // back insiders
		}else if (xbord == 21) {     
		insider [xbord] =	ld + piph +piph + piph + upt + piph +piph + piph + upt + piph +piph + piph + upt + piph +piph + piph +upt + piph +piph + piph + upt + piph +piph + piph + upt + piph +piph + piph + upt + piph +piph + piph + upt +piph +piph + piph +upt +piph +piph + piph +rd + "\n";
		xbord++;   // bottom
		}else if (xbord %2 ==1 ) {   // all lines
		insider[xbord] =rightt + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle + piph +piph + piph + middle +piph +piph + piph +middle +piph +piph + piph +leftt + "\n" ;	
		xbord++;}}		for ( int k1 = 1 ; k1 < insider.length ; k1++) { bord = bord + insider[k1];}}   // creating bord in String
	//---------------------------------------------------------------------------------------------------------------
	public static void test0 (int f ) {
		if ((snow[1][f]-snow[0][f]) == 95 && snow[0][f] ==6) {		snow[1][f] = snow[1][f] - snow[0][f];		master = 3 ;}	
		else if ((snow[1][f]-snow[0][f]) == 96 && (snow[0][f] ==6 || snow[0][f] ==5)) {		snow[1][f] = snow[1][f] - snow[0][f]; ;		master = 3;}	
		else if ((snow[1][f]-snow[0][f]) == 97 && (snow[0][f] ==6 || snow[0][f] == 5 || snow[0][f] == 4)) {		snow[1][f] = snow[1][f] - snow[0][f]; ;		master = 3;}
		else if ((snow[1][f]-snow[0][f]) == 98 && (snow[0][f] ==6 || snow[0][f] ==5  || snow[0][f] ==4 || snow[0][f] ==3)) {		snow[1][f] = snow[1][f] - snow[0][f];		master = 3;}
		else if ((snow[1][f]-snow[0][f]) == 99 && (snow[0][f] ==6 || snow[0][f] == 5 || snow[0][f] ==4 || snow[0][f] == 3 || snow[0][f] ==2)) {		snow[1][f] = snow[1][f] - snow[0][f];		master = 3;}
		else if ((snow[1][f]-snow[0][f]) == 100 && (snow[0][f] ==6|| snow[0][f] ==6  || snow[0][f] ==5 || snow[0][f]== 4 || snow[0][f] == 3 || snow[0][f] ==2 || snow[0][f] == 1)) {	snow[1][f] = snow[1][f] - snow[0][f]; 	master = 3;}
		}
	//---------------------------------------------------------------------------------------------------------------
	public static void  test (int y) {															//snake and ladder test
		int big_test [] = {99 , 78 , 95 , 75 , 93 , 73 , 87 , 24 , 64 , 60 , 62 , 19 , 17 , 7 , 54 , 34 , 71 , 91 , 63 , 81 , 28 , 84 , 51 , 67 , 40 , 59 , 20 , 38 , 4 , 14 , 9 , 31};
		for (int f = 0 ; f<big_test.length ; f++) {
			if (f == 31) { 	break ;}
			else if(snow[1][y] == big_test[f] && f<16 && f%2==0) {	snow[1][y] = big_test[f+1];		master = 1 ; 	}
			else if(snow[1][y] == big_test[f] && f%2 ==0) { 	 snow[1][y] = big_test[f+1];    master = 2; }  }  }
	//----------------------------------------------------------------------------------------------------------------
	public static void bording () {                                                        // this is game
		String white_smile = Character.toString((char)0x263A);
		String black_smile = Character.toString((char)0x263b);
		String black_ = Character.toString((char)0x2665);
		String black_heart = " " + black_ + " ";
		String smile_1 = " " + white_smile + " ";
		String smile_2 = " " + black_smile + " ";
			
	if (players.length ==2) {
		if(round>=1) {	
			if(snow[1][0] != snow[1][1]) {						System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]], smile_2));}
			else if (snow[1][0] == snow[1][1]) {				System.out.println(bord.replace(k[snow[1][0]],black_heart));	friends=8; }
		}else if(round ==0) {									System.out.println(bord.replace(k[snow[1][0]],smile_1));}}

	if (players.length ==3) {
		if(round>=2) {
			if(snow[1][0] != snow[1][1] && snow[1][0] != snow[1][2] && snow[1][1] != snow[1][2]){	 System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]], smile_2).replace(k[snow[1][2]], " $ "));}
			else if(snow[1][0] == snow[1][1] && snow[1][0] == snow[1][2]) {							 System.out.println(bord.replace(k[snow[1][0]],black_heart));		friends=3;}
			else if (snow[1][0] == snow[1][1]) {													 System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][2]]," $ "));			friends=8;
			}else if(snow[1][0] == snow[1][2]) {													 System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],smile_2));		friends=9;
			}else if (snow[1][1] == snow[1][2]) {													 System.out.println(bord.replace(k[snow[1][1]],black_heart).replace(k[snow[1][0]],smile_1));        friends=11;}		
		
		}else if(round ==0) {																		System.out.println(bord.replace(k[snow[1][0]],smile_1));
		
		}else if (round ==1) {
			if(snow[1][0] != snow[1][1]) {															System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]], smile_2));}
			else if(snow[1][0] == snow[1][1]) {														System.out.println(bord.replace(k[snow[1][0]],black_heart));   friends=8;}}}	
			
	
	if (players.length ==4) {
		if (round >= 3) {
			
			if(snow[1][0] != snow[1][1] && snow[1][0] != snow[1][2] && snow[1][0] != snow[1][3] && snow[1][1] != snow[1][2] && snow[1][1] != snow[1][3] && snow[1][2] != snow[1][3]) {
			System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]],smile_2).replace(k[snow[1][2]]," $ ").replace(k[snow[1][3]]," # ")); // all different
			
			}else if (snow[1][0] == snow[1][1]&&snow[1][0] == snow[1][2]&&snow[1][0] == snow[1][3]) {       // all same
			System.out.println(bord.replace(k[snow[1][0]],black_heart));		                                friends=0;
			//===================================================================
			}else if(snow[1][0] == snow[1][1]&&snow[1][0]==snow[1][2]) {                                    //0 , 1, 2 same & 3 different
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][3]]," # "));			friends=1;
			}else if(snow[1][1] == snow[1][2]&&snow[1][1]==snow[1][3]) {                                    //1,2,3 on same & 0 different
			System.out.println(bord.replace(k[snow[1][1]],black_heart).replace(k[snow[1][0]],smile_1));		    friends=2;
			}else if(snow[1][2] == snow[1][3]&&snow[1][2]==snow[1][0]) {                                    //2,3,0 on same & 1 different
			System.out.println(bord.replace(k[snow[1][2]],black_heart).replace(k[snow[1][1]],smile_2));		    friends=3;
			}else if(snow[1][3] == snow[1][0]&&snow[1][3]==snow[1][1]) {	                                //3,0,1 on same & 2 different
			System.out.println(bord.replace(k[snow[1][3]],black_heart).replace(k[snow[1][2]]," $ "));			friends=4;
			//====================================================================
			}else if (snow[1][0] == snow[1][1]&&snow[1][2] == snow[1][3]) {                                 //0=1 , 2=3
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][2]],black_heart));	    friends=5;
			}else if(snow[1][0] == snow[1][2] && snow[1][1] == snow[1][3]) {	                            //0=2 ,1=3
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],black_heart));	    friends=6;
			}else if(snow[1][0] == snow[1][3] && snow[1][1] == snow[1][2]) {	                            //1=2 0=3
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],black_heart));	    friends=7;
			//====================================================================
			}else if(snow[1][0] == snow[1][1]) {	                                                                                        //0=1
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][2]]," $ ").replace(k[snow[1][3]]," # "));			friends=8;
			}else if(snow[1][0] == snow[1][2]) { 																							//0=2
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],smile_2).replace(k[snow[1][3]]," # "));		friends=9;
			}else if(snow[1][0] == snow[1][3]) {																							//0=3
			System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],smile_2).replace(k[snow[1][2]]," $ "));		friends=10;
			}else if(snow[1][1] == snow[1][2]) {						                                                                    //1=2
			System.out.println(bord.replace(k[snow[1][1]],black_heart).replace(k[snow[1][3]]," # ").replace(k[snow[1][0]],smile_1));		friends=11;
			}else if(snow[1][1] == snow[1][3]) { 																							//1=3
			System.out.println(bord.replace(k[snow[1][1]],black_heart).replace(k[snow[1][2]]," $ ").replace(k[snow[1][0]],smile_1));	    friends=12;
			}else if(snow[1][2] == snow[1][3]) {	 																						//2=3
			System.out.println(bord.replace(k[snow[1][2]],black_heart).replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]],smile_2));  	friends=13;}
			
		}else if(round==2) { 
			if(snow[1][0] != snow[1][1] && snow[1][0] != snow[1][2] && snow[1][1] != snow[1][2]){	 System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]], smile_2).replace(k[snow[1][2]], " $ "));}
			else if(snow[1][0] == snow[1][1] && snow[1][0] == snow[1][2]) {							 System.out.println(bord.replace(k[snow[1][0]],black_heart));		friends=3;}
			else if (snow[1][0] == snow[1][1]) {													 System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][2]]," $ "));			friends=8;
			}else if(snow[1][0] == snow[1][2]) {													 System.out.println(bord.replace(k[snow[1][0]],black_heart).replace(k[snow[1][1]],smile_2));		friends=9;
			}else if (snow[1][1] == snow[1][2]) {													 System.out.println(bord.replace(k[snow[1][1]],black_heart).replace(k[snow[1][0]],smile_1));        friends=11;}		
		
		}else if (round == 1) {
			if(snow[1][0] != snow[1][1]) {															 System.out.println(bord.replace(k[snow[1][0]],smile_1).replace(k[snow[1][1]], smile_2));		
		}else if(snow[1][0] == snow[1][1]) {														 System.out.println(bord.replace(k[snow[1][0]],black_heart));		friends=8;	}
		
		}else if(round == 0) {																		 System.out.println(bord.replace(k[snow[1][0]],smile_1));}}}
	//-------------------------------------------------------------------------------------------------------------------------
	public static void thanos (int y) {
		ImageIcon ladder = new ImageIcon ("ladder.png");
		ImageIcon eat = new ImageIcon ("eat.png");
		ImageIcon sad = new ImageIcon ("sad.png");
		ImageIcon end = new ImageIcon ("end.png");
		if (master ==2 ) {
			JOptionPane.showMessageDialog(null,players[y] + " get ==> " + snow[0][y] + "\n" +"what a chance u on ladder!! what a luck! u climed to position:" + snow[1][y] , "great luck" , JOptionPane.INFORMATION_MESSAGE , ladder );}
		else if (master ==1 ) {
			JOptionPane.showMessageDialog(null,players[y] + " get ==> " + snow[0][y] + "\n" + "snake ate you lol , your postion now is:" + snow[1][y]  , "bad luck lol" , JOptionPane.INFORMATION_MESSAGE , eat );}
		else if (master == 3) {
			JOptionPane.showMessageDialog(null,players[y] + " get ==> " + snow[0][y] +"\n"  +"not an acceptable dice role to  get u to 100 \n sorry this round wont count for:" + players[y] , "not countable round" , JOptionPane.INFORMATION_MESSAGE , sad );}
		else if(master == 100) {JOptionPane.showMessageDialog(null,null ,  "congratulations!!!! " + players[y] + " won the game" , JOptionPane.INFORMATION_MESSAGE , end);}}
	//-------------------------------------------------------------------------------------------------------------------------
	public static void game_ended(int koko , int im_who) {                                                          // one player out of two
		int x = 99 , y = 99;
		ImageIcon end = new ImageIcon ("end.png");
		ImageIcon done = new ImageIcon ("done.png");
		if(im_who == 1) { x=0 ; y =1;}else if (im_who == 2) {x=1 ; y= 2;} else if(im_who == 3) {x=2 ;  y=3;}
		if (koko == x) {
			JOptionPane.showMessageDialog(null ,players[koko] + " has left the game " + "canguratulatins " + players[y] + " you won the game" ,players[y] + " has won the game" , JOptionPane.INFORMATION_MESSAGE , done );
			JOptionPane.showMessageDialog(null,null ,  "congratulations!!!! " + players[y] + " won the game" , JOptionPane.INFORMATION_MESSAGE , end); 
		}if (koko == y) {
			JOptionPane.showMessageDialog(null ,players[koko] + " has left the game " + "canguratulatins " + players[x] + " you won the game" ,players[x] + " has won the game" , JOptionPane.INFORMATION_MESSAGE , done );
			JOptionPane.showMessageDialog(null,null ,  "congratulations!!!! " + players[x] + " won the game" , JOptionPane.INFORMATION_MESSAGE , end); }}
	//--------------------------------------------------------------------------------------------------------------------------
	public static void im_out(int koko ) {                                                                           // one out of many 
		ImageIcon lefting = new ImageIcon ("lefting.gif");
		JOptionPane.showMessageDialog(null ,players[koko] + " has left the game " ,players[koko] + " has left the game" , JOptionPane.INFORMATION_MESSAGE , lefting );
		snow[0][koko] = 999;		snow[1][koko] = 0;		new_expressing();}
	//--------------------------------------------------------------------------------------------------------------------------
	public static void reaction (int koko ) {                                                        // data
		String white_smile = Character.toString((char)0x263A);
		String black_smile = Character.toString((char)0x263b);
		String smile_1 = " " + white_smile + " ";
		String smile_2 = " " + black_smile + " ";	
	
		for(int f = 0 ; f<players.length ; f++) {
			if (f==0) {     System.out.println(players[f] + "\t"+"===> " + smile_1 + "  current position ===> " + snow[1][f]);}
			else if (f==1) {System.out.println(players[f] + "\t"+"===> " + smile_2 + "  current position ===> " + snow[1][f]);}
			else if (f==2) {System.out.println(players[f] + "\t"+"===> " + " $ " + "  current position ===> " + snow[1][f]);}
			else if (f==3) {System.out.println(players[f] + "\t"+"===> " + " # " + "  current position ===> " + snow[1][f]);}
			if (f==players.length-1) {System.out.println("thrown dice was " +  "🎲 "+ snow[0][koko] + " for " + players[koko]);
			System.out.println("--------------------------------------------------------------------------------------------------------------");}}}
	//-----------------------------------------------------------------------------------------------------------------------------------
	public static void best_friends() {                                                                         // announcements
		ImageIcon friends4 = new ImageIcon ("friends4.png");
		ImageIcon friends3 = new ImageIcon ("friends3.png");
		ImageIcon friends2 = new ImageIcon ("friends2.png");
		ImageIcon friends22 = new ImageIcon ("friends22.png");
		
		
		if  (friends==0 && counter > a1)  {   // all on same cell  
		a1=counter+3;
		JOptionPane.showMessageDialog(null ,"all players on same cell !!!", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends4 );
		//======================================================================================
		}else if (friends==1 && counter > a2)  {        // 0,1,2 on same
		a2=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[1] + " & " + players[2] + "are on the same cell. \n"+"shame on you " + players[3] , "announcement" , JOptionPane.INFORMATION_MESSAGE , friends3 );
		}else if (friends==2 && counter > a3)  {        // 1,2,3 on same
		a3=counter+3;
		JOptionPane.showMessageDialog(null ,players[1] + " & " + players[2] + " & " + players[3] + "are on the same cell. \n"+"shame on you " + players[0] , "announcement" , JOptionPane.INFORMATION_MESSAGE , friends3 );
		}else if (friends==3 && counter > a4)  {        //2,3,0 on same
		a4=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[2] + " & " + players[3] + "are on the same cell. \n"+"shame on you " + players[1] , "announcement" , JOptionPane.INFORMATION_MESSAGE , friends3 );
		}else if (friends==4 && counter > a5)  {        //0,1,3 on same
		a5=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[1] + " & " + players[3] + "are on the same cell. \n"+"shame on you " + players[2] , "announcement" , JOptionPane.INFORMATION_MESSAGE , friends3 );
		//======================================================================================
		}else if (friends==5 && counter > a6)  {        //0=1 2=3
		a6=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " +  players[1] + " on same cell \nand \n" + players[2] + " & " +  players[3] + " on same cell", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends22 );
		}else if (friends==6 && counter > a7)  {        //0=2 1=3
		a7=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " +  players[2] + " on same cell \nand \n" + players[1] + " & " +  players[3] + " on same cell", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends22 );
		}else if (friends==7 && counter > a8)  {        //0=3 1=2
		a8=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " +  players[3] + " on same cell \nand \n" + players[1] + " & " +  players[2] + " on same cell", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends22 );
		//======================================================================================
		}else if (friends==8 && counter > a9)  {        //0=1
		a9=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[1]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );
		}else if (friends==9 && counter > a10)  {        //0=2
		a10=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[2]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );
		}else if (friends==10 && counter > a11) {        //0=3
		a11=counter+3;
		JOptionPane.showMessageDialog(null ,players[0] + " & " + players[3]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );
		}else if (friends==11 && counter > a12) {        //1=2
		a12=counter+3;
		JOptionPane.showMessageDialog(null ,players[1] + " & " + players[2]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );
		}else if (friends==12 && counter > a13) {        //1=3
		a13=counter+3;
		JOptionPane.showMessageDialog(null ,players[1] + " & " + players[3]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );
		}else if (friends==13 && counter > a14) {        //2=3
		a14=counter+3;
		JOptionPane.showMessageDialog(null ,players[2] + " & " + players[3]+ " on the same cell.", "announcement" , JOptionPane.INFORMATION_MESSAGE , friends2 );		}friends = 99;	}
	//--------------------------------------------------------------------------------------------------------------------------------------	
}
