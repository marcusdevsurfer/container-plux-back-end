package com.devcoast.containerplux.service;

import com.devcoast.containerplux.model.Container;
import com.devcoast.containerplux.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerService {
    @Autowired
    ContainerRepository containerRepository;
    public List<Container> getAllContainers(){
        return containerRepository.findAll();
    }

    //TODO : Agregar metodo de servicio para agregar contenedor

    public Container saveContainer(Container container){
        containerRepository.save(container);
        return container;
    }

}
