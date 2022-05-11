public class Room {
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }
    public RoomType getRoomType() {
        return roomType;
    }

}
