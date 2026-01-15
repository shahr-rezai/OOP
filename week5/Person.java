public abstract class Person {
  private String name;
  private String email;

  Person(String name, String email){
    this.name=name;
    this.email=email;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public void setEmail(String email){
    this.email=email;
  }

  public String getEmial(){
    return email;
  }

  public abstract String  getDetails();


  }
