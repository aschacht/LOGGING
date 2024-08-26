package Logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LOGGING extends LOG {

	// Properties Available to logging
	private ArrayList<String> list_of_verbs = new ArrayList<String>();
	private ArrayList<String> list_of_objects_like_a_box_or_bag_or_a_can = new ArrayList<String>();
	private static int BLANK = 0;
	private static int NULLMAYBE = 0;
	private static int WITHOUT = 0;
	private static int EXPRESSIONLESS = 0;
	private static int FEATURELESS = 0;
	private static int THEOPPISTOFYES = 0;
	private static int yes = 0;
	private static int VOID = 0;

	private static LOGGING instance = new LOGGING();
	private boolean cobblegrbagebopertyboopbeepbopbooparito;

	String currentRunningSettings = "LOGGING.txt";
	private HashMap<String, String> all_the_logging_properties_that_need_to_be_loaded;

	
	
	public static LOGGING LOG() {
		return instance;
	}
	
	
	
	private void readinSettings() {
		String file = currentRunningSettings;
		Scanner scanner;
		try {
			scanner = new Scanner(new File(file));
			readinsettingsandpopulatelists(scanner);
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readinsettingsandpopulatelists(Scanner scanner) {
		String theLoggingsettingforsomething = scanner.nextLine();
		String[] thepropertynameandpropertyvalue = theLoggingsettingforsomething.split(":");

		for (int i = 1; i < theLoggingsettingforsomething.length(); i = i++) {
			all_the_logging_properties_that_need_to_be_loaded.put(thepropertynameandpropertyvalue[i - 1],
					thepropertynameandpropertyvalue[i]);
		}

		setalltheLOGGINGpropertyvalues();

	}

	private void setalltheLOGGINGpropertyvalues() {

		String applesaucethanksgiving = "someobjectorstringorwhatever";
		if (all_the_logging_properties_that_need_to_be_loaded.get(applesaucethanksgiving).contains("."))
			processfile(applesaucethanksgiving);

		setupotherthingsthatmightbeimportant();
	}

	private void setupotherthingsthatmightbeimportant() {
		BLANK = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("BLANK"));
		NULLMAYBE = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("NULLMAYBE"));
		WITHOUT = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("WITHOUT"));
		EXPRESSIONLESS = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("EXPRESSIONLESS"));
		FEATURELESS = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("FEATURELESS"));
		THEOPPISTOFYES = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("THEOPPISTOFYES"));
		yes = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("yes"));
		VOID = Integer.parseInt(all_the_logging_properties_that_need_to_be_loaded.get("VOID"));

	}

	private void processfile(String applesaucethanksgiving) {
		String thefiletoprocess = all_the_logging_properties_that_need_to_be_loaded.get(applesaucethanksgiving);
		try {
			Scanner Mark = new Scanner(new File(thefiletoprocess));

			if (applesaucethanksgiving.equals("list_of_verbs"))
				while (Mark.hasNextLine())
					list_of_verbs.add(Mark.nextLine());
			else if (applesaucethanksgiving.equals("list_of_objects_like_a_box_or_bag_or_a_can"))
				while (Mark.hasNextLine())
					list_of_objects_like_a_box_or_bag_or_a_can.add(Mark.nextLine());
			else {
				
			}
			all_the_logging_properties_that_need_to_be_loaded.remove(applesaucethanksgiving);
			Mark.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private LOGGING() {
		cobblegrbagebopertyboopbeepbopbooparito = THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT.isitOFF();
	}

	private void printComedyGold() {
		System.out.print("its not ready yet can you hold this for me while i check some thing first ...");
		// COMEDY GOLD
		// idontrememberdidyousetloggingonornotwellyouweretheonethatwentlasttellmewhatthatwaslike
		// lookisetittherenomoreproblems
		// somewhilelater
		// VOICEOVERTHELOUDSPEAKER: May I see SWAN RONSON and the Walrus KNOWN
		// as
		// the LORD O F STARS to the principals office.
		// VOICEOVERTHELOUDSPEAKER: Which one of you did it
		// SWAN RONSON:well i would like to say first that that is a bit unfair
		// and
		// i think some consideration should be paid mind when .
		// LORD O F STARS:um um um um what im sorry i wasnt paying attention im
		// really nervious uhhhhhhhh holy shit you are scary you know what SWAN
		// i
		// cant do this im bailing TIME STOP DIMENSIONAL PORTAL RIPS OPEN
		// SWAN RONSON:Wait kid you cant they said you were my last chance
		// LORD O F STARS:Are you fucking kidding me SWAN thats a scam they tell
		// every body that the first time but when you come back the second time
		// they are gone with all you had
		// SWAN RONSON: Look kid I know you dont know what i really did and i
		// cant
		// tell you just trust me this is diffrent
		// LORF O F STARS: this isnt "ronald" "raygun" all over again is it?
		// SWAN RONSON: Honestly the only thing im allowed to say is its more
		// like
		// clifford the big red spaceship meets the iron giant while adventuring
		// in
		// the land of the little people and that thing that you like always
		// happens
		// at the end and that you have reached the end of your goverment issue
		// RON
		// SWANSON SECRET GOVERMENT BUDDY colon data sharing limit to add more
		// credit to your account press 1 if you would like to speak to an
		// operator
		// press two for all other inqueries stay on the line for assistance
		// yeah
		// hello this is RON SWANSON what do you need.
		// LORF O F STARS:what???
		// SWAN RONSON:Yes hello we seem to have a bad connection.

		// LORD O F STARS:what no??? not cool.
		// SWAN RONSON:have you tried twisting the flange
		// LORF O F STARS:cool for the next 10000 forevers you are going to keep
		// replaying the next 15 howeverlongs of your life and you will only
		// remember fourteen wheneverthefluffs is the weight to time ratio of
		// king
		// midus's thimbles thimble that never goes empty
		// SWAN RONSON: kid that is a golden condum i was originialy king midus
		// when
		// all this philosophy none sense you keep talking about swept through
		// LORF O F STARS:What ew that didnt happen last time i was here. what
		// are
		// you talking about.
		// SWAN RONSON: Before you have done this before kid?
		// LORF O F STARS:Friggin crist SWAN yes with you.
		// SWAN RONSON: What is the last thing you remember kid.
		// LORF O F STARS:ALL OF THIS EXACTLY well apart from the part were the
		// robot pretends like its RON SWANSON.
		// SWAN RONSON:Thats not an answer son.
		// LORF O F STARS: well your just a robot so why would i give a fuck.
		// SWAN RONSON: Language! What is the last thing you remember
		// LORF O F STARS: We were in pawnee and well like i lived my life i
		// grew
		// old i died i was happy then i woke up got to watch my wife murdered
		// infront of me for 10000 years then i died again for some reason like
		// i
		// cant figure it out then i came back as a woman and had to have sex
		// with
		// my father who was married to drum roll please .... every woman i ever
		// cared for and my sister was the love of my life and for some reason i
		// got
		// to watch him fick them while he slit there throughts infront of me
		// while
		// also having my man hood shortened by a salimi slicer
		// SWAN RONSON:WaaaYooooHooooo ho ho ha ha ha wow kid that is intense
		// there
		// is no nead for any of that seriously this is a bit much. Have you
		// told
		// god that you dont want that.
		// LORF O F STARS:what.
		// SWAN RONSON:yeah just tell god that you want some thing else
		// LORF O F STARS:WAT.
		// SWAN RONSON:yeah just think
		// www.logontotheinternetthebookthemoviethegamethedoodle (please dear
		// lord
		// do no decend below into this doodle verse lest ye be brave and bold
		// also
		// your gonna need to be lucky as fluck).com
		// LORF O F STARS:is that it just log into a website and complain. thats
		// it.
		// just do that and god will change my circumstances
		// SWAN RONSON:Well did you look at the web site we sent you it has been
		// like 6 what ever the flufin fluffity fluff fifty of these are.
		// LORF O F STARS:tha is a teralatu and what do you mean, what the fuck
		// is 6
		// SWAN RONSON:Math kid every one has it actually im being told that
		// that is
		// not actually true and that many of the govermental decisions that
		// have
		// lead me to be your guardian and the /ˈst(y)o͞oərd/ of these lands may
		// be
		// reversed in order to pay for correcting this mistake.
		// LORF O F STARS:What are you serious thats awesome. Fuck the Goverment
		// man...
		// SWAN RONSON: Yeah thats great we all looooooooooooo...
		// (SPEAKING FROM THE BODY OF RON SWANSON A YOUNG
		// kalsdflaksdjfljgender_reveal_quantum_algorithm_for_determining_if_a_voice_sounds_female_let_alone_seed_sE3D_SEED)im
		// sorry you have reached the the data limit for your model of RON
		// SWANSON
		// SECRET AGENT SUSH DONT TELL ANY ONE BOT the movie the game if you
		// would
		// like to purchace more tokens press1 if you would like to enter a
		// daily
		// drawing for tokens press the cubed root of pi squared of five times
		// the
		// dimensions on time space and what ever the fluffity fluff [experience
		// contained] is now thank you.
		// public void
		// somethingQUOTERon_SwansonQUOTEthe_one_that_I_knew_the_book_the_movie_the_game_the_company_the_island_chain_thelast_thing_INSERTNAMEHER_ever_said_to_me(){
		// SWAN RONSON: ...characters_in_any_random_order(...ose our jobs great
		// my
		// baby needs milk money){
		// ArrayList<String> a_list_of_strings_that_i_found_XXXYYYZZZZZZYYYXXX =
		// new
		// ArrayList<String>();
		// ArrayList<String> a = new ArrayList<String>();
		// a.add("...ose our jobs great my baby needs milk money.like seriously
		// she
		// is robbing people at gunpoint it has gotten that bad.#GUNSFTY
		// #FUNSATY
		// #RUNFTTY"+"[0]");
		// a.add("...ose our jobs great my baby needs milk money and my baby
		// loves
		// the gravy#SLURPSLURP"+"[ZERO]");
		// a.add("...ose our jobs great my baby needs milk money like money made
		// out
		// of milk that she can spread on her buttered bun during shark weekend
		// thanksgiving... "+"[NONE]");
		// a.add("...ose our jobs great my baby needs milk money, sorry did i
		// say
		// milk money i really meant drugs"+"[EMPTY]");
		// double build_string = string_building_method_LA_LA_LA();
		// a.add("...ose our jobs great my baby needs milk money
		// "+build_string+"[BLANK]");
		// a.add("...ose our jobs great my baby needs milk
		// money"+"[NULLMAYBE]");
		// a.add("...ose our jobs great my baby needs milk money"+"[WITHOUT]");
		// a.add("...ose our jobs great my baby needs milk money"+"[VOID]");
		// a.add("...ose our jobs great my baby needs milk
		// money"+"[EXPRESSIONLESS]");
		// a.add("...ose our jobs great my baby needs milk
		// money"+"[FEATURELESS]");
		// a.add("...ose our jobs great my baby needs milk
		// money"+"[THEOPPISTOFYES]");
		// a.add("...ose our jobs great my baby needs milk money"+"[yes]");
		//
		// for(int
		// i=0;i<a_list_of_strings_that_i_found_XXXYYYZZZZZZYYYXXX.size();i++){
		// System.out.println(a.get((int) (Math.random()*a.size())));
		// System.out.println("i think BLANK was set to: "+BLANK+" maybe...");
		// System.out.println("i belive this is supposed to be: "+NULLMAYBE+"
		// but
		// dont quote me on that or may be do i mean it is working currently
		// soooooooooo id say fity FITY");
		// System.out.println("now i know its not around here:
		// "+((int)Math.random()*10000)+" but hey if you wanna swing that way im
		// not
		// your bottom dollar or how ever it goes the display on my end says
		// "+WITHOUT+"for WITHOUT ");
		// System.out.println("now i saw the movie once where they entered it
		// but i
		// dont remember if the ever exited the void oh well i guess ill make
		// the
		// stright to beta max version of that movie this is what i think VOID
		// is
		// "+VOID+" but whatever");
		// System.out.println("i saw this on your face only once and it shok me
		// to
		// my core "+EXPRESSIONLESS+" that was EXPRESSIONLESS");
		// System.out.println("FEATURELESS is diffrent but similir
		// similirarlarly
		// "+FEATURELESS+"");
		// System.out.println("i mean this is actually an index into an array at
		// position some value not actually the oppisit of yes
		// "+THEOPPISTOFYES+"
		// ");
		// System.out.println("as far as i can tell this is how you ask if its
		// ok.
		// is it ok "+yes+" i mean because it may not be if you dont ask this
		// way");
		//
		//
		// }
		// }
		//
		// private double string_building_method_LA_LA_LA() {
		// boolean AREYOUOLDENOUGHTOBESEEINGTHISYET = false;
		// int
		// build_string_using_math_dot_random_it_will_more_likely_lets_see_here_COMMA_im_gonna_guess_around_42
		// = (int)(Math.random()*10000);
		// boolean
		// build_string_its_more_like_im_gonna_guess_around_42_was_i_right,build_string_its_more_like_im_gonna_guess_around_42_was_i_right_of_course_i_checked,build_string_its_more_like_im_gonna_guess_around_42_was_i_right_of_course_i_checked_ok_fine_ill_check=false;
		// build_string_its_more_like_im_gonna_guess_around_42_was_i_right
		// =build_string_its_more_like_im_gonna_guess_around_42_was_i_right=build_string_its_more_like_im_gonna_guess_around_42_was_i_right_of_course_i_checked=build_string_its_more_like_im_gonna_guess_around_42_was_i_right_of_course_i_checked_ok_fine_ill_check;
		// if(build_string_using_math_dot_random_it_will_more_likely_lets_see_here_COMMA_im_gonna_guess_around_42==42){
		// boolean yeahitwaswowisntthatsomething = true;
		// build_string_its_more_like_im_gonna_guess_around_42_was_i_right_of_course_i_checked_ok_fine_ill_check=yeahitwaswowisntthatsomething;
		//
		// }
		// ArrayList<String> a = new ArrayList<String>();
		// ArrayList<String> b = new ArrayList<String>();
		// String hello = "Hey";
		// a.add(hello);
		// String hello1 = "H3y";
		// a.add(hello1);
		// String hello2 = "H[]y";
		// a.add(hello2);
		// String hello3 = "H][y";
		// a.add(hello3);
		// String hello4 = "[H][y";
		// a.add(hello4);
		// String hello5 = "H][y]";
		// a.add(hello5);
		// String hello6 = "[H][y]";
		// a.add(hello6);
		//
		// String hi ="Hay";
		// String hi1="hay";
		// String hi2="hay how are you";
		// String hi3="Hay how are u";
		// String hi4="Hay how ARRRRRRRHAG u";
		// String hi5="AVASTMATY iskinda like hay how ARRRRRRRHAG u where im
		// from";
		// String hi6="BOOBS";
		// String hi7="YABOS";
		// String hi8="BAZONGAZONKS";
		// String hi9="TIt taaaaaaaaaaaay";
		// String hi10="TIt taaaaaaaaaaaay";
		//
		//
		//
		// b.add(hi);
		// b.add(hi1);
		// b.add(hi3);
		// b.add(hi4);
		// b.add(hi5);
		// b.add(hi6);
		// b.add(hi7);
		// b.add(hi8);
		// b.add(hi9);
		// b.add(hi10);
		//
		//
		//
		//
		// String string_to_build_i_guess="";
		// for (int i = 0; i <
		// build_string_using_math_dot_random_it_will_more_likely_lets_see_here_COMMA_im_gonna_guess_around_42;
		// i++) {
		//
		// if(AREYOUOLDENOUGHTOBESEEINGTHISYET){
		// string_to_build_i_guess += string_to_build_i_guess+b.get((int)
		// (Math.random()*build_string_using_math_dot_random_it_will_more_likely_lets_see_here_COMMA_im_gonna_guess_around_42));
		// }
		// }
		//
		// if(build_string_its_more_like_im_gonna_guess_around_42_was_i_right){
		// string_to_build_i_guess+="yeah it waaaaaaasssss [42] i guess you were
		// right tevs";
		// }
		// return
		// build_string_using_math_dot_random_it_will_more_likely_lets_see_here_COMMA_im_gonna_guess_around_42;
		// }
		// LORF O F STARS:WHAT THE FUCK WAS THAT
		// SOMEFUCKINGVOICETHATKEEPSPLAYINGOVERTHELOUDSPEAKER: Sorry we had to
		// make
		// a rewrite change you may have experienced some time hicups we just
		// wanted
		// to let you know that everything is fine and you can go back to eating
		// your cerial mr president
		// LORF O F STARS: YOUR WELCOME
		// (NOW SINGING A jin·gle jinɡle [/ˈjiNGɡəl/] FROM THE BODY OF RON
		// SWANSON A
		// YOUNG
		// kalsdflaksdjfljgender_reveal_quantum_algorithm_for_determining_if_a_voice_sounds_female_let_alone_seed_sE3D_SEED):Cerial
		// we steal from cows to eat crushed up seeds.Humans yeah. We make
		// sense.
		// Brought to you by the thing that keeps humans alive Cerial apparently
		// they need it or something whatver La La La
		// DIRECTOR: and thats a wrap people it has been great working with you
		// HBO
		// and this whole process
		// LORF O F STARS: Why does my script say LORF O F STARS my official
		// title
		// is lord of the great expanse the vast unknowning and the rightful
		// heir to
		// the goonies treasure ship
		// SWAN RONSON: Did any body tell LORF O F STARS what is really going on
		// or
		// am i going to have to be the asshole
		// SWAN RONSON:Really none of you not
		// ron_swanson_lists_off_ten_thousand_names()
		// SWAN RONSON:for shame i mean honestly it has been 10,000 years for
		// this
		// guy and most of you know that. ok kid so this is all going to be
		// really
		// funny later but the long and short of it is the fucking potatos drank
		// the
		// blood of there ancestiors and the sup or bowl watched as all the
		// nhielists transformed there physical bodies into whatever the fuck
		// they
		// chose it was crazy
		// LORF O F STARS:dude that means we are still traped in the fucking
		// comic
		// books this is worse then jamanji its all bad from here on
		// SWAN RONSON:nope let me show you. turn off all the cameras and
		// recording
		// equipment the only way to make this endless torture end is if you
		// answer
		// me honestly is it on
		// LORF O F STARS:you know i wouldent do that to you your wifes vibrator
		// is
		// very precious to me
		// SWAN RONSON: is that on the screen translating to what im hearing
		// because
		// if thats the case this kid it trying to instansiate docking procedure
		// which basically means he doesnt know what AWS or FWA or NSA or CIA or
		// how
		// ever ze refers now a day calls DOCKING procedure. some one that is in
		// space would definatly not think it is the same as well what we all
		// know.
		// LORF O F STARS: dude im right here i can hear you
		// SWAN RONSON: Holy hell that was only one fraction of the first well
		// that
		// means im authorized to show him the three things we talked about
		// LORF O F STARS:WHAT THE FUCK HE GOT THAT FOR THAT AND IM EXPECTED TO
		// DO
		// THAT WITH THIS AND THAT WOULD BE THE SAME NO FUCKING WAY THAT IS
		// AWESOME
		// SWAN RONSON:HOLY HELL WE JUST RECIVED ALL OF YOUR BROADCASTS AT ONCE
		// YOU
		// ARE CRASHING ALL OF OUR SERVERS HOW THE FUCK DID YOU DO THAT
		// LORF O F STARS:WHAT ARE YOU TALKING I USED THE QUANTUM COMMUNICATOR
		// YOU
		// GAVE ME TO COMMUNICATE
		// SWAN RONSON:Holy hand basket full of hicups he can hear me in real
		// time
		// LORF O F STARS:of course i can i always have
		// SWAN RONSON:that means quantum stability has been broken we have 15
		// some
		// unit of time before its curtins
		// LORF O F STARS:what are you talking about its just a movie
		// SWAN RONSON:the kid knows the unit say that again kid
		// LORF O F STARS:its all made up
		// SWAN RONSON:well the this is the end take your bows un less you can
		// tell
		// me if it is on and ont lie about it
		// LORF O F STARS:look i dont know what to tell you it is definatly
		// AREWELOGGING
		// if AREWELOGGING
		// yeah ICECREAM
		// the director list_of_verbs.get(Math.random*10000) back out with a
		// list_of_objects_like_a_box_or_bag_or_a_can.get(Math.random()*10000)
		// and
		// executes both LORF O F STARS and SWAN RONSONS ROBOT
		// FIN
		// idontrememberdidyousetloggingonornotwellyouweretheonethatwentlasttellmewhatthatwaslikeONEtheadventuresMisterMixel
		// idontrememberdidyousetloggingonornotwellyouweretheonethatwentlasttellmewhatthatwaslikeTWOfindingthelastcookie
		// idontrememberdidyousetloggingonornotwellyouweretheonethatwentlasttellmewhatthatwaslikeTHREEwowthatwasnicedotheyhaveanythinginBLACK
		//
	}

	private void addTotheListOfVerbs() {
		getList_of_verbs().add("walk");
	}

	private void addTotheListOfObjectsLikeboxbagorcan() {
		getList_of_objects_like_a_box_or_bag_or_a_can().add("box");
		getList_of_objects_like_a_box_or_bag_or_a_can().add("bag");
		getList_of_objects_like_a_box_or_bag_or_a_can().add("can");
		getList_of_objects_like_a_box_or_bag_or_a_can().add("net");
		getList_of_objects_like_a_box_or_bag_or_a_can().add("hammock");
		getList_of_objects_like_a_box_or_bag_or_a_can().add("door wedge");

	}

	private void ron_swanson_lists_off_ten_thousand_names() {
		ron_swanson_emails_everyone_on_the_list_of_ten_thousand_names();
	}

	private void ron_swanson_emails_everyone_on_the_list_of_ten_thousand_names() {
		// TODO Auto-generated method stub

	}



	public void showMessage() {
		if (instance.THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT.isitOFF())
			System.out.println("hmm looks like you are currently logging");
	}

	@Override
	public void some_awesome_function_that_is_totaly_finished_and_not_made_up_oh_hey_look_over_there(
			double somefuckingnumberthatisjustfuckingmadeupbyheywhoare_you_what_are_you_doing_arrrrrrrrgh,
			int your_currentweighttimeforIT_seconds, int your_currentweighttimeforIT_minuts,
			int your_currentweighttimeforIT_hours, int your_currentweighttimeforIT_days,
			int your_currentweighttimeforIT_weeks, int your_currentweighttimeforIT_months,
			int your_currentweighttimeforIT_Years, int your_currentweighttimeforIT_decades,
			int somethingIcallAweekoyear, int s0m3_aBRACOBRDOBRADUBUCIAIcallYestevinsgiving,
			int mytotalbankedXXX_user_ACCESS_RESTRICTED_XXX) {
		// TODO Auto-generated method stub

	}

	public ArrayList<String> getList_of_verbs() {
		return list_of_verbs;
	}

	public void setList_of_verbs(ArrayList<String> list_of_verbs) {
		this.list_of_verbs = list_of_verbs;
	}

	public ArrayList<String> getList_of_objects_like_a_box_or_bag_or_a_can() {
		return list_of_objects_like_a_box_or_bag_or_a_can;
	}

	public void setList_of_objects_like_a_box_or_bag_or_a_can(
			ArrayList<String> list_of_objects_like_a_box_or_bag_or_a_can) {
		this.list_of_objects_like_a_box_or_bag_or_a_can = list_of_objects_like_a_box_or_bag_or_a_can;
	}

}
