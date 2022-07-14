package vttp2022.ssf.ssfworkshop13;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class SsfWorkshop13Application {
	private static final Logger logger = LoggerFactory.getLogger(SsfWorkshop13Application.class);
	private static String dirPath = "./resources";

	@Bean
	public CommonsRequestLoggingFilter requestLoggerFilter() {
		// need to override some parameters hence need to instantiate
		CommonsRequestLoggingFilter requestLoggingFilter = new CommonsRequestLoggingFilter();
		requestLoggingFilter.setIncludeClientInfo(true);
		requestLoggingFilter.setIncludeHeaders(true);
		requestLoggingFilter.setIncludeQueryString(true);
		requestLoggingFilter.setIncludePayload(true);
		return requestLoggingFilter;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SsfWorkshop13Application.class);
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
		List opsVal = appArgs.getOptionValues("dirData");
		// File file = (File) opsVal.get(0);
		logger.info("opsVal > " + opsVal);

		app.run(args);
		
	}
}
