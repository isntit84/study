package test;

import java.io.IOException;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import service.Input;
import service.SchoolService;

public class TestSchoolService {

	public static void main(String[] args) {

		SchoolService service = new SchoolService();

		Input input = new Input();

	
	
			try {
				input.startMenu();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (DuplicateTelException e) {
				e.printStackTrace();
			} catch (PersonNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
