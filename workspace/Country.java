public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String cname;
  private String ctl;
  private String lang;
  private String img;

  // add constructors
  public Country(String c,String ct,String l,String i){
    cname = c;
    ctl = ct;
    lang = l;
    img = i;
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getCountry(){
    return cname;
  }
  public String getCapital(){
    return ctl;
  }
  public String getLanguage(){
    return lang;
  }
  public String getImage(){
    return img;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString(){
    String str = cname + "'s capital is " + ctl + " and its primary language is " + lang;
    return str; 
  }
 


  
}