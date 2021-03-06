package edms.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 李重辰
 */
public class Employee {

  private Integer id;
  private String lastName;

  private String email;
  /**
   * 1 male, 0 female
   */
  private Integer gender;
  private Department department;
  /**
   * 对前台传入的日期格式进行格式化，可以在实体类的属性上使用DateTimeFormat进行设置，或者在SpringBoot的配置文件中进行配置
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birth;

  public Employee(Integer id, String lastName, String email, Integer gender,
                  Department department) {
    super();
    this.id = id;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = new Date();
  }

  public Employee() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        ", department=" + department +
        ", birth=" + birth +
        '}';
  }

}
