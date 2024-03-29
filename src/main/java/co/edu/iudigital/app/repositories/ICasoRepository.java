package co.edu.iudigital.app.repositories;
import co.edu.iudigital.app.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICasoRepository
        extends JpaRepository<Caso, Long> {

    @Query("UPDATE Caso c SET c.esVisible=?1 WHERE id=?2")
    Boolean setVisible(Boolean visible, Long id);
}