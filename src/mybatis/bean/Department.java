package mybatis.bean;

/**
 * @author 李重辰
 * @date 2019/3/2 17:56
 */
public class Department {
  private Integer id;
  private String name;

  public Department(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Department{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}