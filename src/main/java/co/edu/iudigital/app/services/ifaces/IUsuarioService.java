package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.request.UsuarioDTORequest;
import co.edu.iudigital.app.dtos.response.UsuarioDTO;
import co.edu.iudigital.app.exceptions.RestException;
import co.edu.iudigital.app.models.Usuario;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioDTO> consultarTodos();

    UsuarioDTO consultarPorId(Long id);

    UsuarioDTO consultarPorUsername(String username);

    UsuarioDTO guardar(UsuarioDTORequest usuarioDTORequest) throws RestException;

    Usuario findByUsername(String username);

    UsuarioDTO userInfo(Authentication authentication) throws RestException;

    Usuario actualizar(Usuario usuario) throws RestException;
}