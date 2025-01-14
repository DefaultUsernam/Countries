// Student: Ulises Cantor
// Teacher: Mr. Menchukov
// Date: 1/13/2025
// This creates the Country class and constructors which store instance variables relating to the country's name, capital, language, and image file


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
  // Precondition: has a country
  // Postcondition: returns a country
  public String getCountry(){
    return cname;
  }
  // Precondition: has a capital
  // Postcondition: returns a capital
  public String getCapital(){
    return ctl;
  }
  // Precondition: has a language
  // Postcondition: returns language
  public String getLanguage(){
    return lang;
  }
  // Precondition: has an image
  // Postcondition: returns image
  public String getImage(){
    return img;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."

  // Precondition: No null String for the country's name, capital, or language
  // Postcondition: Returns the description of the country
  public String toString(){
    String str = cname + "'s capital is " + ctl + " and its primary language is " + lang;
    return str; 
  }
 


  
}