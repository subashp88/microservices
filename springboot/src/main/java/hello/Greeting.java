package hello;
public class Greeting {

 //Variable definitions//
 private final long id;
 private final String content;
 
 //Constructor/setter for variables
 public Greeting(long id, String content) {
  this.id = id;
  this.content = content;
 }
 
 //Getter method for ID variable
 public long getId() {
 return id;
 }
 
 //Getter method for content variable
 public String getContent() {
 return content;
 }
}
