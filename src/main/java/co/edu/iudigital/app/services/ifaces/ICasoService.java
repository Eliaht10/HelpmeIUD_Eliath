package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.exceptions.RestException;
import co.edu.iudigital.app.models.Caso;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> consultarTodos();

    //Crear caso mdfd
    Caso crear(CasoDTO casoDTO) throws RestException;

    Boolean visible(Boolean visible, Long id);

    CasoDTO consultarPorId(Long id);
}