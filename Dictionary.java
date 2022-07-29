import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

class Dictionary{

  Dictionary(){
    
    File nounFile = new File("nouns.txt");
    try{
      
      Scanner ns = new Scanner(nounFile);
      while(ns.hasNextLine()){
        NounList.add(ns.nextLine());
      }
      ns.close();
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    //fills noun list from txt

    File adjFile = new File("adjectives.txt");
    try{
      Scanner as = new Scanner(adjFile);
      while(as.hasNextLine()){
        AdjectiveList.add(as.nextLine());
      }
      as.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    //fills adjective list from text file

    File prepFile = new File("prepositions.txt");
    try{
      Scanner ps = new Scanner(prepFile);
      while(ps.hasNextLine()){
        PrepositionList.add(ps.nextLine());
      }
      ps.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  public String getRandomNoun(){

    Random r = new Random();
    
    int n = r.nextInt(NounList.size());

    return NounList.get(n);
  }

  public String getRandomAdjective(){

    Random r = new Random();
    
    int n = r.nextInt(AdjectiveList.size());

    return AdjectiveList.get(n);
  }

  public String getRandomPreposition(){
    
    Random r = new Random();
    
    int n = r.nextInt(PrepositionList.size());

    return PrepositionList.get(n);

  }

  private ArrayList<String> NounList = new ArrayList<String>();
  private ArrayList<String> AdjectiveList = new ArrayList<String>();
  private ArrayList<String> RelPronounList = new ArrayList<String>();
  private ArrayList<String> PrepositionList = new ArrayList<String>();


}