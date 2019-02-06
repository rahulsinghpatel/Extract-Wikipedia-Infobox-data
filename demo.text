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

OUTPUT:

{{Infobox medical condition (new)
| name            = Autism
| image           = Autism-stacking-cans 2nd edit.jpg
| alt             = Boy stacking cans
| caption         = Repetitively stacking or lining up objects is associated with autism.
| field           = [[Psychiatry]]
| symptoms        = Trouble with [[Interpersonal relationship|social interaction]], impaired [[communication]], restricted interests, repetitive behavior 
| complications   =
| onset           = By age two or three  
| duration        = Long-term 
| causes          = [[Heritability of autism|Genetic]] and environmental factors 
| risks           = 
| diagnosis       = Based on behavior and developmental history 
| differential    = [[Reactive attachment disorder]], [[intellectual disability]], [[schizophrenia]] 
| prevention      =
| treatment       = [[Behavioral therapy]], [[speech therapy]], [[psychotropic medication]] 
| medication      =  [[Atypical antipsychotics|Antipsychotics]], [[antidepressants]], [[stimulants]] (associated symptoms)   
| prognosis       = Frequently poor 
| frequency       = 24.8 million (2015) 
| deaths          = 
}}
