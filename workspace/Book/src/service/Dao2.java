package service;

import java.util.ArrayList;

import vo.BookVO;
import vo.Customer;

public interface Dao2 {
	void con();

	void discon();

	void Customerinsert(Customer b);

	Customer Cusselect(String id);

	void Cusupdate(Customer b);

	void Cusdelete(String name);

	ArrayList selectAll();
}
