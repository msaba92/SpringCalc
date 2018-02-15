package calctest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CalcController {

	private static String template = "The result of %s %s %s is %s.";

    @RequestMapping("/")
    public String calc(
    				   @RequestParam(value="op") String op,
    				   @RequestParam(value="x") float a,
    				   @RequestParam(value="y") float b
    				   ){

		if (Objects.equals(op, "sum")) {
			int x = Math.round(a);
			int y = Math.round(b);
			int result = x + y;
			String t = String.format(
									 template,
									 Integer.toString(x),
									 "+",
									 Integer.toString(y),
									 Integer.toString(result)
									 );
			return t;
			}
		else if (Objects.equals(op, "sub")) {
			int x = Math.round(a);
			int y = Math.round(b);
			int result = x - y;
			String t = String.format(
									 template,
									 Integer.toString(x),
									 "-",
									 Integer.toString(y),
									 Integer.toString(result)
									 );
			return t;
			}
		else if (Objects.equals(op, "div")) {
			float result = a / b;
			String t = String.format(
									 template,
									 Float.toString(a).replaceAll("\\.?0*$", ""),
									 "/",
									 Float.toString(b).replaceAll("\\.?0*$", ""),
									 Float.toString(result).replaceAll("\\.?0*$", "")
									 );
			return t;
			}
		else if (Objects.equals(op, "mult")) {
			float result = a * b;
			String t = String.format(
					 template,
					 Float.toString(a).replaceAll("\\.?0*$", ""),
					 "*",
					 Float.toString(b).replaceAll("\\.?0*$", ""),
					 Float.toString(result).replaceAll("\\.?0*$", "")
					 );
			return t;
			}
		else {
			return "The operator is incorrect. It can only be one of sum, sub, div, mult.";
		    }
	}

}
