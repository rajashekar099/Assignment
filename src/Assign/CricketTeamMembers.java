package Assign;

public class CricketTeamMembers {
	
		private int RankingNumber;
		private String Name;
		private int ScoreRuns;
		private String PlayerType;
		
		public static void main(String[] args) {
			CricketTeamMembers TeamMember = new CricketTeamMembers();
			
			TeamMember.setRankingNumber(10);
			TeamMember.setName("Dhoni");
			TeamMember.setScoreRuns(8000);
			TeamMember.setPlayerType("Weeketkeeper");
			System.out.println("----------------------------");
			System.out.println(TeamMember.getRankingNumber());
			System.out.println(TeamMember.getName());
			System.out.println(TeamMember.getScoreRuns());
			System.out.println(TeamMember.getPlayerType());
			System.out.println("----------------------------");
			TeamMember.setRankingNumber(11);
			TeamMember.setName("Virat");
			TeamMember.setScoreRuns(6000);
			TeamMember.setPlayerType("Batsman");
			System.out.println("----------------------------");
			System.out.println(TeamMember.getRankingNumber());
			System.out.println(TeamMember.getName());
			System.out.println(TeamMember.getScoreRuns());
			System.out.println(TeamMember.getPlayerType());
			System.out.println("----------------------------");
			
			TeamMember.setRankingNumber(1131);
			TeamMember.setName("Jadeja");
			TeamMember.setScoreRuns(3000);
			TeamMember.setPlayerType("allRounder");
			System.out.println("----------------------------");
			System.out.println(TeamMember.getRankingNumber());
			System.out.println(TeamMember.getName());
			System.out.println(TeamMember.getScoreRuns());
			System.out.println(TeamMember.getPlayerType());
			System.out.println("----------------------------");
		}
		public int getRankingNumber() {
			return RankingNumber;
		}
		public void setRankingNumber(int rankingNumber) {
			RankingNumber = rankingNumber;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getScoreRuns() {
			return ScoreRuns;
		}
		public void setScoreRuns(int scoreRuns) {
			ScoreRuns = scoreRuns;
		}
		public String getPlayerType() {
			return PlayerType;
		}
		public void setPlayerType(String playerType) {
			PlayerType = playerType;
		}
		
}