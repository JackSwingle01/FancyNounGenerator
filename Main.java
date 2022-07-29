
import java.util.Random;
//import java.io.FileNotFoundException;

class Main {
  
  public static void main(String[] args) {

    

    String s = new String();

    for(int i = 0; i <30; i++){
      s = "";
      s = FancyNoun(s);
      System.out.println(s);
    }
   
  }

  public static String FancyNoun(String s){

    Random r = new Random();
    int n = r.nextInt(2);

    s = OrnateNoun(s);

    if(n==0){
      //s = OrnateNoun(s);
    }else if(n==1){
      s = Preposition(s);
    }
    return s;
  }

  public static String OrnateNoun(String on){
    
    Random r = new Random();
    int n = r.nextInt(3);

    if(n==0){
      on = Article(on);
    }else if(n==1){
      on = Adjective(on);
    }else if(n==2){
      on = Noun(on);
    }

    return on;
  }

  public static String Preposition(String s){

    Dictionary d = new Dictionary();
    String p = new String();
    p = d.getRandomPreposition();
    s = s.concat(p + " ");

    s = FancyNoun(s);

    return s;
  }

  public static String Article(String s){

    
    Random r = new Random();
    int n = r.nextInt(2);

    if(n==0){
      s = s.concat("a ");
    }else if(n==1){
      s = s.concat("the ");
    }

    n = r.nextInt(2);
    if(n==0){
      s = Adjective(s);
    }else if(n==1){
      s = Noun(s);
    }

   return s;
  }

  public static String Noun(String s) {

    Dictionary d = new Dictionary();
    String n = new String();
    n = d.getRandomNoun();
    s = s.concat(n + " ");
    
    return s;
  }

  public static String Adjective(String s) {

    Dictionary d = new Dictionary();
    String a = new String();
    a = d.getRandomAdjective();
    s = s.concat(a + " ");

    Random r = new Random();
    int n = r.nextInt(2);

    if(n==0){
      s = Adjective(s);
    }else if(n==1){
      s = Noun(s);
    }

    return s;
  }

  public static void LoadDictionary(){

  }
}

