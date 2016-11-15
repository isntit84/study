package service;

import vo.BookVO;
import vo.Customer;

public class CustomerService {
	private Dao2 dao2;

	public CustomerService() {
		dao2 = new CusDAO();
	}

	public void Customerinsert(Customer b) {
		dao2.Customerinsert(b);
	}

	public void printAll() {
		System.out.println(dao2.selectAll());
	}

	public Customer findCustomer(String name) {
		return dao2.Cusselect(name);

	}

	public void deleteCus(String name) {
		dao2.Cusdelete(name);
	}

	public void Cusupdate(Customer b) {
		dao2.Cusupdate(b);
	}
}
