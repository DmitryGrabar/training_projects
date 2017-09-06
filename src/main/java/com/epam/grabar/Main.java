package com.epam.grabar;

import com.epam.grabar.entity.Room;
import com.epam.grabar.service.RoomService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        RoomService service = context.getBean(RoomService.class);
        List<Room> list = service.searchRooms();
        for (Room elem : list) {
            System.out.println("number " + elem.getNumber() + " price: " + elem.getPrice() + " capacity: " + elem.getCapacity());
        }
    }
}
