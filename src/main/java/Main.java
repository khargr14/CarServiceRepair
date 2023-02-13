import services.CarInfoService;
import services.UserinfoService;

public class Main
{
    public static void main( String[] args )
    {
        new CarInfoService().addNewCar(2017,"2OOERTYY","234RTIF");
new UserinfoService().addNewUser("Kay",2,21);
        new UserinfoService().addNewUser("Kadin",3,22);
new UserinfoService().delete(1);

    }
}
