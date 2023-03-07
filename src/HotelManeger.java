import java.math.BigDecimal;
import java.time.LocalDate;
import model.entities.*;

public class HotelManeger {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.setName("Hotel Name");
        hotel.setCnpj("646464");
        hotel.setPhone("99999999");
        hotel.setCheckin(LocalDate.now());
        hotel.setCheckout(LocalDate.now());

        createRoomTypes(hotel);
        createExtraServices(hotel);

        System.out.println(hotel);
    }

    public static void createExtraServices(Hotel hotel) {
        ExtraService extraService;
        for (int i = 0; i < 3; i++) {
            extraService = new ExtraService();
            extraService.setName("Service - " + (i + 1));
            extraService.setDescription("Descripition Service - " + (i + 1));
            extraService.setPrice(BigDecimal.valueOf(10.99 * (double) (i + 1)));

            hotel.addExtraService(extraService);
        }

    }

    public static void createRoomTypes(Hotel hotel) {
        RoomType roomType;
        for (int i = 0; i < 3; i++) {
            roomType = new RoomType();
            roomType.setName("RoomType - " + (i + 1));
            roomType.setDescription("Descripition RoomType - " + (i + 1));
            roomType.setPrice(BigDecimal.valueOf(10.99 * (double) (i + 1)));

            hotel.addRoomType(roomType);
        }

    }
}
