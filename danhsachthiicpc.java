import java.util.*;

class Team{
    String teamID;
    String teamName;
    String truong;

    Team(String teamID,String teamName,String truong){
        this.teamID=teamID;
        this.teamName=teamName;
        this.truong=truong;
    }
}

class ThiSinh implements Comparable<ThiSinh>{
    String thiSinhID;
    String fullName;
    String teamID;

    ThiSinh(String thiSinhID,String fullName,String teamID){
        this.thiSinhID=thiSinhID;
        this.fullName=fullName;
        this.teamID=teamID;
    }

    @Override
    public int compareTo(ThiSinh other){
        return this.fullName.compareTo(other.fullName);
    }
}

public class danhsachthiicpc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String, Team> teams=new HashMap<>();
        for(int i=1;i<=n;i++){
            String teamID=String.format("Team%02d",i);
            String teamName=sc.nextLine();
            String truong=sc.nextLine();
            teams.put(teamID, new Team(teamID,teamName,truong));
        }
        int m=sc.nextInt();
        sc.nextLine();
        List<ThiSinh> thisinh=new ArrayList<>();
        for(int i=1;i<=m;i++){
            String thisinhID=String.format("C%03d",i);
            String fullName=sc.nextLine();
            String teamID=sc.nextLine();
            thisinh.add(new ThiSinh(thisinhID,fullName,teamID));
        }
        Collections.sort(thisinh);
        for(ThiSinh s:thisinh){
            Team team=teams.get(s.teamID);
            System.out.println(s.thiSinhID);
            System.out.println(s.fullName);
            System.out.println(team.teamName);
            System.out.println(team.truong);
        }
    }
}
