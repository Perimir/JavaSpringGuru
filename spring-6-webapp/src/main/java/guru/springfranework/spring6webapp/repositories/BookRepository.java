package guru.springfranework.spring6webapp.repositories;

import guru.springfranework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
