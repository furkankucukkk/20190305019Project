
public class SetName extends Account{

    private Integer Room;

    public void SetRoom(Integer Room) {
        this.Room = Room;
    }
    public Integer getRoom() {
        return this.Room;
    }
    public void display()
    {
        System.out.println("Room No. :" + this.getRoom());
    }


    public void setRoom(String next) {
    }
}
