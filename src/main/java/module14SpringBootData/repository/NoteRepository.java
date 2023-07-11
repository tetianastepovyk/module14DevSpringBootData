package module14SpringBootData.repository;

import module14SpringBootData.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import module14SpringBootData.entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}