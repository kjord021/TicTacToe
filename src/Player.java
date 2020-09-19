
public class Player {

	private boolean m_isTurn;
	private String m_type;
	
	public Player(boolean isTurn, String type) {
		m_isTurn = isTurn;
		m_type = type;
	}
	
	public boolean isPlayerTurn() {
		return m_isTurn;
	}
	
	public void changeTurn(boolean isTurn) {
		m_isTurn = isTurn;
	}
	
	public String playerType() {
		return m_type;
	}
	
}
