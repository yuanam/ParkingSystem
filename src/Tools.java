
import java.time.*;
import java.util.*;

public class Tools {

    // This method can get the time of car enter
    // 获得进入时间
    public static int getTime() {
        int enterTime = LocalTime.now().getHour() * 100 + LocalTime.now().getMinute();
        return enterTime;
    }

    // 计算价格
    public int countPrice(int enterTime) {
        int yourPrice = 0;
        return yourPrice;
    }

    // 获得帮助
    public static void getHelp() {
        System.out.println("Help list!");
    }

    // 获得位置
    public static Location getLocation() {

        // Initialize the variable
        int Floor = 0;
        String Area = "A";
        int Number = 1;

        Location myLocation = new Location(Floor, Area, Number);

        return myLocation;
    }
}
