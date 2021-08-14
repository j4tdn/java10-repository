package persistence;

import java.sql.Time;

public class ItemmDto {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String TIME_ORDER = "timeOrder";

    private Integer id;
    private String name;
    private Time timeOrder;

    public ItemmDto() {

    }

    public ItemmDto(Integer id, String name, Time timeOrder) {
        this.id = id;
        this.name = name;
        this.timeOrder = timeOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Time timeOrder) {
        this.timeOrder = timeOrder;
    }

    @Override
    public String toString() {
        return "ItemDto [id=" + id + ", name=" + name + ", timeOrder=" + timeOrder + "]";
    }

}
