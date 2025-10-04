package com.omeracar.services.impl;

import com.omeracar.dto.DtoHome;
import com.omeracar.dto.DtoRoom;
import com.omeracar.entities.Home;
import com.omeracar.entities.Room;
import com.omeracar.repository.HomeRepository;
import com.omeracar.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    public DtoHome findHomeById(Long id){
        Optional<Home> optional =homeRepository.findById(id);
        DtoHome dtoHome=new DtoHome();

        if (optional.isEmpty()){
            return null;
        }
        Home dbHome=optional.get();
        List<Room> dbRooms=optional.get().getRoom();

        BeanUtils.copyProperties(dbHome,dtoHome);
        if (dbRooms!=null && !dbRooms.isEmpty()){
            for (Room room:dbRooms){
                DtoRoom dtoRoom=new DtoRoom();
                BeanUtils.copyProperties(room,dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }
        return dtoHome;



    }

}
