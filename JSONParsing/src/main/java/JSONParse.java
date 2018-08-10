import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

public class JSONParse {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// read from url
		InputStream input = new URL("https://my-json-server.typicode.com/pavelDohnalik/restApi/messages").openStream();
		String inputInString = IOUtils.toString(input, "UTF-8");
		// remove brackets
		String str = inputInString.substring(1, inputInString.length() - 1);
		// split the string into an array
		String[] strArray = str.split("},");
		// add missing brackets
		for (int i = 0; i < strArray.length; i++) {
			if (i != strArray.length - 1) {
				strArray[i] += "}";
			}
		}
		Gson gson = new Gson();
		// print all elements if no arguments are provided
		if (args.length == 0) {
			System.out.print("(");
			for (int i = 0; i < strArray.length; i++) {
				Email email = gson.fromJson(strArray[i], Email.class);
				System.out.print("id=" + email.id + ", from=" + email.from + ", to=" + email.to + ", subject="
						+ email.subject + ", text=" + email.text + ";");
				if (i != strArray.length - 1) {
					System.out.println();
				}
			}
			System.out.print(")");
		// print element by id
		} else if (args[0].equals("-id")) {
			for (int i = 0; i < strArray.length; i++) {
				Email email = gson.fromJson(strArray[i], Email.class);
				if (email.id.equals(args[1])) {
					System.out.print("(id=" + email.id + ", from=" + email.from + ", to=" + email.to + ", subject="
							+ email.subject + ", text=" + email.text + ";)");

				}
			}
		// print custom JSON
		} else if (args.length==8) {
			System.out.println("{");
			System.out.println("\"id\": " + Math.round(Math.random()*10000)+",");
			for (int i = 0; i < args.length-1; i+=2) {
				System.out.println("\""+args[i].substring(1, args[i].length())+"\": \""+args[i+1]+"\",");
			}
			System.out.println("}");
		}

	}
}
