import java.util.Arrays;

public class Company {
  private String companyName;
  private String ctrana;
  private int gotAsnavania;
  private String asnovatel;
  private Group[] groups;

  public Company(String companyName, String ctrana, int gotAsnavania, String asnovatel) {
    this.companyName = companyName;
    this.ctrana = ctrana;
    this.gotAsnavania = gotAsnavania;
    this.asnovatel = asnovatel;
    this.groups = groups;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCtrana() {
    return ctrana;
  }

  public void setCtrana(String ctrana) {
    this.ctrana = ctrana;
  }

  public int getGotAsnavania() {
    return gotAsnavania;
  }

  public void setGotAsnavania(int gotAsnavania) {
    this.gotAsnavania = gotAsnavania;
  }

  public String getAsnovatel() {
    return asnovatel;
  }

  public void setAsnovatel(String asnovatel) {
    this.asnovatel = asnovatel;
  }

  public Group[] getGroups() {
    return groups;
  }

  public void setGroups(Group[] groups) {
    this.groups = groups;
  }

  @Override
  public String toString() {
    return "Company{" +
            "companyName='" + companyName + '\'' +
            ", ctrana='" + ctrana + '\'' +
            ", gotAsnavania=" + gotAsnavania +
            ", asnovatel='" + asnovatel + '\'' +
            ", groups=" + Arrays.toString(groups) +
            '}';
  }
}
