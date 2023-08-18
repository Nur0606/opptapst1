import java.time.LocalDate;

public class Group {
    private String groupName;
    private LocalDate startData;
    private String mentor;

    public Group(String groupName, LocalDate startData, String mentor) {
        this.groupName = groupName;
        this.startData = startData;
        this.mentor = mentor;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getStartData() {
        return startData;
    }

    public void setStartData(LocalDate startData) {
        this.startData = startData;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", startData=" + startData +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}