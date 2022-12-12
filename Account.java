import javax.lang.model.element.Name;
import java.util.jar.Attributes;

public class Account {
    private String Name;
    private Integer Room;
    private String RoomType;
    private String BedType;
    private Integer PhoneNumber;
    private Integer Checkin;
    private Integer Checkout;

    public Account() {
    }
    public Account(String Name)
    {
        this.setName(Name);
    }

    public Account(
            String Name, Integer Room, String RoomType, String BedType, Integer PhoneNumber, Integer Checkin, Integer Checkout) {

    }
    {
        this.setName(Name);
        this.setRoom(Room);
        this.setRoomType(RoomType);
        this.setBedType(BedType);
        this.setPhoneNumber(PhoneNumber);
        this.setCheckin(Checkin);
        this.setCheckout(Checkout);
}
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setRoom(Integer Room) {
        this.Room = Room;
    }
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }
    public void setBedType(String BedType) {
        this.BedType = BedType;
    }
    public void setPhoneNumber(Integer PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public void setCheckin(Integer Checkin) {
        this.Checkin = Checkin;
    }
    public void setCheckout(Integer Checkout) {
        this.Checkout = Checkout;
    }

    public String getName() {
        return this.Name;
    }
    public Integer getRoom() {
        return this.Room;
    }
    public String getRoomType() {
        return this.RoomType;
    }
    public String getBedType() {
        return this.BedType;
    }
    public Integer getPhoneNumber() {
        return this.PhoneNumber;
    }
    public Integer getCheckin() {
        return this.Checkin;
    }
    public Integer getCheckout() {
        return this.Checkout;
    }

    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Room No : " + this.getRoom());
        System.out.println("Room Type: " + this.getRoomType());
        System.out.println("Bed Type: " + this.getBedType());
        System.out.println("Phone Number : " + this.getPhoneNumber());
        System.out.println("Check In : " + this.getCheckin());
        System.out.println("Check Out : " + this.getCheckout());





    }

    public void setPhoneNumber(String next) {
    }

    public void setCheckin(String next) {
    }

    public void setCheckout(String next) {
    }
}

