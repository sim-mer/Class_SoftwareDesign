package One.Realtor.domain;

public class Checklist {
	private int checkIndex;
	private int score;
	private int UserId;

	public Checklist(int checkIndex, int score, int userId) {
		this.checkIndex = checkIndex;
		this.score = score;
		UserId = userId;
	}

	public int getCheckIndex() {
		return checkIndex;
	}

	public void setCheckIndex(int checkIndex) {
		this.checkIndex = checkIndex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}
}
