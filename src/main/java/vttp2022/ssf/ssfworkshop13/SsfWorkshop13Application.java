package vttp2022.ssf.ssfworkshop13;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SsfWorkshop13Application {
	private static final Logger logger = LoggerFactory.getLogger(SsfWorkshop13Application.class);
	private static String dirPath = "./resources";


	public static void main(String[] args) {
		SpringApplication app = new  SpringApplication(SsfWorkshop13Application.class);
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
		List<String> opsVal = appArgs.getOptionValues("dataDir");

		if(opsVal != null){
			logger.info("data dir >",(String) opsVal.get(0) );
		}else {
			logger.warn("No directory was provided");
			System.exit(1);
		}
		
	app.run(args);
		
	}
}
