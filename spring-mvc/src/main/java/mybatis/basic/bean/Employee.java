package mybatis.basic.bean;

import java.io.Serializable;

/**
 * @author 李重辰
 * @date 2019/2/18 15:32
 */
public class Employee implements Serializable {

  private static final long serialVersionUID = -2101711165167738656L;
  private Integer id;
  private String empName;
  private String gender;
  private String email;
  private Department department;

  public Employee() {
  }

  public Employee(Integer id, String empName, String gender, String email) {
    this.id = id;
    this.empName = empName;
    this.gender = gender;
    this.email = email;
  }

  public Employee(Integer id, String empName, String gender, String email, Department department) {
    this.id = id;
    this.empName = empName;
    this.gender = gender;
    this.email = email;
    this.department = department;
  }

  public Employee(String empName, String gender, String email, Department department) {
    this.empName = empName;
    this.gender = gender;
    this.email = email;
    this.department = department;
  }

  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getempName() {
    return empName;
  }

  public void setempName(String empName) {
    this.empName = empName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", empName='" + empName + '\'' +
        ", gender='" + gender + '\'' +
        ", email='" + email + '\'' +
        ", department=" + department +
        '}';
  }
}
