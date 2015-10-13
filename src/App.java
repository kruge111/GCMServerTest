
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyC0MZ4yV4xFzxIi5yg4NZl8jZMj6RK08RE";
        Content content = createContent();

        while (true) {
        	POST2GCM.post(apiKey, content);
        	Thread.sleep (120000);
        }
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bE3MyCV4N75uY3A2SFS63x-AU1YHY-PTN8T50QimG3Z94IVaEKAQz49x7O623yeuz9eUrdGTbsRpsP3iy3DB3D_72OhTCUBx_TTyGG1m3Q-nX7Dco7l3lMvuWPz2jQG0VjPS4sd");
        c.addRegId("APA91bGzYQ9q7HYDahiVuKy1ZFLUhaI4ILGGkfjj7dFGrNEeQG4PVoLA0Uaa0_RX0GIbRRvbqcR3xZQD5t8uuBb0-ZW1OvaDFb-cfbnr3NOufbTqvRnTpoESXd86KpE03OCnyYduvX9i");
        c.createData("Test Title", "Test Message");

        return c;
    }
}