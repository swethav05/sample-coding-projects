package curl;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CurlExample {
    public static void main(String[] args) throws Exception {
        //String command = "curl -X GET https://postman-echo.com/get?foo1=bar1&foo2=bar2";
        String command =
                "curl -H \"Authorization: 1AAuth eyJ1c2VySWQiOiJWU1dFVEhBIiwib3JnYW5pemF0aW9uIjoiMUEifQ==\" -X GET http://cfts.ihg.iad.webservices.1a.amadeus.net:80/int-prd/rest-admin/v1/hotel/reports/ds/IHG/RateConfigurationRule/search?RateConfigurationRule$data.scope.propertyCode=ABCDE&profile=RFE";
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        processBuilder.directory(new File("/home/"));
        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        InputStream error = process.getErrorStream();
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();
        System.out.print(result);

        System.out.print("");
    }
}
