package springBootHibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class to interactuate with table Customer of Database (Pojo File)
 * @author Javier Sanz García
 *
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String phone;
	private String address;

	/**
	 * Default Constructor
	 */
	public Customer() {
		super();
	}

	/**
	 * Customer Constructor
	 * 
	 * @param id: Customer Id or numeric value
	 * @param name: Customer name
	 * @param phone: Customer phone
	 * @param address: Customer address
	 */
	public Customer(int id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * Method to get value of field id
	 * @return id: Customer Id or numeric value
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Method to set value of field id
	 * @param id: Customer Id or numeric value
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Method to get value of field name
	 * @return name: Customer name value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set value of field name
	 * @param name: Customer name value
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to get value of field phone
	 * @return phone: Customer phone value
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Method to set value of field phone
	 * @param phone: Customer phone value
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Method to get value of field address
	 * @return address: Customer address value
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method to set value of field address
	 * @param address: Customer address value
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}