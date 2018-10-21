import PSNYHack.*;

import java.util.*;

public class Main {
 
	public static void main(String[] args) {
 
        PSNYHackCSVFileUtil procfile = new PSNYHackCSVFileUtil();

        List<PortfolioVO> results = 
                procfile.processFile("PSNYHack_Portfolio_PREV_EOD.csv");

      for (int i=0 ; i< results.size(); i++) {
        System.out.println("Company: " + 
                              results.get(i).CompanyName +
                            " -- Price: " +
                              results.get(i).Price);
      }
	}


}