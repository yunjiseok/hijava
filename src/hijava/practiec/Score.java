package hijava.practiec;

public class Score {
	private String subject;
	private int score;
	
	
	
	public Score() {
		this.subject = subject;
		this.score = score;
	}
	public Score(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}
	
	

	

}
