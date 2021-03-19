import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {

	private String firstName;

	private String lastName;

	private String country;

	
	private String number;
	
	private String course;
	
	public void validate(javax.faces.context.FacesContext facesContext, javax.faces.component.UIComponent component, java.lang.Object value) throws ValidatorException{
		
		if(value==null) {
			return ;
			
		}
		
		if(!value.toString().startsWith("LUV")) {
			FacesMessage facesMessage=new FacesMessage("Course should starew ih");
			throw new ValidatorException(facesMessage);
		}
		
	}
	
	
	
	
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	private List<String> countryOption;

	public Student() {
		countryOption = new ArrayList<String>();
		countryOption.add("Canada");
		countryOption.add("Singapore");

	}

	public List<String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(List<String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
