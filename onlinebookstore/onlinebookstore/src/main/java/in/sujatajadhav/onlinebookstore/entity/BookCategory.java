package in.sujatajadhav.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@Entity 
@Table(name="tbl_category")
@Setter
@Getter
@ToString

@NoArgsConstructor
@RestResource
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookCategory {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	//@JoinColumn(name="book_Set",referencedColumnName="id")
	private Set<Book> book;
	
	//targetEntity =Book.class, 
	//, fetch = FetchType.LAZY
}
