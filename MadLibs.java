public class MadLibs {
  /*
   This program generates a mad libbed story.
   Author: Andres R. Bucheli
   Date: 10/06/2023
  */
  	public static void main(String[] args){
      String name1 = "Shraga";

      String adjective1 = "happy";
      String adjective2 = "smart";
      String adjective3 = "beautiful";

      String verb1 = "run";

      String noun1 = "orange";
      String noun2 = "pencil";
      String noun3 = "laptop";
      String noun4 = "table";
      String noun5 = "mountain";
      String noun6 = "robot";

      String name2 = "Oksana";

      int number = 8;

      String place1 = "Moscow";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}