package in.sujatajadhav.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujatajadhav.onlinebookstore.entity.Book;


public interface BookRepository extends JpaRepository<Book,Long> {

}
