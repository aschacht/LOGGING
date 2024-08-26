package Logging;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class LOG implements ABellCalledLOGGING {

	/*
	 * 
	 * 
	 * the wood for the fire of my burnning bunning question i really want to asks
	 */
	public static LOG LOG = LOGGING.LOG();
	public static boolean AREWELOGGING = LOG.isLOGGINGTURNEDONOROFHONESTLYICANTREMEMBER();

	LOGGINGLEVEL THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT = DEFAULTLOGGINGLOGGING;

	private String CURRENT_WORKING_DIRECTORY;

	Map<LOG, ArrayList<PrintWriter>> out_for_given_class = new HashMap<LOG, ArrayList<PrintWriter>>();
	private String FOLDERSTRUCTURE_DEFAULTEDTOBLANK = "";

	public void print(String string_to_print) {
		THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT.print(string_to_print,
				out_for_given_class.get(this));
	}

	private boolean isLOGGINGTURNEDONOROFHONESTLYICANTREMEMBER() {
		if (THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT.isitOFF())
			return true;
		else
			return false;
	}

	public void println(String string_to_print_that_is_printing) {
		THISISTHECURRENTLOGGINGLEVELYOUCANDECIDEDTODOWHATEVERTHEHECKYOUDECIDETODOWITHIT
				.println(string_to_print_that_is_printing, out_for_given_class.get(this));
	}

	public void build_channel() {
	}

	public void flush_built_channel() {
	}

	public void set_current_working_directory(String current_working_directory) {
		CURRENT_WORKING_DIRECTORY = current_working_directory;
	}

	public void close() {

		Set<LOG> keySet = out_for_given_class.keySet();

		for (LOG log : keySet) {
			ArrayList<PrintWriter> arrayList = out_for_given_class.get(log);
			for (PrintWriter printWriter : arrayList) {
				printWriter.close();
			}
		}
	}

	@Override
	public void register_output_forLogging(LOG registerOutput,
			HashMap<String, String> file_Names_And_Folder_Structures_For_Files) {

		ArrayList<PrintWriter> print_writers_for_a_given_class = new ArrayList<PrintWriter>();
		Set<String> filenames = file_Names_And_Folder_Structures_For_Files.keySet();

		try {

			for (String fname : filenames) {
				FOLDERSTRUCTURE_DEFAULTEDTOBLANK = file_Names_And_Folder_Structures_For_Files.get(fname);
				PrintWriter pW = new PrintWriter(
						new FileWriter(CURRENT_WORKING_DIRECTORY + FOLDERSTRUCTURE_DEFAULTEDTOBLANK + "/" + fname));
				print_writers_for_a_given_class.add(pW);

			}
			out_for_given_class.put(registerOutput, print_writers_for_a_given_class);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
