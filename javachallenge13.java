public class Main {

  public static void main(String[] args) {
    CountWords.stringWordCount("This program is to count words");
    
    CountWords.wordCountUsingSplit("count words using   split  ");
  }
	
  public static void stringWordCount(String str){
    int count = 1;
    for(int i = 0; i < str.length() - 1; i++){
      // If the current char is space and next char is not a space
      // then increment count
      if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
        count++;
      }
    }
    System.out.println("Count of words in String - "  + count);
  }
	
  // This method uses split method to count words
  public static void wordCountUsingSplit(String str){
    // regex "\\s+" matches any number of white spaces 
    String[] test = str.trim().split("\\s+");
    System.out.println("Count of words in String - "  + test.length);
  }
}
