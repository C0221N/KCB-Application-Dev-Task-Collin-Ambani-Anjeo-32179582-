public class API
{
  public static void main( String[] args ) throws Exception
  {
    String users;
    if (users == null || users.isEmpty()) {
      System.out.println("No user found.");
  } else {
      System.out.println("User:");
      for (User user : users) {
          System.out.printf("%s (%s)\n", user.getName(), user.getId());
      }
    
  }
}