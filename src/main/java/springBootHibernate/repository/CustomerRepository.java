package springBootHibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import springBootHibernate.domain.Customer;

/**
 * Interface repository that extends JpaRepository
 * @author Javier Sanz García
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	/**
	 * @param userid: param user in the query
	 * @return Object Customer: row from table Customer of database
	 */
	@Query("SELECT u FROM Customer u WHERE u.id = :userid")
	public Customer findById(@Param(value = "userid") Integer userid);

	/**
	 * @param username: param user in the query
	 * @return List of Objects Customer: rows from table Customer of database
	 */
	@Query("Select c from Customer c where c.name like %:username%")
	public List<Customer> findByName(@Param(value = "username") String username);
	
	/**
	 * @param useraddress: param user in the query
	 * @return List of Objects Customer: rows from table Customer of database
	 */
	@Query("Select c from Customer c where c.address like %:useraddress%")
	public List<Customer> findByuserAddress(@Param(value = "useraddress") String useraddress);

	/**
	 * @param userphone: param user in the query
	 * @return List of Objects Customer: rows from table Customer of database
	 */
	@Query("Select c from Customer c where c.phone like %:userphone%")
	public List<Customer> findByuserPhone(@Param(value = "userphone") String userphone);

}