import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class n2  {
    private static final DateFormat DEFAULT_FORMATTER;

    static
    {
        DEFAULT_FORMATTER = new SimpleDateFormat("dd-MM-yyyy");
        DEFAULT_FORMATTER.setLenient(false);
    }

    public static void main(String[] args)
    {
        for (String dateString : args)
        {
            try
            {
                System.out.println("arg: " + dateString + " date: " + convertDateString(dateString));
            }
            catch (ParseException e)
            {
                System.out.println("could not parse " + dateString);
            }
        }
    }

    public static Date convertDateString(String dateString) throws ParseException
    {
        return DEFAULT_FORMATTER.parse(dateString);
    }
}