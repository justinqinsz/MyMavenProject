package maven.org.MyMavenProject;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        //System.out.println( "test for artifact direction" );
        
        try {
        	int a = 1;
        	int b = 0;
        	int c = a / b;
        	System.out.println( "test for artifact direction 1" );
		}
        catch (Exception a) {
            
        }
        catch (ArithmeticException a) {
		    
		}finally {
			System.out.println( "test for artifact direction 2" );
		}
    }
}
