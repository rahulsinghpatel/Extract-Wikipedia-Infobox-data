package infoboxextractor;

//import wikiInfoBox.InfoBox;
//import wikiInfoBox.PageCallbackHandler;
//import wikiInfoBox.WikiPage;
//import wikiInfoBox.WikiTextParserException;
import edu.jhu.nlp.wikipedia.*;

public class InfoboxExtractor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 WikiXMLParser parser = WikiXMLParserFactory.getSAXParser("/home/dsteam/wikipedia infobox/demowikidump.xml");
	        parser.setPageCallback(new PageCallbackHandler() {
	            public void process(WikiPage page) {
	              try {
	                InfoBox infobox=page.getInfoBox();
	                System.out.println(infobox.dumpRaw());
	            } catch (WikiTextParserException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	               //do something with info box
	            }
	        });
	        parser.parse();
	}
}

