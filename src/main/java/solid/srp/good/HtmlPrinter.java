package solid.srp.good;

public class HtmlPrinter implements Printer {

	public String printPage(String page) {
		return "<div class='page'>" + page + "</div>";
	}

}
