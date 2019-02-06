# Extract-Wikipedia-Infobox-data
How to extract “infobox company” data from wiki dumps

Code:

package infoboxextractor;

import edu.jhu.nlp.wikipedia.*;

public class InfoboxExtractor {
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
         WikiXMLParser parser = WikiXMLParserFactory.getSAXParser("/home/dsteam/wikipedia infobox/demowikidump.xml");
            parser.setPageCallback(new PageCallbackHandler() {
                public void process(WikiPage page) {
                  try {
                    InfoBox infobox=page.getInfoBox();
                    System.out.println(page.getTitle());
                    System.out.println(page.getID());                    
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

