package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.dtos.DelitoDTORequest;

import java.util.List;

public interface IDelitoService {

    List<DelitoDTO> getAll(); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    DelitoDTO save(DelitoDTORequest request); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    DelitoDTO getById(Long id); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    void deleteById(Long id);// TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS
}